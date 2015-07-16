import java.util.Scanner;

public class CF288B {

	private static boolean isEven(char c) {
		return c == '2' || c == '4' || c == '6' || c == '8' || c == '0';
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char c[] = s.toCharArray();
		int l = s.length();
		int lastEven = -1;
		if (isEven(c[l-1])) {
			System.out.println(-1);
			return;
		}
		for (int i = 0; i < l; i++) {
			if (isEven(c[i])) {
				lastEven = i;
				if (c[i] < c[l - 1]) {
					char t = c[i];
					c[i] = c[l - 1];
					c[l - 1] = t;
					System.out.println(c);
					return;
				}
			}
		}
		if (lastEven < 0)
			System.out.println(-1);
		else {
			char t = c[lastEven];
			c[lastEven] = c[l - 1];
			c[l - 1] = t;
			System.out.println(c);
		}

	}
}
