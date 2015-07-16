import java.util.Scanner;

public class bayanA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		char a[][] = new char[3][];
		a[0] = new char[11];
		a[1] = new char[11];
		a[2] = new char[11];
		int m=0;
		if (k>2) {
			m=1;
			k--;
		}
			for (int j=0; j<11; j++){
				for (int i=0; i<3; i++){
					if (k>0) {
						a[i][j] = 'O';
					}
					else {
						a[i][j] = '#';
					}
				    k--;
			}
		}
		
		System.out.println("+------------------------+");
		System.out.print("|");
		for (int i=0; i<11; i++){
			System.out.print(a[0][i]+".");
		}
		System.out.println("|D|)");
		
		System.out.print("|");
		for (int i=0; i<11; i++){
			System.out.print(a[1][i]+".");
		}
		System.out.println("|.|");
		
		System.out.print("|");
		if (m==1 ) System.out.print("O"); else System.out.print("#");
		System.out.println(".......................|");
		
		System.out.print("|");
		for (int i=0; i<11; i++){
			System.out.print(a[2][i]+".");
		}
		System.out.println("|.|)");

		System.out.println("+------------------------+");
		
		
	}
}
