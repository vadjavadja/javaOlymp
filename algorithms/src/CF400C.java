import java.util.Scanner;

public class CF400C {
	
	public static void clockwise(int[] ai, int[] aj, int m, int n, int p){
		for (int k = 0; k < p; k++) {
			int t = ai[k];
			ai[k] = aj[k];
			aj[k] = n - 1 - t;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int p = scan.nextInt();
		int[] ai = new int[p];
		int[] aj = new int[p];
		for (int k = 0; k < p; k++) {
			ai[k] = scan.nextInt() - 1;
			aj[k] = scan.nextInt() - 1;
		}

		for (int i = 0; i < x % 4; i++) {
			clockwise(ai, aj, m, n, p);
			int tt = n;
			n = m;
			m = tt;
		}

		if (y % 2 == 1) {
			for (int k = 0; k < p; k++) {
				aj[k] = m - 1 - aj[k];
			}
		}

		for (int i = 0; i < (z % 4)*3 % 4; i++) {
			clockwise(ai, aj, m, n, p);
			int tt = n;
			n = m;
			m = tt;
		}
		for (int k = 0; k < p; k++) {
			System.out.println((ai[k] + 1) + " " + (aj[k] + 1));
		}
	}

}
