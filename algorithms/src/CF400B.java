import java.util.Arrays;
import java.util.Scanner;

public class CF400B {

	public static int countDifferent(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++)
				if (a[i] == a[j])
					a[j] = -1;
		}
		int c = 0;
		for (int i : a) {
			if (i!=-1) c++;
		}
		return c;
	}

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextInt();
		scan.nextLine();
		int[] a = new int[n];

		label: for (int i = 0; i < n; i++) {
			String s = scan.nextLine();
			boolean isGFound = false;
			a[i] = -1;
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				switch (c) {
				case 'G':
					isGFound = true;
					break;
				case 'S':
					if (!isGFound) {
						System.out.println("-1");
						return;
					} else {
						a[i]++;
						continue label;
					}
				case '*': if (isGFound) a[i]++;
				}

			}
			
		}
		System.out.println(countDifferent(a));
	}
}
