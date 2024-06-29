
public class Q2_main {

	public static void main(String[] args) {
		Deque dq = new Deque();
		dq.insert_front(10);
		dq.insert_rear(100);
		dq.insert_front(20);
		dq.insert_rear(110);
		dq.delete_front();
		dq.insert_front(30);
		dq.delete_rear();
		dq.insert_rear(120);

		dq.display();

	}

}
