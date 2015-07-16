import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class HackearthEasy5 {
	final static int MOD = 100000;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sKey = scan.nextInt();
		int lKey = scan.nextInt();
		int n = scan.nextInt();
		int keys[] = new int[n];
		int answ[] = new int[MOD];
		for (int i = 0; i < n; i++) {
			keys[i] = scan.nextInt();
		}
		Arrays.fill(answ, -1);
		answ[sKey] = 0;
		LinkedList<Integer> values = new LinkedList<Integer>();
		values.push(sKey);
		while (values.size() > 0) {
			
			int val = values.pollLast();
			if (val == lKey) {
				break;
			}
			for (int i = 0; i < n; i++) {
				int res = (int)(((long)val * (long)keys[i]) % (long)MOD);
				if (answ[res] == -1) {
					answ[res] = answ[val] + 1;
					values.push(res);
				}
			}
		}
		System.out.println(answ[lKey]);
	}
}
