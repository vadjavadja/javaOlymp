import java.util.Scanner;

public class CF287C {

	static long n;
	static long count;

	private static long twoPow(long p) {
		return ((long) 1) << (p);
	}

	private static void solve(long h, boolean isLeft) {
		if (h==0) return;
		if ((isLeft && twoPow(h - 1) < n) || (!isLeft && twoPow(h - 1) >= n)) {
			count += twoPow(h) - 1;
			isLeft = !isLeft;
		}
		count++;
		if (n > twoPow(h - 1))
			n -= twoPow(h - 1);
		//System.out.println(count);
		solve(h - 1, !isLeft);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long h = scan.nextInt();
		count = 0;
		n = scan.nextLong();
		solve(h, true);
		System.out.println(count);

	}
}
