package com.tutorial.linkedlist;

public class AddNewNode {

	Node head;
	 
	class Node{
		 int data; 
		 Node next;
		 
		 Node(int data){ 
		 this.data=data;
		 this.next=null;
		 }
	 }
	
	// add at first
      public void addNewFirst(int data)
	
	{
		Node f1=new Node( data);
		f1.next=head;
		head=f1;
	}
      
      // add at mid
      
      public void addAtMid(Node pre_node,int data)
      {
    	  if (pre_node.next==null)
    	  {  System.out.println("previous node cannot be null");
    		  return ;
    	  }
    	  else
    	  {
    		  Node mid_node =new Node(data);
    		  mid_node.next=pre_node.next;
    		  pre_node.next=mid_node;
    		  
    	  }
      }
      
      public void addAtLast(int data)
      {
    	  Node new_node = new Node(data);
    	  
          /* 4. If the Linked List is empty, then make the
                new node as head */
          if (head == null)
          {
              head = new Node(data);
              return;
          }
   
          /* 4. This new node is going to be the last node, so
                make next of it as null */
          new_node.next = null;
   
          /* 5. Else traverse till the last node */
          Node last = head;
          while (last.next != null)
              last = last.next;
   
          /* 6. Change the next of last node */
          last.next = new_node;
          return;
    	  
      }
      
      
      
	public void add()
	{
		Node n=head;
		while(n!=null)
		 {
			 System.out.println(n.data);
			 n=n.next;
			 
		 }
	}
    
	
	
	public static void main(String[] args) {
		
		AddNewNode ann=new AddNewNode();
	
		Node a1 = ann.new Node(10);
		ann.head=a1;
		Node b2 = ann.new Node(30);
		a1.next=b2;
		Node c3 = ann.new Node(50);
		b2.next=c3;
		ann.addNewFirst(5);
		ann.addAtMid(a1,20);
		ann.addAtLast(70);
		ann.add();
		
		 
		
	}

}
