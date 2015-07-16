import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CF_264_C {

	public static int maxIndex(List<Long> list) {
		Integer i = 0, maxIndex =  -1;
		Long max = null;
		for (Long x : list) {
			if ((x != null) && ((max == null) || (x > max))) {
				max = x;
				maxIndex = i;
			}
			i++;
		}
		return maxIndex;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		long[][] a = new long[n][n];
		
		long p=0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scan.nextLong();
			}
		}

		ArrayList<Long> dLR = new ArrayList<>(2*n-1);
		ArrayList<Long> dRL = new ArrayList<>(2*n-1);
		
		for (int j = 0; j < n; j++) {
			long t=0;
			for (int ii = 0, jj = j; ii < n && jj >= 0; ii++, jj--) {
				t += a[ii][jj];
			}
			dRL.add(t);
		}
		for (int i = 1; i < n; i++) {
			long t=0;
			for (int ii = i, jj = n-1; ii < n && jj >= 0; ii++, jj--) {
				t += a[ii][jj];
			}
			dRL.add(t);
		}
		
		for (int i = n-1; i >= 0; i--) {
			long t=0;
			for (int ii = i, jj = 0; ii < n && jj < n; ii++, jj++) {
				t += a[ii][jj];
			}
			dLR.add(t);
		}
		
		for (int j = 1; j < n; j++) {
			long t=0;
			for (int ii = 0, jj = j; ii < n && jj < n; ii++, jj++) {
				t += a[ii][jj];
			}
			dLR.add(t);
		}
				
		long maxLR = Collections.max(dLR);
		long maxRL = Collections.max(dRL);
		
		System.out.println(dRL);
		System.out.println(dLR);
		
		//p+=maxV;
		
		

	}
}
