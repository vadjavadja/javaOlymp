import java.util.Scanner;

public class Stack {

	int size;
	int a[];
	int h;

	Stack() {
		size = 100;
		a = new int[size];
		h = -1;
	}

	public void push(int v) {
		a[++h] = v;
	}

	public int pop() {
		return a[h--];
	}

	public int peak() {
		if (h < 0)
			return -1;
		return a[h];
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int count = 0;
		int maxSoFar = 0;
		int maxCount = 1;
		int curMax = 0;

		for (char c : str.toCharArray()) {
			if (c == '(')
				count++;
			if (c == ')')
				count--;
			if (count < 0) {
				if (maxSoFar < curMax) {
					maxSoFar = curMax;
					maxCount = 1;
				} else if(maxSoFar == curMax){
					maxCount++;
				}
				curMax = 0;
				count = 0;
			} else {
				curMax++;
			}
			System.out.print(curMax);
		}
		curMax -= count;
		if (maxSoFar < curMax) {
			maxSoFar = curMax;
			maxCount = 1;
		} else if(maxSoFar == curMax){
			maxCount++;
		}
		if (maxSoFar==0) maxCount=1;
		System.out.println(maxSoFar+" "+maxCount);
	}

}
