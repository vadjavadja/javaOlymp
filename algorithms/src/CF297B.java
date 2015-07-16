import java.util.Arrays;
import java.util.Scanner;

public class CF297B {

	/**
	 * @param args
	 */
	static char s[];
	static int l;

	static void swap(int i) {
		char t = s[i];
		s[i] = s[l - i - 1];
		s[l - i - 1] = t;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine().toCharArray();
		l = s.length;
		int lh = l / 2;
		int m = scan.nextInt();
		boolean a[] = new boolean[lh];
		Arrays.fill(a, false);
		for (int i = 0; i < m; i++) {
			int t = scan.nextInt() - 1;
			a[t] = !a[t];
		}
		for (int i = 0; i < lh; i++) {
			if (a[i])
				swap(i);
			if (i + 1 < lh)
				a[i + 1] ^= a[i];
		}
		for (char c : s) {
			System.out.print(c);
		}

	}
}
