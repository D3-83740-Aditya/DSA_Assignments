
public class Stack {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node top;
	public int count;

	public Stack() {
		top = null;
		count = 0;
	}

	public boolean IsEmpty() {
		return top == null;
	}

	public void push(int value) {
		Node newnode = new Node(value);
		newnode.next = top;
		top = newnode;
		count++;
	}

	public int pop() {
		if (IsEmpty())
			return 0;
		else {
			Node temp = top;
			top = top.next;
			count--;
			return temp.data;
			
		}
	}

	public void peek() {
		if (top == null) {
			System.out.println("null");
			return;
		}
		System.out.println("top : "+top.data);

	}

	public void display() {
		Node trav = top;
		System.out.println("Stack :: ");
		while (trav != null) {
			System.out.println("| " + trav.data+" |");
			System.out.println(" ---- ");
			trav = trav.next;
		}
		System.out.println("");
	}
}
