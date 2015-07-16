import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CF286B {

	static boolean mx[][][];
	static int n;
	static int m;
	static int a;
	static int b;
	static int count;

	static boolean mark[];

	static void justBFS(int v, int c) {
		int[] queue = new int[n]; // �������
		int qH = 0; // ������ �������
		int qT = 0; // �����

		/* <��������� ������� v> */
		mark[v] = true; // �������� �������� �������
		queue[qT++] = v; // �������� �� � �������

		while (qH < qT) { // ���� ������� �� �����
			v = queue[qH++]; // ��������� ������� �������
			for (int nv = 0; nv < n; nv++) { // ���������� �������
				if (!mark[nv] && mx[c][v][nv]) { 
					if (nv==b){
						count++;
						return;
					}
				/* <��������� ������� nv> */
					mark[nv] = true; // �������� ��
					queue[qT++] = nv; // � ��������� � �������
				}
			}
		}
	}

	static void justDFS(int v, int c) {
		mark[v] = true;
		for (int nv = 0; nv < n; nv++) {
			if (!mark[nv] && mx[c][v][nv]) {
				if (nv == a) {
					count++;
					return;
				}
				justDFS(nv, c);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		mx = new boolean[m][n][n];

		for (int i = 0; i < m; i++) {
			int uu = scan.nextInt() - 1;
			int vv = scan.nextInt() - 1;
			int cc = scan.nextInt() - 1;
			mx[cc][uu][vv] = true;
			mx[cc][vv][uu] = true;
		}
		int q = scan.nextInt();
		for (int ii = 0; ii < q; ii++) {
			a = scan.nextInt() - 1;
			b = scan.nextInt() - 1;
			count = 0;
			for (int i = 0; i < m; i++) {
				mark = new boolean[n];
				justBFS(a, i);
			}
			System.out.println(count);

		}

	}

}
