import java.util.Arrays;
import java.util.Scanner;

public class CF_261_C {

	static int answ[][];

	private static void f(int n, int k, int d, int st) {
		System.out.println(n+" "+k+" "+d+" "+st);
		int c[] = new int[n];
		int lm = (int) Math.ceil(n / (double) k);
		int nm = (int) Math.floor(n / (double) lm);
		int ii = 0;
		for (int i = 1; i <= nm; i++) {
			if (lm > 1) f(lm, k, d + 1, ii);
			for (int j = 0; j < lm; j++) {
				c[ii++] = i;
			}
		}
		if (lm > 1) f(n - ii, k, d + 1, ii);
		for (int i = ii; i < n; i++) {
			c[i] = k;
		}
		for (int i = 0; i < n; i++) {
			answ[d][i + st] = c[i];
		}
		//p(answ);
		return;
	}

	public static void p(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int d = scan.nextInt();

		int dm = (int) Math.ceil(Math.log(n) / Math.log(k));

		if (dm > d) {
			System.out.println("-1");
			return;
		}

		answ = new int[dm][n];

		f(n, k, 0, 0);

		p(answ);

		for (int i = 0; i < d - dm; i++) {
			for (int j = 0; j < n - 1; j++) {
				System.out.print("1 ");
			}
			System.out.println("1");
		}

	}

}
