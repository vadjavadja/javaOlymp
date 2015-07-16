
public class BubbleSort {

	private int a[];
	
	public void sort(){
		for (int i=0; i<a.length-1; i++){
			for (int j=i; j<a.length-1; j++){
				if (a[j]<a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
