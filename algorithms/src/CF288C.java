import java.util.ArrayList;
import java.util.Scanner;

public class CF288C {

	static ArrayList<Integer> q = new ArrayList<>();

	private static void tick() {
		for (int i = 0; i < q.size(); i++) {
			Integer v = q.get(i);
			v = v - 1;
			if (v > 0) {
				q.set(i, v);
			} else {
				q.remove(i);
			}

		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int t = scan.nextInt();
		int r = scan.nextInt();
		int start = -1;
		boolean v[] = new boolean[305];
		boolean busy[] = new boolean[305];

		for (int i = 0; i < m; i++) {
			int temp = scan.nextInt();
			v[temp] = true;
			if (start == -1)
				start = temp;
		}

		if (t < r) {
			System.out.println(-1);
			return;
		}
		int count = r;
		for (int i = 0; i < r; i++) {
			q.add(t - i);
		}

		busy[start - 1] = true;
		for (int i = start; i < 305; i++) {
			int cur = q.size();
			if (v[i] && cur < r) {
				for (int j = 0; j < r - cur; j++) {
					if (!busy[i - j - 1]) {
						busy[i - j - 1] = true;
						q.add(t - j);
						count++;
					} else {
						System.out.println(-1);
						return;
					}
				}

			}
			tick();
		}
		System.out.println(count);
	}
}
