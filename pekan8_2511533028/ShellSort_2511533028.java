package pekan8_2511533028;

public class ShellSort_2511533028 {
	public static void shellSort_2511533028(int[] A) {
		int n = A.length;
		int gap = n / 2;
		while (gap > 0) {
			for (int i = gap; i < n; i++) {
				int temp = A[i];
				int j = i;
				while (j >= gap && A[j - gap] > temp) {
					A[j] = A[j - gap];
					j = j - gap;
				}
				A[j] = temp;
			}
			gap = gap / 2;
	    }
	}
	public static void main(String[] args) {
		int[] data_3028 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum : ");
		printArray_2028(data_3028);
		
		shellSort_2511533028(data_3028);
		
		System.out.print("Sesudah : ");
		printArray_2028(data_3028);
	}
	
	public static void printArray_2028(int[] arr) {
		for (int i : arr) System.out.print(i + " ");
				System.out.println();
	}
		
	
}
