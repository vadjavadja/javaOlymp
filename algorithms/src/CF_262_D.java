import java.util.HashSet;
import java.util.Scanner;

public class CF_262_D {

	private static String l2s(long a) {
		return String.format("%13s", Long.toBinaryString(a)).replace(" ", "0");
	}

	private static long s2l(String s) {
		return Long.parseLong(s, 2);
	}

	private static void p(long a, HashSet<Long> s) {
		System.out.println(a);
		System.out.println(s.size());
		for (Long l : s) {
			System.out.print(l + " ");
		}

	}

	private static long min(long[] a) {
		long min = a[0];
		for (int ktr = 0; ktr < a.length; ktr++) {
			if (a[ktr] < min) {
				min = a[ktr];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long l = scan.nextInt();
		long r = scan.nextInt();
		long k = scan.nextInt();

		if (k == 1) {
			System.out.println(l);
			System.out.println(1);
			System.out.println(l);
			return;
		}
		if (k == 2) {
			if (r - l < 2) {
				if (l < (l ^ r)) {
					System.out.println(l);
					System.out.println(1);
					System.out.println(l);
				} else {
					System.out.println(l ^ r);
					System.out.println(2);
					System.out.println(l + " " + r);
				}

			} else {
				if (l % 2 == 0 && r > l) {
					System.out.println(l ^ (l + 1));
					System.out.println(2);
					System.out.println(l + " " + l + 1);
				} else {
					System.out.println((l + 1) ^ (l + 2));
					System.out.println(2);
					System.out.println((l + 1) + " " + (l + 2));
				}
			}
			return;
		}

		HashSet<Integer> s = new HashSet<>();

		for (long i = l; i <= r; i++) {
			System.out.println(l2s(i));
////			for (long j = 0; j <= r; j++) {
////				for (long q = 0; q <= r; q++) {
////					if (i == (j ^ k)) {
////
////					}
////				}
//
//			}
		}

	}

}
