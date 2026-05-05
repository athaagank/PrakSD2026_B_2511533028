package pekan5_2511533028;

public class PencarianSLL_2511533028 {
	static boolean searchKey_3028(NodeSLL_2511533028 head_3028, int key_3028) {
		NodeSLL_2511533028 curr = head_3028;
		while (curr != null) {
		    if (curr.data_3028 == key_3028)
		    	return true;
		    curr = curr.next_3028;	
		}
		return false;
	}
	public static void traversal(NodeSLL_2511533028 head_3028) {
		// mulai dari head
		NodeSLL_2511533028 curr = head_3028;
		// telusuri sampai pointer null
		while (curr != null) {
			System.out.println(" "+curr.data_3028);
			curr = curr.next_3028;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		NodeSLL_2511533028 head_3028 = new NodeSLL_2511533028(14);
		head_3028.next_3028 = new NodeSLL_2511533028(21);
		head_3028.next_3028.next_3028 = new NodeSLL_2511533028(13);
		head_3028.next_3028.next_3028.next_3028 = new NodeSLL_2511533028(30);
		head_3028.next_3028.next_3028.next_3028.next_3028 = new NodeSLL_2511533028(10);
		System.out.print("Penelusuran SLL : ");
		traversal(head_3028);
		// data yang akan dicari
		int key_3028 = 30;
		System.out.print("cari data " +key_3028+ " = ");
		if (searchKey_3028(head_3028, key_3028))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");
	}

}
