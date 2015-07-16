import java.util.Scanner;


public class CF84A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println((int)(Math.ceil(n/2d)+2*Math.floor(n/2d)));
	}

}
