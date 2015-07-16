import java.util.Scanner;

public class B {

	private static int f(int a, int n) {
		int c = n % 4;
		switch (c) {
		case 0:
			return 1;
		case 1:
			return a;
		case 2:
			if (a == 4)
				return 1;
			else
				return 4;
		case 3:
			if (a == 2)
				return 3;
			if (a == 3)
				return 2;
			if (a == 4)
				return 4;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		int n = -1;
		if (s.length() == 1)
			n = Integer.valueOf(""+s.charAt(s.length() - 1));
		else if(s.length() == 2) 
			n = Integer.valueOf(""+s.charAt(s.length() - 2)
					+ s.charAt(s.length() - 1)+"");
		else 
			n = Integer.valueOf(""+s.charAt(s.length() - 3)
					+ s.charAt(s.length() - 2)
					+ s.charAt(s.length() - 1)+"");
		
		int answ = 1 + f(2, n) + f(3, n) + f(4, n);
		System.out.println(answ % 5);
	}

}
