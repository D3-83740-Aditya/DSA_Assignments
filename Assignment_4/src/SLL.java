
public class SLL {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	public int count;

	public SLL() {
		head = null;
		count = 0;
	}

	public boolean IsEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
		count++;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (IsEmpty())
			head = newnode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
		count++;
	}

	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if (head == null)
			head = newnode;
		else if (pos <= 1)
			addFirst(value);
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
		count++;
	}

	public int deleteFirst() {
		if (IsEmpty())
			return -1;
		else {
			int temp = head.data;
			head = head.next;
			count--;
			return temp;
		}
	}

	public int deleteLast() {
		if (head == null)
			return -1;
		else if (head.next == null) {
			int temp = head.data;
			head = null;
			count--;
			return temp;
		} else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			int temp = trav.data;
			trav.next = null;
			count--;
			return temp;
		}

	}

	public int deletePosition(int pos) {
		if (head == null)
			return -1;
		else if (pos <= 1)
			return deleteFirst();
		else if (head.next == null) {
			int temp = head.data;
			head = null;
			count--;
			return temp;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next.next != null; i++)
				trav = trav.next;
			int temp = trav.next.data;
			trav.next = trav.next.next;
			count--;
			return temp;
		}
	}

	public void display() {
		Node trav = head;
		System.out.print("List :: ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
}
