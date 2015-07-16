import java.util.Scanner;

public class CF452A {

	private static String check(String s, int l) {
		String p[] = { "vaporeon", "jolteon", "flareon", "espeon", "umbreon",
				"leafeon", "glaceon", "sylveon" };
		label: for (String str : p) {
			if (str.length() == l) {
				for (int i = 0; i < l; i++) {
					if (s.charAt(i) != '.' && s.charAt(i) != str.charAt(i)) {
						continue label;
					}
				}
				return str;
			}
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		System.out.println(check(s, l));

	}

}
