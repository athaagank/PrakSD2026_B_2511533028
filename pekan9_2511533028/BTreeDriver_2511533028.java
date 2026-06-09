package pekan9_2511533028;

public class BTreeDriver_2511533028 {
	public static void main(String[] args) {
		// Membuat Pohon
		BTree_2511533028 tree_3028 = new BTree_2511533028();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_3028.countNodes());
		// menambahkan simpul data 1
		Node_2511533028 root_3028 = new Node_2511533028(1);
		// menjadikan simpul 1 sebagai root
		tree_3028.setRoot(root_3028);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_3028.countNodes());
		Node_2511533028 node2 = new Node_2511533028(2);
		Node_2511533028 node3 = new Node_2511533028(3);
		Node_2511533028 node4 = new Node_2511533028(4);
		Node_2511533028 node5 = new Node_2511533028(5);
		Node_2511533028 node6 = new Node_2511533028(6);
		Node_2511533028 node7 = new Node_2511533028(7);
		Node_2511533028 node8 = new Node_2511533028(8);
		Node_2511533028 node9 = new Node_2511533028(9);
		root_3028.setLeft(node2);
		node2.setLeft(node4);
		node2.setRight(node5);
		node4.setRight(node8);
		root_3028.setRight(node3);
		node3.setLeft(node6);
		node3.setRight(node7);
		node6.setLeft(node9);
		// Set root
		tree_3028.setCurrent(tree_3028.getRoot());
		System.out.println("menampilkan simpul terakhir: ");
		System.out.println(tree_3028.getCurrent().getData());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_3028.countNodes());
		System.out.println("InOrder: ");
		tree_3028.printlnorder();
		System.out.println("\nPreorder: ");
		tree_3028.printPreOrder();
		System.out.println("\nPostorder: ");
		tree_3028.printPostOrder();
		System.out.println("\nDmenampilkan  simpul dalam bentuk pohon");
		tree_3028.print();
	}

}
