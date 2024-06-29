
public class Q1_main {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		s.peek();
		s.pop();
		s.pop();
		s.peek();
		s.display();

		Queue q = new Queue();
		q.push(10);
		q.push(20);
		q.pop();
		
		q.push(30);
		q.push(40);
		q.pop();
		q.push(100);
		q.display();
	}

}
