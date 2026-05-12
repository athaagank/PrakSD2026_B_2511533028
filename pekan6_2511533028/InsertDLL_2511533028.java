package pekan6_2511533028;

public class InsertDLL_2511533028 {
	  // menambahkan node di awal DLL
	static NodeDLL_2511533028 insertBegin(NodeDLL_2511533028 head_3028, int data_3028) {
		// buat node baru
		NodeDLL_2511533028 new_node = new NodeDLL_2511533028(data_3028);
		// jadikan pointer nextnya head
		new_node.next_3028 = head_3028;
		// jadikan pointer prev head ke new_node
		if (head_3028 != null) {
			head_3028.prev_3028 = new_node;
		}
		return new_node;
	}
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511533028 insertEnd(NodeDLL_2511533028 head_3028, int newData) {
		// buat node baru
		NodeDLL_2511533028 newNode = new NodeDLL_2511533028(newData);
		// jika dll null jadikan head
		if (head_3028 == null) {
			 head_3028 = newNode;
		}
		else {
			NodeDLL_2511533028 curr_3028 = head_3028;
			while (curr_3028.next_3028 != null) {
				curr_3028 = curr_3028.next_3028;
			}
			curr_3028.next_3028 = newNode;
			newNode.prev_3028 = curr_3028;
		}
		return head_3028;		
	}
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511533028 insertAtPosition(NodeDLL_2511533028 head_3028, int pos_3028, int new_data) {
		// buat node baru
		NodeDLL_2511533028 new_node = new NodeDLL_2511533028(new_data);
		if (pos_3028 == 1) {
			new_node.next_3028 = head_3028;
			if (head_3028 != null) {
				head_3028.prev_3028 = new_node;
			}
			head_3028 = new_node;
			return head_3028;
		}
		NodeDLL_2511533028 curr_3028 = head_3028;
		for (int i = 1; i < pos_3028 - 1 && curr_3028 != null; ++i) {
			curr_3028 = curr_3028.next_3028;
		}
		if (curr_3028 == null) {
			System.out.println("Posisi tidak ada");
			return head_3028;
		}
		new_node.prev_3028 = curr_3028;
		new_node.next_3028 = curr_3028.next_3028;
		curr_3028.next_3028 = new_node;
		if (new_node.next_3028 != null) {
			new_node.next_3028.prev_3028 = new_node;
		}
		return head_3028;
	}
	public static void printList (NodeDLL_2511533028 head_3028) {
		NodeDLL_2511533028 curr_3028 = head_3028;
		while (curr_3028 != null) {
			System.out.print(curr_3028.data_3028 + " <-> ");
			curr_3028 = curr_3028.next_3028;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511533028 head_3028 = new NodeDLL_2511533028(2);
		head_3028.next_3028 = new NodeDLL_2511533028(3);
		head_3028.next_3028.prev_3028 = head_3028;
		head_3028.next_3028.next_3028 = new NodeDLL_2511533028(5);
		head_3028.next_3028.next_3028.prev_3028 = head_3028.next_3028;
		// cetak DLL awal
		System.out.print("DLL Awal: ");
		printList(head_3028);
		// tambah 1 di awal
		head_3028 = insertBegin(head_3028, 1);
		System.out.print("simpul 1 ditambah di awal: ");
		printList(head_3028);
		// tambah 6 di akhir
		System.out.print("simpul 6 ditambah di akhir: ");
		int data_3028 = 6;
		head_3028 = insertEnd(head_3028, data_3028);
		printList(head_3028);
		// menambahkan node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4: ");
		int data2_3028 = 4;
		int pos_3028 = 4;
		head_3028 = insertAtPosition(head_3028, pos_3028, data2_3028);
		printList(head_3028);
	}

}
