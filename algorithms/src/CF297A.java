import java.util.Scanner;

public class CF297A {

	static int charToInt(char a) {
		a = Character.toLowerCase(a);
		return Integer.valueOf(a) - Integer.valueOf('a');
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int keys[] = new int[Integer.valueOf('z') - Integer.valueOf('a') + 1];
		char a[] = scan.nextLine().toCharArray();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				keys[charToInt(a[i])]++;
			} else {
				if (keys[charToInt(a[i])] <= 0) {
					sum++;
				} else {
					keys[charToInt(a[i])]--;
				}
			}
		}
		System.out.println(sum);

	}

}
