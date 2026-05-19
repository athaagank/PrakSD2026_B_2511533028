package pekan7_2511533028;

public class BubleSort_2511533028 {
	    public static void bubbleSort(int[] arr) {
	        int n_3028 = arr.length;
	        for (int i_3028 = 0; i_3028 < n_3028; i_3028++) {
	            for (int j_3028 = 0; j_3028 < n_3028 - i_3028 - 1; j_3028++) {
	                if (arr[j_3028] > arr[j_3028 + 1]) {
	                    int temp = arr[j_3028];
	                    arr[j_3028] = arr[j_3028 + 1];
	                    arr[j_3028 + 1] = temp;
	                    // System.out.println("data:"+arr[j]+" "+arr[j+1]);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
	        int n_3028 = arr.length;
	        System.out.print("array yang belum terurut:");
	        for (int i_3028 = 0; i_3028 < n_3028; i_3028++) {
	            System.out.print(arr[i_3028] + " ");
	        }
	        System.out.println("");
	        bubbleSort(arr);
	        System.out.print("array yang terurut menggunakan BubleSort:");
	        for (int i_3028 = 0; i_3028 < n_3028; i_3028++) {
	            System.out.print(arr[i_3028] + " ");
	        }
	        System.out.println("");
	    }
	}


