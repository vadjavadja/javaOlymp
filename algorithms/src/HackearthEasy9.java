import java.util.Arrays;
import java.util.Scanner;

public class HackearthEasy9 {

	static private final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long waysBase[];
		long ways[];
		int t = scan.nextInt();
		int h = scan.nextInt();
		ways = new long[h + 1];
		waysBase = new long[h + 1];
		waysBase[2] = 1;
		waysBase[4] = 1;
		waysBase[5] = 1;
		for (int i = 6; i <= h; i++) {
			waysBase[i] = (waysBase[i - 2] + waysBase[i - 5]) % MOD;
		}

		for (int tc = 0; tc < t; tc++) {
			int dest = scan.nextInt();
			int k = scan.nextInt();

			if (k <= dest && k != 2 && k != 5) {
				System.arraycopy(waysBase, 0, ways, 0, dest + 1);
				ways[k] = (ways[k] + 1) % MOD;
				for (int i = k + 1; i <= dest; i++) {
					ways[i] = (ways[i - 2] + ways[i - 5] + ways[i - k]) % MOD;
				}
				System.out.println(ways[dest]);
			} else if (k == dest) {
				System.out.println((waysBase[k] + 1) % MOD);
			} else {
				System.out.println(waysBase[dest] % MOD);
			}

		}

	}

}
