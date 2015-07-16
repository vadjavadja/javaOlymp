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
		int[] queue = new int[n]; // очередь
		int qH = 0; // голова очереди
		int qT = 0; // хвост

		/* <обработка вершины v> */
		mark[v] = true; // помечаем исходную вершину
		queue[qT++] = v; // помещаем ее в очередь

		while (qH < qT) { // пока очередь не пуста
			v = queue[qH++]; // извлекаем текущую вершину
			for (int nv = 0; nv < n; nv++) { // перебираем вершины
				if (!mark[nv] && mx[c][v][nv]) { 
					if (nv==b){
						count++;
						return;
					}
				/* <обработка вершины nv> */
					mark[nv] = true; // помечаем ее
					queue[qT++] = nv; // и добавляем в очередь
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
