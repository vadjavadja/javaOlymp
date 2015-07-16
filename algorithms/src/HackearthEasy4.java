import java.util.Arrays;
import java.util.Scanner;

public class HackearthEasy4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		label: for (int tests = 0; tests < t; tests++) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int boys[] = new int[m];
			int girls[] = new int[n];
			for (int i = 0; i < m; i++)
				boys[i] = scan.nextInt();
			for (int i = 0; i < n; i++)
				girls[i] = scan.nextInt();
			Arrays.sort(boys);
			Arrays.sort(girls);
			for (int i = 0; i < m; i++) {
				if (i >= n || boys[i] <= girls[i]) {
					System.out.println("NO");
					continue label;
				}
			}
			System.out.println("YES");
		}
	}

}
