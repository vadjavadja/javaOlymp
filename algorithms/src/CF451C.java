import java.util.Scanner;

public class CF451C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int ii = 0; ii < t; ii++) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int d1 = scan.nextInt();
			int d2 = scan.nextInt();
			if (n % 3 != 0) {
				System.out.println("no");
				continue;
			}
			int left = n - k;
			int x1 = d1;
			int x2 = 0;
			int x3 = d2;

			for (int i = 0; i < left; i++) {
				if (x1 <= x2 && x1 <= x3)
					x1++;
				else if (x2 <= x1 && x2 <= x3)
					x2++;
				else
					x3++;
			}
			
			if (x1==x2 && x1==x3) System.out.println("yes");
			else System.out.println("no");

		}

	}

}
