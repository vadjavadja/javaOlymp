import java.util.Scanner;

public class CF4A {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int w = scan.nextInt();
	if (w%2 == 0 && w>3) System.out.println("YES");
	else System.out.println("NO");
	}
}
