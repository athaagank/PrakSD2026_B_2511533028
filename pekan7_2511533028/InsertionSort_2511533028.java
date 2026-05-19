package pekan7_2511533028;

public class InsertionSort_2511533028 {
	public static void insertionSort_2511533028(int[] arr) {
		int n_3028 = arr.length;
		for (int i_3028 = 1; i_3028 < n_3028; i_3028++) {
			int key = arr[i_3028];
			int j_3028 = i_3028 - 1;
			while (j_3028 >= 0 && arr[j_3028] > key) {
				arr[j_3028 + 1] = arr[j_3028];
				j_3028--;
			}
			arr[j_3028 + 1] = key;
		}
	}
	public static void main(String[] args) {
		int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_3028 = arr.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_3028 = 0; i_3028 < n_3028; i_3028++)
			System.out.print(arr[i_3028] + " ");
		System.out.println("");
		insertionSort_2511533028(arr);
		System.out.printf("array yang terurut:\n");
		for (int i_3028 = 0; i_3028 < n_3028; i_3028++)
			System.out.print(arr[i_3028] + " ");
		System.out.println("");
	}

}
