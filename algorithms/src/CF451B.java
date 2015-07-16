import java.util.Scanner;


public class CF451B {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("test.txt"));
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++){
			a[i] = scan.nextInt();
		}
		if (n==1) {
			System.out.println("yes");
			System.out.println("1 1");
			return;
		}
		int c = 0;
		boolean isDecs = a[0]>a[1];
		int start = 0;
		int fin = 0;
		for (int i=1; i<n-1; i++){
			if (a[i]>a[i+1] && !isDecs){
				start = i;
			} else if(a[i]<a[i+1] && isDecs){
				fin=i;
				c++;
			}
			isDecs = a[i]>a[i+1];
		}
		if (isDecs) {
			c++;
			fin=n-1;
		}
		if (c>1) {
			System.out.println("no");
			return;
		} 
		if (!((fin == n-1 || (fin != n-1 && a[fin+1]>a[start])) 
		 && (start == 0 || (start>0 && a[start-1]<a[fin])))){
			System.out.println("no");
			return;
		}
		if (c==1) {
			System.out.println("yes");
			System.out.println((start+1)+" "+(fin+1));
		} else if (c==0){
			System.out.println("yes");
			System.out.println("1 1");
		}

	}

}
