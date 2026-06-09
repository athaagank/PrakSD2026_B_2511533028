package pekan9_2511533028;

public class BTree_2511533028 {
	private Node_2511533028 root_3028;
	private Node_2511533028 currentNode_3028;
	public BTree_2511533028() {
		root_3028 = null;
	}
	public boolean search(int data_3028) {
		return search(data_3028);
	}
	private boolean search(Node_2511533028 node, int data_3028) {
		if (node.getData() == data_3028)
			return true;
		if (node.getLeft() != null)
			if (search(node.getLeft(), data_3028))
				return true;
		if (node.getRight() != null)
			if (search(node.getRight(), data_3028))
				return true;
		return false;
	}
	public void printlnorder() {
		root_3028.printInorder(root_3028);
	}
	public void printPreOrder() {
		root_3028.printPreorder(root_3028);
	}
	public void printPostOrder() {
		root_3028.printPostorder(root_3028);
	}
	
	public Node_2511533028 getRoot() {
		return root_3028;
	}
	public boolean isEmpty() {
		return root_3028 == null;
	}
	public int countNodes() {
		return countNodes(root_3028);
	}
	
	private int countNodes(Node_2511533028 node) {
		int count = 1;
		if (node == null) {
			return 0;
		} else {
			count += countNodes(node.getLeft());
			count += countNodes(node.getRight());
			return count;
		}
	}
	
	public void print() {
		root_3028.print();
	}
	
	public Node_2511533028 getCurrent() {
		return currentNode_3028;
	}
	
	public void setCurrent (Node_2511533028 node) {
		this.currentNode_3028 = node;
	}
	
	public void setRoot (Node_2511533028 root_3028) {
		this.root_3028 = root_3028;
	}

}
