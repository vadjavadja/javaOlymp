import java.util.Arrays;
import java.util.Scanner;

public class CF_262_C {

	private static long min(long[] a) {
		long min = a[0];
		for (int ktr = 0; ktr < a.length; ktr++) {
			if (a[ktr] < min) {
				min = a[ktr];
			}
		}
		return min;
	}

	private static int posFirst(long[] a, long b, int s, int f) {
		for (int ktr = s; ktr < a.length && ktr <= f; ktr++) {
			if (a[ktr] == b) {
				return ktr;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int w = scan.nextInt();

		long a[] = new long[(int) n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		long aMin = min(a);
		int p = posFirst(a, aMin, 0, a.length - 1);
		for (int i = 0; i < m; i++) {
			int s = (p + w) < n ? p : n - w;
			for (int j = s; j < s + w && j < n; j++) {
				a[j]++;
			}
			//System.out.println(Arrays.toString(a));
			p = posFirst(a, aMin, s + w, a.length - 1);
			if (p < 0) {
				aMin++;
				p = posFirst(a, aMin, 0, a.length - 1);
			}
		}
		System.out.println(min(a));
	}

}
