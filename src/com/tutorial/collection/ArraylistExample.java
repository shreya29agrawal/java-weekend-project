package com.tutorial.collection;

import java.util.ArrayList;
// methods from collection framework
//<String>->generic type , type safety->class type
//Arraylist ->array is used to store the element
//by default size is 10 element


public class ArraylistExample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();// Object->super class
		al.add("ram");
		al.add("tom");
		al.add("ram");
		al.add("12");
		al.add("3.4");
		al.add("d");
		int i =9;
		al.add(i);//outoboxing->primitive to class type->Integer
		System.out.println(al);
		
		ArrayList<String> a2=new ArrayList<String>();// generic for specific type
		a2.add("ram");
		a2.add("tom");
		a2.add("Ram");
		a2.add("peter");
		a2.add("tina");
		System.out.println(a2);
		System.out.println("");
		
		for(String r:a2)
			System.out.println(r);
		System.out.println("");
		
		for(String r2:a2)
		if(r2.startsWith("r"))
			System.out.println(r2);
			
			
		
	}

}
