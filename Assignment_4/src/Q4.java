import java.util.Scanner;
import java.util.Stack;

//  4. Write a menu driven program to perform operations on linked list. Also provide option for undo. At any
// moment if you do undo, last operation performed on linked list should rollback. Your application
// should support at least 5 undo operations
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,pos,value;
		SLL list = new SLL();
		Stack<Pair> history = new Stack<Pair>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter choice : ");
			System.out.println("1. Add First");
			System.out.println("2. Add Last");
			System.out.println("3. Add at pos");
			System.out.println("4. Delete First");
			System.out.println("5. Delete Last");
			System.out.println("6. Delete at pos");
			System.out.println("7. Display");
			System.out.println("8. UNDO");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to be added : ");
				 value = sc.nextInt();
				list.addFirst(value);
				history.push(new Pair(1, value));
				break;
			case 2:
				System.out.print("Enter value to be added : ");
				value = sc.nextInt();
				list.addLast(value);
				history.push(new Pair(2, value));
				break;
			case 3:
				System.out.print("Enter pos : ");
				pos = sc.nextInt();
				if (pos < 1 || pos > list.count+1)
					System.out.println("Cannot add");
				else {
					System.out.print("Enter value : ");
					value = sc.nextInt();
					list.addPosition(value, pos);
					history.push(new Pair(3, value, pos));
				}
				break;
			case 4:
				if (!list.IsEmpty())
					history.push(new Pair(4, list.deleteFirst()));

				break;
			case 5:
				if (!list.IsEmpty())
					history.push(new Pair(5, list.deleteLast()));
				break;
			case 6:
				System.out.print("Enter pos : ");
				pos = sc.nextInt();
				if (pos < 1 || pos > list.count)
					System.out.println("Cannot delete");
				else
					history.push(new Pair(6, list.deletePosition(pos), pos));
				break;
			case 7:
				list.display();
				break;
			case 8:
				Pair p = history.pop();
				switch (p.opr) {
				case 1:
					list.deleteFirst();
					break;
				case 2:
					list.deleteLast();
					break;
				case 3:
					list.deletePosition(p.pos);
					break;
				case 4:
					list.addFirst(p.val);
					break;
				case 5:
					list.addLast(p.val);
					break;
				case 6:
					list.addPosition(p.val, p.pos);
					break;

				}
				break;
			default:
				break;
			}
		} while (choice != 0);

		sc.close();
	}

}

class Pair {
	int opr;
	int val;
	int pos;
	public Pair(int val1, int val2) {
		this.opr = val1;
		this.val = val2;
	}
	public Pair(int val1, int val2, int val3) {
		this.opr = val1;
		this.val = val2;
		this.pos = val3;
	}
}