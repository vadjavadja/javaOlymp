import java.util.Scanner;

public class CF287B {
	private static double dist2(long x1, long y1, long x2, long y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long r = scan.nextLong();
		long x = scan.nextLong();
		long y = scan.nextLong();
		long xs = scan.nextLong();
		long ys = scan.nextLong();
		if (x == xs && y == ys) {
			System.out.println(0);
			return;
		}
		double d = dist2(x, y, xs, ys);
		long answ = (long) Math.floor((d / (2 * r)));
		double left = d - answ * 2 * r;
		if (left == r)
			answ++;
		else if (left != 0)
			answ += 1;

		System.out.println(answ);

	}

}
