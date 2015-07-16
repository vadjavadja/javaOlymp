import java.util.Scanner;

public class CF158A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt()-1;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		if (a[k]>0) {
			while (k<n-1 && a[k]==a[k+1]) k++;
		} else {
			while (k>=0 && a[k]==0) k--;
		}
		System.out.println(k+1);
		
	}

}
