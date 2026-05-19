package pekan7_2511533028;

public class SelectionSort_2511533028 {
	public static void selectionSort_2511533028(int[] arr) {
		int n_3028 = arr.length;
		for (int i_3028 = 0; i_3028 < n_3028; i_3028++) {
			int minIndex = i_3028;
			for (int j_3028 = i_3028 + 1; j_3028 < n_3028; j_3028++) {
				if (arr[j_3028] < arr[minIndex]) {
					minIndex = j_3028;
				}
			}
			int temp = arr[i_3028];
			arr[i_3028] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_3028 = arr.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_3028 = 0; i_3028 < n_3028; i_3028++)
			System.out.print(arr[i_3028] + " ");
		System.out.println("");
		selectionSort_2511533028(arr);
		System.out.printf("array yang terurut:\n");
		for (int i_3028 = 0; i_3028 < n_3028; i_3028++)
			System.out.print(arr[i_3028] + " ");
		System.out.println("");
	}

}
