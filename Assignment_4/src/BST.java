
public class BST {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	public Node root;

	public BST() {
		root = null;
	}

	public void addNode(Node trav, int value) {
		Node newnode = new Node(value);
		if (trav == null) {
			root = newnode;
			return;
		}
		if (value > trav.data) {
			if (trav.right == null) {
				trav.right = newnode;
				System.out.println(trav.data+"-->"+newnode.data);
			} else
				addNode(trav.right, value);
		} else {
			if (trav.left == null) {
				trav.left = newnode;
				System.out.println(newnode.data+"<--"+trav.data);
			} else
				addNode(trav.left, value);
		}
	}
}
