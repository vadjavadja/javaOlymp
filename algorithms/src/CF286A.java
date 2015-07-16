import java.util.Scanner;

public class CF286A {

	private static boolean isPall(StringBuffer s){
		String str = new String(s);
		return str.equals(new StringBuffer().append(str).reverse().toString());
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		
		char c[] = s.toCharArray();
		int l = s.length();
		
		if (isPall(new StringBuffer(s))){
			StringBuffer sb = new StringBuffer(s);
			System.out.println(sb.insert(l/2, c[l/2]));
			return;
		}
		
		for (int i=0, j=l-1; i<l && l>=0; i++, j--){
			if (c[i]!=c[j]){
				StringBuffer sb = new StringBuffer(s);
				sb.insert(j+1, c[i]);
				if(isPall(sb)){
					System.out.println(sb);
					return;
				}
				sb = new StringBuffer(s);
				sb.insert(i, c[j]);
				if(isPall(sb)){
					System.out.println(sb);
					return;
				}
			}
		}
		System.out.println("NA");

	}

}
