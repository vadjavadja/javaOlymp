import java.util.Arrays;
import java.util.Scanner;

public class bayanB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		char a[] = new char[n];
		char b[] = new char[m];
		scan.nextLine();
		String s = scan.nextLine();
		a = s.toCharArray();
		s = scan.nextLine();
		b = s.toCharArray();

		String str = "" + a[0] + "" + b[0] + "" + a[n - 1] + "" + b[m - 1];

		if (str.equals("<v>^") || str.equals(">^<v")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
