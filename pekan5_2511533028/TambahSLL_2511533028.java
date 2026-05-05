package pekan5_2511533028;

public class TambahSLL_2511533028 {
	public static NodeSLL_2511533028 insertAtFront(NodeSLL_2511533028 head_3028, int value) {
		NodeSLL_2511533028 new_node_3028 = new NodeSLL_2511533028(value);
		new_node_3028.next_3028 = head_3028;
		return new_node_3028;
	}
	// fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511533028 insertAtEnd(NodeSLL_2511533028 head_3028, int value) {
		  // buat sebuah node dengan sebuah nilai
		NodeSLL_2511533028 newNode_3028 = new NodeSLL_2511533028(value);
		// jika list kosong makan node jadi head
		if (head_3028 == null) {
			return newNode_3028;
		}
	 // simpan head ke variabel seentara
		NodeSLL_2511533028 last = head_3028;
		// telusuri ke node akhir
		while (last.next_3028 != null) {
			last = last.next_3028;
		}
		// ubah pointer
		last.next_3028 = newNode_3028;
		return head_3028;
	}
	static NodeSLL_2511533028 GetNode(int data_3028) {
		return new NodeSLL_2511533028(data_3028);
	}
	static NodeSLL_2511533028 insertPos(NodeSLL_2511533028 headNode, int position, int value) {
		NodeSLL_2511533028 head_3028 = headNode;
		if (position < 1)
			System.out.print("Invalid position");
		if (position == 1) {
			NodeSLL_2511533028 new_node_3028 = new NodeSLL_2511533028(value);
			new_node_3028.next_3028 = head_3028;
			return new_node_3028;
		} else {
			while (position-- !=0) {
				if (position == 1) {
					NodeSLL_2511533028 newNode_3028 = GetNode(value);
					newNode_3028.next_3028 = headNode.next_3028;
					headNode.next_3028 = newNode_3028;
					break;
				}
				headNode = headNode.next_3028;
			}
			if (position != 1)
		System.out.print("Posisi di luar jangkauan");
		return head_3028;      
		}
	}	
	public static void printList(NodeSLL_2511533028 head_3028) {
		NodeSLL_2511533028 curr = head_3028;
	  while (curr.next_3028 != null) {
		  System.out.print(curr.data_3028+"-->");
		  curr = curr.next_3028;
	  }
	  if (curr.next_3028==null) {
		  System.out.print(curr.data_3028);     }
	  System.out.println();	  		
	}
	public static void main(String[] args) {
		 // buat linked list 2->3->5->6
		NodeSLL_2511533028 head_3028 = new NodeSLL_2511533028(2);
		head_3028.next_3028 = new NodeSLL_2511533028(3);
		head_3028.next_3028.next_3028 = new NodeSLL_2511533028(5);
		head_3028.next_3028.next_3028.next_3028 = new NodeSLL_2511533028(6);
		// cetak list asli
		System.out.print("Senarai berantai awal");
		printList(head_3028);
		// tambahkan node baru di depan
		System.out.print("tambah 1 simpul di depan: ");
		int data_3028 = 1;
		head_3028 = insertAtFront(head_3028, data_3028);
		// cetak update list
		printList(head_3028);
	 // tambahkan node baru di belakang
	 System.out.print("tambah 1 simpul di belakang: ");
	 int data2_3028 = 7;
	 head_3028 = insertAtEnd(head_3028, data2_3028);
	 // cetak update list
	 printList(head_3028);
	System.out.print("tambah 1 simpul ke data 4: ");
	 int data3_3028 = 4;
	 int pos_3028=4;
     head_3028 = insertPos(head_3028,pos_3028,data3_3028);
	 // cetak update list
	 printList(head_3028);
	 
	}

}
