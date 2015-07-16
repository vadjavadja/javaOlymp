import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class HackearthEasy1 {

	private static double dist(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int c1=0;
		int c2=0;
		int c3=0;
		for (int ii = 0; ii < t; ii++) {
			int n = scan.nextInt();
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r1 = scan.nextInt();
			for (int i = 1; i < n; i++) {
				int temp = scan.nextInt();
				r1 = Math.min(temp, r1);
			}
			int r2 = scan.nextInt();
			for (int i = 1; i < n; i++) {
				int temp = scan.nextInt();
				r2 = Math.min(temp, r2);
			}
			double d = dist(x1, y1, x2, y2);
			double area;
			if (d >= r1 + r2) {
				area = 0;
				c1++;
			} else if (d <= Math.abs(r1 - r2)) {
				area = Math.PI * Math.min(r1, r2) * Math.min(r1, r2);
				c2++;
			} else {
				c3++;
				double alpha = Math.acos((r1 * r1 + d * d - r2 * r2)
						/ (2 * r1 * d));

				double beta = Math.acos((r2 * r2 + d * d - r1 * r1)
						/ (2 * r2 * d));

				area = r1 * r1 * (alpha - 0.5 * Math.sin(2 * alpha)) + r2 * r2
						* (beta - 0.5 * Math.sin(2 * beta));
			}
//			/System.out.print(x1+" "+y1+" "+r1+" "+x2+" "+y2+" "+r2+" "+d+"\t");
			System.out.format(Locale.ENGLISH, "%.2f\n", area);

		}
		//System.out.println(c1/(double)t);
		//System.out.println(c2/(double)t);
		//System.out.println(c3/(double)t);

	}
}
