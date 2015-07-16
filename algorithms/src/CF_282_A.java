import java.util.Scanner;


public class CF_282_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int a = 0;
		int c = 0;
		while(Math.floor(n/(double)m)>0){
			c = (int)Math.floor(n/(double)m); 	 
			n = n-c*m + c;
			a+=c*m;
		}
		a+=n;
		
		System.out.println(a);

	}

}
