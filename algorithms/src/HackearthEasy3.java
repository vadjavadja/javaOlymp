import java.util.Scanner;

public class HackearthEasy3 {

	private static int countChar(char s[], char c, int from, int to) {
		int count = 0;
		for (int i = from; i <= to; i++)
			if (s[i] == c)
				count++;
		return count;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for (int tests = 0; tests < t; tests++) {
			String s = scan.nextLine();

			int len = s.length();
			char c[] = s.toCharArray();

			int sum = 0;
			int beg = 0;

			int bestSum = 0;
			int bestBeg = 0;
			int bestEnd = 0;

			int i = 0;

			while (i < len && c[i] == 'R')
				i++;
			if (i==len){
				System.out.println(len-1);
				continue;
			}
			for (; i < len; i++) {
				if (c[i] == 'K' && sum <= 0) {
					beg = i;
					sum = 0;
				}
				if (c[i] == 'R') {
					sum--;
				} else if (c[i] == 'K') {
					sum++;
				}
				if (bestSum < sum) {
					bestSum = sum;
					bestBeg = beg;
					bestEnd = i;
				}

			}
			int max = 0;
			max += countChar(c, 'R', 0, bestBeg - 1);
			max += countChar(c, 'K', bestBeg, bestEnd);
			max += countChar(c, 'R', bestEnd + 1, len - 1);

			System.out.println(max);
		}
	}

}
