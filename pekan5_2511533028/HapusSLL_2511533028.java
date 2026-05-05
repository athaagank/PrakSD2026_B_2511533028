package pekan5_2511533028;

public class HapusSLL_2511533028 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511533028 deleteHead(NodeSLL_2511533028 head_3028) {
		// jika SLL kosong
		if (head_3028 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_3028 = head_3028.next_3028;
		// Return head baru
		return head_3028;
	}
  // fungsi menghapus node terakhir SLL
	public static NodeSLL_2511533028 removeLastNode(NodeSLL_2511533028 head_3028) {
		// jika list kosong, return null
		if (head_3028 == null) {
			return null;
		}
		// jika list satu node, hapus node dan return null
		if (head_3028.next_3028 == null) {
			return null;
		}
		// temukan node terakhir ke dua
		NodeSLL_2511533028 secondLast = head_3028;
		while (secondLast.next_3028.next_3028 != null) {
			secondLast = secondLast.next_3028;
		}
		// hapus node terakhir
		secondLast.next_3028 = null;
		return head_3028;
	}
  // fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511533028 deleteNode(NodeSLL_2511533028 head_3028, int position) {
		NodeSLL_2511533028 temp_3028 = head_3028;
		NodeSLL_2511533028 prev_3028 = null;
		// jika linked list null
		if (temp_3028 == null)
			return head_3028;
		// kasus 1: head dihapus
		if (position == 1) {
			head_3028 = temp_3028.next_3028;
			return head_3028;}
		
		// kasus 2: menghapus node di tengah
		// telusuri ke node yang di hapus
	 for (int i = 1; temp_3028 != null && i < position; i++) {
		    prev_3028 = temp_3028;
		    temp_3028 = temp_3028.next_3028;
	 }
	 // jika ditemukan, hapus node
	 if (temp_3028 != null) {
		prev_3028.next_3028 = temp_3028.next_3028; 
	 } else {
		 System.out.println("Data tidak ada");
		}
	 return head_3028;
	}
	// fungsi mencetak SLL
	public static void printList(NodeSLL_2511533028 head_3028) {
		NodeSLL_2511533028 curr = head_3028;
		while (curr.next_3028 != null) {
			System.out.print(curr.data_3028 + "-->");
			curr = curr.next_3028;
		}
		if (curr.next_3028 == null) {
			System.out.print(curr.data_3028);
		}
		System.out.println();	
	}
	
	//kelas main
	public static void main(String[] args) {
	    // buat SLL 1 -> 2 -> 3 -> 4 -> 5-> 6 -> null
	    NodeSLL_2511533028 head_3028 = new NodeSLL_2511533028(1);
	    head_3028.next_3028 = new NodeSLL_2511533028(2);
	    head_3028.next_3028.next_3028 = new NodeSLL_2511533028(3);
	    head_3028.next_3028.next_3028.next_3028 = new NodeSLL_2511533028(4);
	    head_3028.next_3028.next_3028.next_3028.next_3028 = new NodeSLL_2511533028(5);
	    head_3028.next_3028.next_3028.next_3028.next_3028.next_3028 = new NodeSLL_2511533028(6);

	    // cetak list awal
	    System.out.println("list awal: ");
	    printList(head_3028);

	    // hapus head
	    head_3028 = deleteHead(head_3028);
	    System.out.println("List setelah head dihapus: ");
	    printList(head_3028);

	    //hapus node terakhir
	    head_3028 = removeLastNode(head_3028);
	    System.out.println("List setelah simpul terakhir di hapus: ");
	    printList(head_3028);

	    // Deleting node at position 2
	    int position = 2;
	    head_3028 = deleteNode(head_3028, position);
	    // Print list after deletion
	    System.out.println("List setelah posisi 2 dihapus: ");
	    printList(head_3028);
	}

}
