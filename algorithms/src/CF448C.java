import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CF448C {

	private static int getMin(int[] a, int l, int r) {
		int min = Integer.MAX_VALUE;
		for (int i = l; i <= r; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}

	private static int f(int[] a, int l, int r, int h) {
		//System.out.println(l+" "+r+" "+h);
		int c = 0;
		int min = getMin(a, l, r);
		//System.out.println(min);
		c += min - h;
		int lt = -1;
		boolean isHigher = false;
		for (int i = l; i <= r; i++) {
			if (a[i] > min && !isHigher){
				lt = i;
				isHigher = true;
			}
			if (a[i] == min && isHigher) {
				c += f(a, lt, i - 1, min);
				isHigher = false;
			}
		}
		if (isHigher) c += f(a, lt, r, min);
		
		if ((r - l + 1) <= c)
			return r - l + 1;
		return c;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan;
		// scan = new Scanner(new File("test.txt"));
		scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		System.out.println(f(a, 0, n - 1, 0));
	}

}
