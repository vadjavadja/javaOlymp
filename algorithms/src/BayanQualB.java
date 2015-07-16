import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BayanQualB {

	
	private static boolean isVovelOdd(String s){
		char vov[] = {'a', 'e', 'i', 'o', 'u'};
		boolean answer = false;
		for (char c : s.toLowerCase().toCharArray()){
			for (char v : vov){
				if (c == v) { 
					answer=!answer;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		File out = new File("output.txt");
		FileWriter fwrt = new FileWriter(out);
		Scanner scan = new Scanner(new File("39.in"));
		int n = scan.nextInt();
		scan.nextLine();
		for (int i=0; i<n; i++) {
			if (isVovelOdd(scan.nextLine())){
				fwrt.append("PESAR");
			} else {
				fwrt.append("DOKHTAR");
			}
			if (i<n-1) fwrt.append("\n");
		}
		fwrt.flush();

	}

}
