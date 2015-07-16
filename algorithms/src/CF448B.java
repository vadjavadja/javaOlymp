import java.util.Arrays;
import java.util.Scanner;

public class CF448B {

	public static boolean isOnlyArray(char[] s, char[] t) {
		if (s.length != t.length)
			return false;
		Arrays.sort(s);
		Arrays.sort(t);
		if (Arrays.equals(s, t))
			return true;
		return false;
	}

	public static boolean isOnlyAutomata(char[] s, char[] t) {
		int j = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == t[j])
				j++;
			if (j == t.length)
				return true;
		}
		return false;
	}

	public static boolean isBoth(char[] s, char[] t) {
		Arrays.sort(s);
		Arrays.sort(t);
		int j = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == t[j])
				j++;
			if (j == t.length)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] s = scan.nextLine().toCharArray();
		char[] t = scan.nextLine().toCharArray();
		if (isOnlyArray(s, t))
			System.out.println("array");
		else if (isOnlyAutomata(s, t))
			System.out.println("automaton");
		else if (isBoth(s, t))
			System.out.println("both");
		else
			System.out.println("need tree");
	}

}
