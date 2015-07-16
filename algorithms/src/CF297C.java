import java.util.Scanner;

public class CF297C {

	static long S = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l[] = new int[1000001];
		int pairs[] = new int[1000001];

		for (int i = 0; i < n; i++) {
			int t = scan.nextInt();
			l[t]++;
		}

		int add = 0;
		for (int i = l.length - 1; i >= 0; i--) {
			pairs[i] = (l[i] + add) / 2;

			if ((l[i] + add) % 2 == 1 && l[i] != 0)
				add = 1;
			else
				add = 0;
		}

//		for (int i = 0; i < pairs.length; i++) {
//			if (pairs[i] != 0)
//				System.out.println(i + " " + pairs[i]);
//		}

		long lastWas = 0;
		for (int i = pairs.length - 1; i >= 0; i--) {

			if (pairs[i] != 0) {
				if (lastWas != 0) {
					S += i * lastWas;
					pairs[i]--;
					lastWas = 0;
				}

				S += (long) (pairs[i] / 2) * i * i;
				if (pairs[i] % 2 == 1) {
					lastWas = i;
				}
				//System.out.println(i + " S=" + S + " lw=" + lastWas);
			}

		}
		System.out.println(S);
	}
}
