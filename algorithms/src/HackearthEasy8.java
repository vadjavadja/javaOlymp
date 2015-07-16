import java.util.HashSet;
import java.util.Scanner;

public class HackearthEasy8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			HashSet<Integer> differentTypes = new HashSet<>();
			for (int i = 0; i < n; i++) {
				int a = scan.nextInt();
				differentTypes.add(a);
			}
			int d = differentTypes.size() - x;
			String answ = "Perfect husband";
			if (d > 0) {
				answ = "Lame husband";
			} else if (d < 0) {
				answ = "Bad husband";
			}
			System.out.println(answ);

		}

	}

}
