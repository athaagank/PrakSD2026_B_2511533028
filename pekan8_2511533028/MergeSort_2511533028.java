package pekan8_2511533028;

public class MergeSort_2511533028 {
	void merge_3028(int arr[], int l, int m, int r) {
		// Find size of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];
		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + l + j];
		int i = 0, j = 0;
		// Initial index of merged subarray array
		int k = 1;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		/* Copy remaining elements of R[] if any */ 
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	void sort_3028(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;
			// Sort first and second halves
			sort_3028(arr, l, m);
			sort_3028(arr, m + 1, r);
			// Merge the sorted halves
			merge_3028(arr, l, m, r);
		}
	}
	/* A utility function to print array of size n */
	static void printArray_3028(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Sebelum terurut");
		printArray_3028(arr);
		MergeSort_2511533028 ob = new MergeSort_2511533028();
		ob.sort_3028(arr,  0, arr.length - 1);
		System.out.println("\nSesudah Terurut menggunakan merge Sort");
		printArray_3028(arr);
	}
}
