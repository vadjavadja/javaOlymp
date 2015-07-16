import java.util.Scanner;

public class CF288A {

	private static void f() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		boolean s[][] = new boolean[n][m];
		for (int i = 0; i < k; i++) {
			int x = scan.nextInt() - 1;
			int y = scan.nextInt() - 1;
			if (!s[x][y]) {
				s[x][y] = true;
				if ((x + 1 < n && y + 1 < m && s[x][y + 1] && s[x + 1][y] && s[x + 1][y + 1])
						|| (y - 1 >= 0 && x + 1 < n && s[x][y - 1]
								&& s[x + 1][y] && s[x + 1][y - 1])
						|| (y - 1 >= 0 && x - 1 >= 0 && s[x][y - 1]
								&& s[x - 1][y] && s[x - 1][y - 1])
						|| (y + 1 < m && x - 1 >= 0 && s[x][y + 1]
								&& s[x - 1][y] && s[x - 1][y + 1])) {
					System.out.println(i + 1);
					return;
				}
			}
		}
		System.out.println(0);

	}

}
