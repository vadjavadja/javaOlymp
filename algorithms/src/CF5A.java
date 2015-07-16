import java.awt.datatransfer.StringSelection;
import java.util.Scanner;


public class CF5A {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = 0;
		int b = 0;
		while (scan.hasNextLine()){
			String s = scan.nextLine();
			if (s.trim().length() == 0) break;
			boolean isPlus = s.charAt(0)=='+';
			boolean isMinus = s.charAt(0)=='-';
			if (isPlus || isMinus){
				c += isPlus ? 1: -1;
			} else {
				b += c*s.substring(s.indexOf(':')+1).length();
			}
		}
		System.out.println(b);
		

	}

}
