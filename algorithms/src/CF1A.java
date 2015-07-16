import java.util.Scanner;


public class CF1A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long m = scan.nextInt();
		long a = scan.nextInt();
		long answer = (long)Math.ceil(n/(double)a);
		if (m>=a) answer*=(long)Math.ceil(m/(double)a);;
		System.out.println(answer);

	}

}
