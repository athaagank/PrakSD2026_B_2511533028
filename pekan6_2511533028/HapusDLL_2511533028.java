package pekan6_2511533028;

public class HapusDLL_2511533028 {
	// fungsi menghapus node awal
	public static NodeDLL_2511533028 delHead(NodeDLL_2511533028 head_3028) {
		if (head_3028 == null) {
			return null;
		}
		NodeDLL_2511533028 temp_3028 = head_3028;
		head_3028 = head_3028.next_3028;
		if (head_3028 != null) {
			head_3028.prev_3028 = null;
		}
		return head_3028;
	}
	// fungsi menghapus di akhir
	public static NodeDLL_2511533028 delLast(NodeDLL_2511533028 head_3028) {
		if (head_3028 == null) {
			return null;
		}
		if (head_3028.next_3028 == null) {
			return null;
		}
		NodeDLL_2511533028 curr_3028 = head_3028;
		while (curr_3028.prev_3028 != null) {
			curr_3028.prev_3028.next_3028 = null;
		}
		return head_3028;
	}
	// fungsi menghapus node tertentu
	public static NodeDLL_2511533028 delPos(NodeDLL_2511533028 head_3028, int pos_3028) {
		// jika DLL kosong
		if (head_3028 == null) {
			return head_3028;
		}
		NodeDLL_2511533028 curr_3028 = head_3028;
		// telusuri sampai ke node yang akan dihapus
		for (int i = 1; curr_3028 != null && i < pos_3028; ++i) {
			curr_3028 = curr_3028.next_3028;
		}
		// jika posisi tidak ditemukan
		if (curr_3028 == null) {
			return head_3028;
		}
		// Update pointer
		if (curr_3028.prev_3028 != null) {
			curr_3028.prev_3028.next_3028 = curr_3028.next_3028;
		}
		if (curr_3028.next_3028 != null) {
			curr_3028.next_3028.prev_3028 = curr_3028.prev_3028;
		}
		// jika yang dihapus head
		if (head_3028 == curr_3028) {
			head_3028 = curr_3028.next_3028;
		}
		return head_3028;
	}
	// fungsi mencetak DLL
	public static void printList(NodeDLL_2511533028 head_3028) {
		NodeDLL_2511533028 curr_3028 = head_3028;
		while (curr_3028 != null) {
			System.out.print(curr_3028.data_3028 + " ");
			curr_3028 = curr_3028.next_3028;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// buat sebuah DLL
		NodeDLL_2511533028 head_3028 = new NodeDLL_2511533028(1);
		  head_3028.next_3028 = new NodeDLL_2511533028(2);
		  head_3028.next_3028.prev_3028 = head_3028;
		  head_3028.next_3028.next_3028 = new NodeDLL_2511533028(3);
	      head_3028.next_3028.next_3028.prev_3028 = head_3028.next_3028;
	      head_3028.next_3028.next_3028.next_3028 = new NodeDLL_2511533028(4);
	      head_3028.next_3028.next_3028.next_3028.prev_3028 = head_3028.next_3028.next_3028;
	      head_3028.next_3028.next_3028.next_3028.next_3028 = new NodeDLL_2511533028(5);
	      head_3028.next_3028.next_3028.next_3028.next_3028.prev_3028 = head_3028.next_3028.next_3028.next_3028;

		    System.out.print("DLL Awal: ");
		    printList(head_3028);

		    System.out.print("Setelah head dihapus: ");
		    head_3028 = delHead(head_3028);
		    printList(head_3028);

		    System.out.print("Setelah node terakhir dihapus: ");
		    head_3028 = delLast(head_3028);
		    printList(head_3028);

		    System.out.print("menghapus node ke 2: ");
		    head_3028 = delPos(head_3028, 2);
		    printList(head_3028);
	}

}
