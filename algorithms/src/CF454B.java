import java.util.Scanner;

public class CF454B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int c = 0;
		boolean isGrowing = true;
		
		int a = scan.nextInt();
		int first = a;
		int last = 0;
		
		for (int i = 1; i < n; i++) {
			int aNext = scan.nextInt();
			if (aNext < a && !isGrowing) {
				System.out.println("-1");
				return;
			}
			if (aNext < a) {
				isGrowing = false;
				c = i;
			}
			a = aNext;
			if (i==n-1) last = a;
		}
		if (isGrowing) System.out.println("0");
		else if (first>=last) System.out.println(n-c);
		else System.out.println("-1");

	}

}
