package com.tutorial.linkedlist;

public class MyLinkedList {

	Node head;
	
	 class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	 public void printlist()
	 {
		 Node n=head;
		 while(n!=null)
		 {
			 System.out.println(n.data);
			 n=n.next;
			 
		 }
	 }
	 
	
	public static void main(String[] args) {
		MyLinkedList l1=new MyLinkedList();
		Node first=  l1.new Node(10);
		l1.head=first;
		Node second=  l1.new Node(20);
	    first.next=second;
	    Node third=  l1.new Node(30);
	    second.next=third;
	    third.next=null;
	    
	    l1.printlist();

	}

}
