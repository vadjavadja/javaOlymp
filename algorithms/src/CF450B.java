import java.util.Scanner;

public class CF450B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int n = scan.nextInt();
		int m = 1000000007;
		int a = 0;
		switch (n % 6) {
		case 0:
			a = (x - y) % m;
			break;
		case 1:
			a = x % m;
			break;
		case 2:
			a = y % m;
			break;
		case 3:
			a = (y - x) % m;
			break;
		case 4:
			a = -x % m;
			break;
		case 5:
			a = -y % m;
		}
		if (a < 0)
			a += m;
		System.out.println(a);
	}
}
