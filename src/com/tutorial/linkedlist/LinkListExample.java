package com.tutorial.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		//add
		
		l1.add("java");
		l1.add("python");
		l1.add("ruby");
		l1.add("selenium");
		l1.add("php");
		l1.add("dot net");
		System.out.println(l1);
		
		// add first
		l1.addFirst("c++");
		l1.addLast("spring");
		System.out.println(l1);
		
		// get and set value
		
		
		System.out.println(l1.get(4));
		l1.set(3,"hibernet");
		System.out.println(l1.get(3));
		
		
		//remove
		
		System.out.println(l1.removeFirst());
		l1.removeLast();
		System.out.println(l1);
		l1.remove(3);
		System.out.println(l1);
		
		//
		
		//traversing
		
		for(int n=0;n<l1.size();n++)
			System.out.println(l1.get(n));
		
		System.out.println("*****************");
		
		Iterator<String> it =l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("*****************");
		// enhanced for loop
		for(String str:l1)
			System.out.println(str);

	}

}
