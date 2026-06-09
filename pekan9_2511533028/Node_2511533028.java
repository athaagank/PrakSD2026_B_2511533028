package pekan9_2511533028;

public class Node_2511533028 {
	int data_3028;
	Node_2511533028 left_3028;
	Node_2511533028 right_3028;
	public Node_2511533028(int data_3028) {
		this.data_3028 = data_3028;
		left_3028 = null;
		right_3028 = null;
	}
	public void setLeft (Node_2511533028 node) {
		if (left_3028 == null)
			left_3028 = node;
	}
	public void setRight (Node_2511533028 node) {
		if (right_3028 == null)
			right_3028 = node;
	}
	public Node_2511533028 getLeft() {
		return left_3028;
	}
	public Node_2511533028 getRight() {
		return right_3028;
	}
	public int getData() {
		return data_3028;
	}
	public void setData(int data_3028) {
		this.data_3028 = data_3028;
	}
	
	void printPreorder (Node_2511533028 node) {
		if (node == null)
			return;
		System.out.print(node.data_3028 + " ");
		printPreorder(node.left_3028);
		printPreorder(node.right_3028);
	}
	void printPostorder(Node_2511533028 node) {
		if (node == null)
			return;
		printPostorder(node.left_3028);
		printPostorder(node.right_3028);
		System.out.print(node.data_3028 + " ");
	}
	void printInorder(Node_2511533028 node) {
		if (node == null)
			return;
		printInorder(node.left_3028);
		System.out.print(node.data_3028 + " ");
		printInorder(node.right_3028);
	}
	public String print() {
		return this.print("",true,"");
	    }
	public String print(String prefix, boolean isTail, String sb) {
		if (right_3028 != null) {
			right_3028.print(prefix + (isTail ? "|  " : "   "), false, sb);
		}
		System.out.println( prefix+(isTail ? "\\--  " : "/--  ")+data_3028);
		if (left_3028 != null) {
			left_3028.print(prefix+(isTail ? "   " : "|  "), true, sb);
		}
		return sb;
	}
}
