package com.assignment;

import java.util.Scanner;
import java.util.Stack;

class LinkedList2
{
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;		
		}
		
	}
	public static int count=0;
	private static Node head;
	int iCnt=0;
	
	public LinkedList2()
	{
		head=null;
	}
	
	
	public void InsertFirst(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
		count++;
	}
	
	public void InsertLast(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node trav=head;
			while(trav.next!=null)
			{
				trav=trav.next;
			}
			trav.next=newnode;
		}
		count++;
	}
	

	

	
	public void InsertAtPos(int pos,int data)
	{
		Node newnode=new Node(data);
		if(pos>count+1)
		{
			System.out.println("1. Enter valid position");
			return;
		}
		else
		{
			if(head==null)
			{
				head=newnode;
			}
			else if(pos==count+1)
			{
				InsertLast(data);
			}
			else
			{
				Node trav=head;
				while((pos-1)>1)
				{
					trav=trav.next;
					pos--;
				}
				newnode.next=trav.next;
				trav.next=newnode;
				
			}
		}
		
		
		count++;
	}
	
	

	
	
	public void display()
	{
		Node trav=head;
		while(trav!=null)
		{
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
		System.out.println("");
	}
	
	public void displayReverse()
	{
		Stack<Integer> st=new Stack<Integer>();
		Node trav=head;
		while(trav!=null)
		{
			st.push(trav.data);
			trav=trav.next;
		}
		while(!st.isEmpty())
		{
			System.out.print(" "+st.pop());
		}
		System.out.println(" ");
	}
	
	
}





public class Question_3 {

	public static int menu(Scanner sc)
	{
		System.out.println("0. EXIT");
		System.out.println("1. Insert data in integer");

		System.out.println("2. Display LinkedList");
		System.out.println("3. Display reverse LinkedList");
		
		System.out.println("Enter your choice: ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		LinkedList2 ll=new LinkedList2();
		while((choice=menu(sc))!=0)
		{
			switch (choice) 
			{
			case 0:
				return;
			
			case 1:
				System.out.println("Enter your data: ");
				int no=sc.nextInt();
				ll.InsertLast(no);	
				break;
				
			case 2:
				ll.display();
				break;
				
			case 3:
				System.out.println("Enter your data for new node: ");
				int no2=sc.nextInt();
				System.out.println("Enter your data existing node: ");
				int no3=sc.nextInt();
				ll.beforeNode(no2,no3);
				break;
				
			
			default:
				System.out.println("Invalid choice..!!");
				break;
			}
		}
		
		
	}

}
