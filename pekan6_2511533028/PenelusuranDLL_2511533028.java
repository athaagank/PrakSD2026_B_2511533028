package pekan6_2511533028;

public class PenelusuranDLL_2511533028 {
	// fungsi penelusuran maju
	    static void forwardTraversal(NodeDLL_2511533028 head_3028) {
	    	// memulai penelusuran dari head
	    	NodeDLL_2511533028 curr_3028 = head_3028;
	    	// lanjutkan sampai akhir
	    	while (curr_3028 != null) {
	    		// print data
	    		System.out.print(curr_3028.data_3028 + " <-> ");
	    	  // pindah ke node berikutnya
	    		curr_3028 = curr_3028.next_3028;
	    	}
	    	// print spasi
	    	System.out.println();
	    }
	    // fungsi penelusuran mundur
	    static void backwardTraversal(NodeDLL_2511533028 tail_3028) {
	    	// mulai dari akhir
	    	NodeDLL_2511533028 curr_3028 = tail_3028;
	    	// lanjut sampai head
	    	while (curr_3028 != null) {
	    		// cetak data
	    		System.out.print(curr_3028.data_3028 + " <-> ");
	    		// pindah ke node sebelumnya
	    		curr_3028 = curr_3028.prev_3028;
	    	}
	    	// cetak spasi
	    	System.out.println();
	    }
	    public static void main(String[] args) {
	    	// cetak DLL
	    	NodeDLL_2511533028 head_3028 = new NodeDLL_2511533028(1);
	    	NodeDLL_2511533028 second_3028 = new NodeDLL_2511533028(2);
	    	NodeDLL_2511533028 third_3028 = new NodeDLL_2511533028(3);
	    	
	    	head_3028.next_3028 = second_3028;
	    	second_3028.prev_3028 = head_3028;
	    	second_3028.next_3028 = third_3028;
	    	third_3028.prev_3028 = second_3028;
	    	
	    	System.out.println("Penelusuran maju:");
	    	forwardTraversal(head_3028);
	    	
	    	System.out.println("Penelusuran mundur:");
	    	backwardTraversal(third_3028);
	    }
}
