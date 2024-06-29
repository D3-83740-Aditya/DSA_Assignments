
public class Queue {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node rear;
	private Node front;
	public int count;

	public Queue() {
		rear = front = null;
		count = 0;
	}

	public boolean IsEmpty() {
		return count == 0;
	}

	public void push(int value) {
		Node newnode = new Node(value);
		if (count == 0) {
			front = rear = newnode;
		} else {
			rear.next=newnode;
			rear=newnode;
		}
		count++;
	}

	public int pop() {
		if (count == 0)
			return 0;
		else if (count==1) {
			Node temp = front;
			rear = front = null;
			count--;
			return temp.data;
		} else {
			count--;
			front = front.next;
			return front.data;
		}

	}

	public void display() {
		Node trav = front;
		System.out.print("front <- ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println(" <- rear");
	}
}
