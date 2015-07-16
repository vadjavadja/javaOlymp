import java.util.Scanner;

public class CF452B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		if (n == 0) {
			System.out.println("0 1");
			System.out.println("0 " + m);
			System.out.println("0 0");
			System.out.println("0 " + (m - 1));
			return;
		}
		if (m == 0) {
			System.out.println("1 0");
			System.out.println(n + " 0");
			System.out.println("0 0");
			System.out.println((n - 1) + " 0");
			return;
		}
		System.out.println(n + " " + m);
		System.out.println("0 0");
		System.out.println("0 " + m);
		System.out.println(n + " 0");

	}

}
