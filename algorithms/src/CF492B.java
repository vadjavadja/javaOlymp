import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class CF492B {

	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));

	static int nextInt() throws IOException {
		in.nextToken();
		return (int) in.nval;
	}

	public static void main(String[] args) throws IOException {
		int n = nextInt();
		int l = nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		Arrays.sort(a);
		double d = Math.max(a[0], l - a[n - 1]);
		for (int i = 1; i < n; i++) {
			double r = (double) (a[i] - a[i - 1]) / 2;
			d = Math.max(r, d);
		}

		System.out.println(d);

	}

}
