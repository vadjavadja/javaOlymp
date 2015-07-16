import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CF287A {

	private static void swap(int a[], int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int a[] = new int[n];
		int ind[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			ind[i] = i + 1;
		}
		
		int m = 0;
		for (int i = 0; i < n - 1; i++) {
			int minI = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[minI]) {
					minI = j;
				}
			}
			swap(a, minI, i);
			swap(ind, minI, i);
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (sum>k){
				break;
			}
			m++;
		}

		System.out.println(m);
		for (int i = 0; i < m; i++) {
			System.out.print(ind[i] + " ");
		}

	}
}
