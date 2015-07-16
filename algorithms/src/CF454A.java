import java.util.Arrays;
import java.util.Scanner;


public class CF454A {

	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 int i=1;
		 for (int k=0; k<n; k++){
			 for (int j=0; j<(n-i)/2; j++) System.out.print("*");
			 for (int j=0; j<i; j++) System.out.print("D");
			 for (int j=0; j<(n-i)/2; j++) System.out.print("*");
			 System.out.println();
			 if (k < Math.ceil(n/2)) i+=2; else i-=2;
		 }
		 

	}

}
