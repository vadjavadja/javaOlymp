import java.util.Scanner;


public class CF_261_B {
	
	private static long maxValue(long[] a) {
		long max = a[0];
		for (int ktr = 0; ktr < a.length; ktr++) {
			if (a[ktr] > max) {
				max = a[ktr];
			}
		}
		return max;
	}
	
	private static long minValue(long[] a) {
		long min = a[0];
		for (int ktr = 0; ktr < a.length; ktr++) {
			if (a[ktr] < min) {
				min = a[ktr];
			}
		}
		return min;
	}
	
	private static long cnt(long[] a, long v) {
		long c = 0;
		for (int ktr = 0; ktr < a.length; ktr++) {
			if (a[ktr] == v) {
				c++;
			}
		}
		return c;
	}
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long b[] = new long[(int)n];
		for (int i=0; i<n; i++){
			b[i] = scan.nextInt();
		}
		long mx = maxValue(b);
		long mn = minValue(b);
		long dif = (mx-mn);
		long variants = 0;
		if (dif==0) {
			variants = ((n-1)*n)/2;
		} else {
			variants = cnt(b,mx)*cnt(b,mn);
		}
		
		System.out.println(dif+" "+variants);
		return;
	}

}
