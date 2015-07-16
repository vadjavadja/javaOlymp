import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class selectionSort {

	private static boolean checkNonDescending(int a[]) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1])
				return false;
		}
		return true;
	}

	private static void fillArrayRandom(int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(20);
		}
	}

	private static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			int temp = a[i];
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
	}

	private static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minI = i;
			for (int j = minI + 1; j < a.length; j++) {
				if (a[j] < a[minI])
					minI = j;
			}
			int temp = a[i];
			a[i] = a[minI];
			a[minI] = temp;
		}
	}
	
	private static boolean ret(String s, int i){
		System.out.println(s+i);
		return true;
	}
	
	private static void bubbleSort(int[] a) {
		for (int i=0;  ret("i=", i) && i<a.length-1; i++){
			for (int j=a.length-1;  ret("j=", j) && j>i; j--){
				if (a[j]<a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}

	private static int binarySearch(int[] a, int p, int r, int v) {
		System.out.println("Called with: " + p + "-" + r);
		if (p >= r && a[p] != v)
			return -1;
		int q = p + (r - p) / 2;
		System.out.println("q = " + q);
		if (a[q] == v)
			return q;
		if (a[q] > v)
			return binarySearch(a, p, q - 1, v);
		else
			return binarySearch(a, q + 1, r, v);
	}

	private static void merge(int[] a, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] left = new int[n1];
		int[] right = new int[n2];
		left = Arrays.copyOfRange(a, p, q + 1);
		right = Arrays.copyOfRange(a, q + 1, r + 1);
		int i = 0;
		int j = 0;
		int k;
		for (k = p; i < n1 && j < n2; k++) {
			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
		}
		if (i >= n1) {
			for (int l = k; l <= r; l++) {
				a[l] = right[j++];
			}
		} else {
			for (int l = k; l <= r; l++) {
				a[l] = left[i++];
			}
		}

	}

	private static int countInversionsMerge(int[] a, int p, int q, int r) {

		int n1 = q - p + 1;
		int n2 = r - q;
		int[] left = new int[n1];
		int[] right = new int[n2];
		left = Arrays.copyOfRange(a, p, q + 1);
		right = Arrays.copyOfRange(a, q + 1, r + 1);
		int i = 0;
		int j = 0;
		int k;
		int inv = 0;
		for (k = p; i < n1 && j < n2; k++) {
			if(right[j]<left[i]){
				inv += n1;
			}
			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
		}
		if (i >= n1) {
			for (int l = k; l <= r; l++) {
				a[l] = right[j++];
			}
		} else {
			for (int l = k; l <= r; l++) {
				a[l] = left[i++];
			}
		}
		return inv;

	}

	private static void mergeSort(int[] a, int p, int r) {
		if (p < r) {
			int q = (int) Math.floor((double) (p + r) / 2);
			mergeSort(a, p, q);
			mergeSort(a, q + 1, r);
			merge(a, p, q, r);
		}
	}

	private static int countInversions(int[] b, int p, int r) {
		int[] a = Arrays.copyOf(b, b.length);
		int inv = 0;
		if (p < r) {
			int q = (int) Math.floor((double) (p + r) / 2);
			inv += countInversions(a, p, q);
			inv += countInversions(a, q + 1, r);
			inv += countInversionsMerge(a, p, q, r);
		}
		return inv;
	}

	public static void main(String[] args) throws IOException {
		int[] a = { 8,7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(checkNonDescending(a));
	}
}
