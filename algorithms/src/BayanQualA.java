import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BayanQualA {

	public static void main(String[] args) throws IOException  {
		File out = new File("output.txt");
		FileWriter fwrt = new FileWriter(out);
		Scanner scan = new Scanner(new File("25.in"));
		int n = scan.nextInt();
		scan.nextLine();
		for (int i=0; i<n; i++) {
			StringBuffer s = new StringBuffer(scan.nextLine());
			s = i<n-1 ? s.reverse().append('\n') : s.reverse();
			fwrt.append(s);
		}
		fwrt.flush();

	}

}
