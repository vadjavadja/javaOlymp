import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CF_262_B {

	private static int f(long n){
		int sum = 0;
		while(n != 0){
		        sum += (n % 10);
		        n/=10;
		}
		return sum;
		
	}
	
	private static long p(long a, long b){
		long pr = a;
		for (int i=1; i<b; i++){
			pr*=a;
		}
		return pr;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		long c = scan.nextInt();
		
		List<Long> l = new ArrayList<>(); 
		
		for (int i=0; i<=81; i++){
			long k = b*p(i, a) + c;
			if (k>0 && k<1000000000l && f(k)==i) {
				l.add(k);
			}
		}
		
		System.out.println(l.size());
		for (Long o : l) {
			System.out.print(o+" ");	
		}

	}

}
