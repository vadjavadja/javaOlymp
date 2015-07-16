import java.util.ArrayList;
import java.util.Scanner;


public class CF451D {

	private static int countOdd (int n){
		if (n%2 != 0){
			n+=1;
			return (n/2)*(n/2);
		} else{
			return (2+n)*(n/4);
		}
	}
	
	private static int countEven (int n){
		if (n%2 != 0){
			return (2+(n-1))*((n-1)/4);
		} else{
			return (n/2)*(n/2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s.length() == 1) {
			System.out.println("0 1");
			return;
		}
		boolean[] a = new boolean[s.length()];
		for (int i=0; i<s.length(); i++){
			a[i] = (s.charAt(0) == 'a');
		}
		
		int odd = 0;
		int even = 0;
		int endLen = 0;
		// count simple
		boolean c = a[0];
		int n=1;
		for (int i=1; i<s.length(); i++){
			if (a[i]==a[i-1]) n++;
			else {
				endLen++;
				n=1;
				odd+=countOdd(n);
				even+=countEven(n);
			}
		}

	}

}
