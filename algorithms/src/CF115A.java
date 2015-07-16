import java.util.Arrays;
import java.util.Scanner;

public class CF115A {

	public static int max(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q[] = new int[n];
		int p[] = new int[n];
		Arrays.fill(q, 0);
		Arrays.fill(p, -1);
		for (int v = 0; v < n; v++) {
			int u = scan.nextInt();
			if (u != -1) {
				p[v] = u - 1;
			}
		}
		for (int v = 0; v < n; v++) {
			//p[v];

		}

		System.out.println(max(q) + 1);

	}

}
