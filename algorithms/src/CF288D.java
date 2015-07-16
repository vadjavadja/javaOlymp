import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CF288D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s[] = new String[n];
		String end[] = new String[n];
		String beg[] = new String[n];
		boolean m[] = new boolean[n];
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			s[i] = scan.nextLine();
			end[i] = s[i].substring(1);
			beg[i] = s[i].substring(0, 1);
		}
		Arrays.sort(s);
		int bad[] = new int[2];
		int back = -1;
		int front = -1;
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			if (Arrays.binarySearch(beg, end[i]) < 0) {
				if (back==-1) {
					back = i;
				} else {
					System.out.println("NO");
					return;
				}
				
			}
			if (Arrays.binarySearch(end, beg[i]) < 0) {
				if (front==-1) {
					front = i;
				} else {
					System.out.println("NO");
					return;
				}
				
			}
		

		}
	}

}
