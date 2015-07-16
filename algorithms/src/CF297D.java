import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CF297D {

	static boolean a[][];
	static char c[][];

	static int maxi = 0;
	static int maxj = 0;
	static int mini = 0;
	static int minj = 0;

	static int n = 0;
	static int m = 0;

	private static void fillArea(int i, int j) {
		maxi = -1;
		maxj = -1;
		mini = 10000000;
		minj = 10000000;

		Queue<ArrayList<Integer>> PointsLeft = new LinkedList<ArrayList<Integer>>();
		ArrayList<Integer> pair = new ArrayList<Integer>();
		pair.add(i);
		pair.add(j);
		PointsLeft.offer(pair);

		while (!PointsLeft.isEmpty()) {
			ArrayList<Integer> p = PointsLeft.poll();
			int x = p.get(0);
			int y = p.get(1);
			a[x][y] = false;
			maxi = Math.max(x, maxi);
			maxj = Math.max(y, maxj);
			mini = Math.min(x, mini);
			minj = Math.min(y, minj);
			if (y + 1 < m && a[x][y + 1]) {
				a[x][y + 1] = false;
				ArrayList<Integer> nextPair = new ArrayList<Integer>();
				nextPair.add(x);
				nextPair.add(y + 1);
				PointsLeft.offer(nextPair);
			}
			if (x + 1 < n && a[x + 1][y]) {
				a[x + 1][y] = false;
				ArrayList<Integer> nextPair = new ArrayList<Integer>();
				nextPair.add(x + 1);
				nextPair.add(y);
				PointsLeft.offer(nextPair);
			}
			if (y - 1 >= 0 && a[x][y - 1]) {
				a[x][y - 1] = false;
				ArrayList<Integer> nextPair = new ArrayList<Integer>();
				nextPair.add(x);
				nextPair.add(y - 1);
				PointsLeft.offer(nextPair);
			}
			if (x - 1 >= 0 && a[x - 1][y]) {
				a[x - 1][y] = false;
				ArrayList<Integer> nextPair = new ArrayList<Integer>();
				nextPair.add(x - 1);
				nextPair.add(y);
				PointsLeft.offer(nextPair);
			}

		}
		return;
	}

	static void ac() {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {
				a[i][k] = c[i][k] == '.';
			}
		}

	}

	static boolean wd() {
		boolean was = false;
		for (int i = mini; i <= maxi; i++) {
			for (int j = minj; j <= maxj; j++) {
				if (c[i][j] == '*') {
					c[i][j] = '.';
					was = true;
				}
			}
		}

		return was;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();

		a = new boolean[n][m];
		c = new char[n][m];
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			char s[] = scan.nextLine().toCharArray();
			for (int j = 0; j < m; j++) {
				c[i][j] = s[j];
			}
		}

		ac();
		boolean was = true;
		while (was) {
			was = false;
			label: for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (a[i][j]) {
						fillArea(i, j);
						if (wd()) {
							was = true;
							ac();
						}
					}
				}
			}

		}

		for (char[] s : c) {
			for (char c : s) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}
}
