import java.util.Arrays;
import java.util.Scanner;

public class bayanC {

	/**
	 * @param args
	 */

	private static boolean allZero(int a[]) {
		for (int i : a) {
			if (i!=0) return false;
		}
		return true;
	}
	
	private static int getMin(int a[]) {
		int min = 999999;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] < min) {
				min = a[i];
			}
		}
		if (min == 999999)
			return 0;
		return min;
	}

	private static int checkP(int h[], int v[]) {
		boolean isFnd = false;
		int minH = 0;
		int minV = 0;
		for (int i = 0; i < h.length - 1; i++) {
			if (h[i] == 0 || h[i] == h[i + 1] || h[i + 1] == 0) {
			} else {
				return -1;
			}
		}
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] == 0 || v[i] == v[i + 1] || v[i + 1] == 0) {
			} else {
				return -1;
			}
		}
		return Math.min(getMin(h), getMin(v));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		char a[][] = new char[n][m];
		int h[] = new int[n - 1];
		int v[] = new int[m - 1];
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLine().toCharArray();
		}

		boolean isOk = true;
		boolean isTotalFnd = false;
		label: for (int j = 0; j < m; j++) {
			boolean isFnd = false;
			boolean isLost = false;
			int cur = 0;
			for (int i = 0; i < n; i++) {
				if (a[i][j] == 'X' && !isFnd) {
					if (j > 0 && a[i][j - 1] == '.' && isTotalFnd) {
						isOk = false;
						break label;
					}
					isTotalFnd = true;
					isFnd = true;
				}
				if (a[i][j] == '.' && isFnd) {
					isLost = true;
				}
				if (a[i][j] == 'X' && isLost) {
					isOk = false;
					break label;
				}

				if (j > 0 && a[i][j] == 'X' && a[i][j - 1] == 'X') {
					v[j - 1]++;
				}
			}

		}

		if (!isOk) {
			System.out.println("-1");
			return;
		}

		for (int i = 1; i < n; i++) {
			int cur = 0;
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 'X' && a[i - 1][j] == 'X') {
					h[i - 1]++;
				}
				if (a[i][j] == 'X' && a[i - 1][j] == '.' && cur > 0) {
					continue;
				}
			}
		}
		// System.out.println(Arrays.toString(h));
		// System.out.println(Arrays.toString(v));

		
		if (allZero(h) || allZero(v)){
			System.out.println("1");
			return;
		}
		int ret = checkP(h, v);
		if (ret > 0) {
			System.out.println(ret);
			return;
		}
		int minH = getMin(h);
		int minV = getMin(v);
	
		for (int i = 0; i < n-minV; i++) {
			for (int j = 0; j < m-minH; j++) {
				if (a[i][j+minH]=='X' && a[i+minV][j]=='X'){
					System.out.println("-1");
					return;
				}
			}
		}
		
		System.out.println(""+minH*minV);
		
	}
}
