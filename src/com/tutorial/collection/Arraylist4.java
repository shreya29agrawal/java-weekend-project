package com.tutorial.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist4 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();// generic for specific type
		al.add("ram");
		al.add("tarun");
		al.add("tina");
		al.add(1,"arjun");
		al2.add("A");
		al2.add("B");
		System.out.println(al);
		al.addAll(2,al2);
		System.out.println(al);
		System.out.println(al.get(3));
		al.set(3, "c");
		System.out.println(al);
		al.set(3, al.get(3).concat("hello"));
		System.out.println(al);
		
		ListIterator<String> ltr=al.listIterator();
		System.out.println("forward direction");
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("backword direction");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		
		
	}

}
