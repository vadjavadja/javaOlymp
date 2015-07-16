import java.util.Scanner;

public class CF_264_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s = scan.nextInt();

		int c = -1;

		for (int i = 0; i < n; i++) {
			int xt = scan.nextInt();
			int yt = scan.nextInt();

			int x = xt;
			int y = yt;

			while (x < s || (x == s && y == 0)) {
				if (c < (100 - y) % 100)
					c = (100 - y) % 100;
				if (c == 99) {
					System.out.println(99);
					return;
				}
				y += yt;
				x += xt;
				if (y > 99) {
					y -= 100;
					x++;
				}
			}

		}
		System.out.println(c);

	}

}
