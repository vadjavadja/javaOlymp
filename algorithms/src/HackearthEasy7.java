import java.util.Scanner;

public class HackearthEasy7 {

	private static long swapCount(char[] s, char ch) {
		long swapCount = 0;
		int chLeft = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] == ch)
				swapCount += chLeft;
			else
				chLeft++;
		}
		return swapCount;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for (int tests = 0; tests < t; tests++) {
			String str = scan.nextLine();
			char s[] = str.toCharArray();
			System.out.println(Math.min(swapCount(s, 'O'), swapCount(s, 'Z')));

		}
	}
}
