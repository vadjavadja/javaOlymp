
import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int aMin[] = new int[100000];
		int aMax[] = new int[100000];
		Arrays.fill(aMin, 200000);
		for (int i = 0; i < n; i++) {
			int ai = scan.nextInt()-1;
			int bi = scan.nextInt()-1;
			if (aMin[ai] == 200000) aMin[ai] = bi;
			if (aMin[ai]>bi) aMin[ai] = bi;
			if (aMax[ai]<bi) aMax[ai] = bi;
		}
				
		for (int i = 0; i < n-1; i++) {
			if (aMin[i]!=200000){
				for (int j = i+1; j < n; j++) {
					if (aMin[j]!=200000 && aMin[j] < aMax[i]) {
						System.out.println("Happy Alex");
						return;
					}
				}
			}
		}

		System.out.println("Poor Alex");
	}
}
