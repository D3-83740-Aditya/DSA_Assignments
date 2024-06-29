
public class Deque {
	static class Node {
		private int data;
		private Node next;
		private Node prev;

		private Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private int count;
	private Node front;
	private Node rear;

	public Deque() {
		count = 0;
		front = rear = null;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public void insert_front(int value) {
		Node newnode = new Node(value);
		if (count == 0)
			front = rear = newnode;
		else {
			newnode.next = front;
			front = newnode;
		}
		count++;
	}

	public void insert_rear(int value) {
		Node newnode = new Node(value);
		if (count == 0)
			front = rear = newnode;
		else {
			newnode.prev = rear;
			rear.next = newnode;
			rear = newnode;
		}
		count++;
	}

	public int delete_front() {
		if (count == 0)
			return 0;
		else if (count == 1) {
			Node temp = front;
			front = rear = null;
			count--;
			return temp.data;
		} else {
			Node temp = front;
			front = front.next;
			count--;
			return temp.data;
		}
	}

	public int delete_rear() {
		if (count == 0)
			return 0;
		else if (count == 1) {
			Node temp = rear;
			front = rear = null;
			count--;
			return temp.data;
		} else {
			Node temp = rear;
			rear = rear.prev;
			count--;
			return temp.data;
		}
	}

	public void display() {
		if (count == 0)
			System.out.println("Empty");
		else {
			Node trav = front;
			System.out.print("front <- ");
			while (trav != null) {
				System.out.print(trav.data + " ");
				trav = trav.next;
			}
			System.out.print("-> rear");
		}
	}
}
