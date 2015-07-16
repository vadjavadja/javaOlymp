import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class CF12B {

	static String f(String a) {
		char c[] = a.toCharArray();
		Arrays.sort(c);
		int i = 0;
		int l = a.length();
		while (c[i] == '0' && i<l-1) {
			i++;
		}
		if (i > 0) {
			c[0] = c[i];
			c[i] = '0';
		}
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		if (f(a).equals(b)) {
			System.out.println("OK");
		} else {
			System.out.println("WRONG_ANSWER");
		}

	}

}
