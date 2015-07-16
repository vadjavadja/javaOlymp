import java.util.Scanner;

public class HackearthEasy6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int tests=0; tests<t; tests++){
			int n = scan.nextInt();
			int k = scan.nextInt();
			scan.nextLine();
			int lengths[] = new int[100];
			for (int i=0; i<n; i++){
				String s = scan.nextLine();
				int l = s.length();
				lengths[l]++;
			}
			String answ = "Possible";
			for (int i=0; i<100; i++){
				if(lengths[i]%k!=0){
					answ = "Not possible";
					break;
				}
			}
			System.out.println(answ);
		}
		
	}
}
