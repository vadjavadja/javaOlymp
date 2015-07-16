import java.util.Scanner;

public class CF71A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String s = scan.nextLine();
			int l = s.length();
			if (l > 10)
				System.out.println(s.charAt(0) + Integer.toString(l - 2)
						+ s.charAt(l - 1));
			else
				System.out.println(s);
		}

	}

}
