import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BayanQualC {

	public static void main(String[] args) throws IOException {
		File out = new File("output.txt");
		FileWriter fwrt = new FileWriter(out);
		Scanner scan = new Scanner(new File("23.in"));
		int t = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < t; i++) {
			String in = scan.nextLine();
			Cube c = new Cube(in.split(" "));
			int n = scan.nextInt();
			scan.nextLine();
			for (int j = 0; j < n; j++) {
				String rotStr = scan.nextLine();
				c.rotate(rotStr.charAt(0), Long.valueOf(rotStr.substring(2)));
			}
			fwrt.append(c.toString());
			if (i < t - 1)
				fwrt.append("\n");
		}
		fwrt.flush();
	}

}

class Cube {
	private String s[];

	Cube(String s[]) {
		this.s = s;
	}

	public void rotate(char t, long n) {
		switch (t) {
		case 'X':
			for (int i = 0; i < n % 4; i++)
				x();
			break;
		case 'Y':
			for (int i = 0; i < n % 4; i++)
				y();
			break;
		case 'Z':
			for (int i = 0; i < n % 4; i++)
				z();
			break;
		}

	}

	public void x() {
		String temp[] = new String[6];
		temp[1] = s[0];
		temp[0] = s[2];
		temp[2] = s[5];
		temp[5] = s[1];
		temp[3] = s[3];
		temp[4] = s[4];
		s = temp;
	}

	public void y() {
		String temp[] = new String[6];
		temp[1] = s[3];
		temp[4] = s[1];
		temp[2] = s[4];
		temp[3] = s[2];
		temp[0] = s[0];
		temp[5] = s[5];
		s = temp;
	}

	public void z() {
		String temp[] = new String[6];
		temp[4] = s[0];
		temp[5] = s[4];
		temp[3] = s[5];
		temp[0] = s[3];
		temp[1] = s[1];
		temp[2] = s[2];
		s = temp;
	}

	@Override
	public String toString() {
		return s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + s[4] + " "
				+ s[5];
	}
}