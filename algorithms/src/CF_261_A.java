import java.util.Scanner;

public class CF_261_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();

		if (x1 == x2) {
			int l = Math.abs(y1 - y2);
			if (x1 + l > 1000) {
				if (x1 - l < 1000) {
					System.out.println("-1");
					return;
				} else {
					System.out.println((x2 - l) + " " + y2 + " " + (x1 - l)
							+ " " + y1);
					return;
				}
			} else {
				System.out.println((x2 + l) + " " + y2 + " " + (x1 + l) + " "
						+ y1);
				return;
			}
		}

		if (y1 == y2) {
			int l = Math.abs(x1 - x2);
			if (y1 + l > 1000) {
				if (y1 - l < 1000) {
					System.out.println("-1");
					return;
				} else {
					System.out.println(x2 + " " + (y2 - l) + " " + x1 + " "
							+ (y1 - l));
					return;
				}
			} else {
				System.out.println(x2 + " " + (y2 + l) + " " + x1 + " "
						+ (y1 + l));
				return;
			}
		}

		if(Math.abs(x1-x2) == Math.abs(y1-y2)){
			System.out.println(x1 + " " + y2 + " " + x2 + " "
					+ y1);
			return;
		} else {
			System.out.println("-1");
			return;
		}
	}

}
