import java.util.Scanner;


public class CF_264_B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int p=0;
		
		for (int i=0; i<n; i++){
			int h = scan.nextInt();
			if (h>p) p=h;
		}
		
		System.out.println(p);

	}

}
