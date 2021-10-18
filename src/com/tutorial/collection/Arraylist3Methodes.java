package com.tutorial.collection;

import java.util.ArrayList;

public class Arraylist3Methodes {

	public static void main(String[] args) {
		ArrayList<String> a2=new ArrayList<String>();
		ArrayList<String> a1=new ArrayList<String>();// generic for specific type
		a2.add("ram");
		a2.add("tom");
		a2.add("Ram");
		a2.add("peter");
		a2.add("tina");
		
		a1.add("A");
		a1.add("B");
		a1.add("C");
		System.out.println(a2.size());
		System.out.println(a2.contains("peter"));
		System.out.println(a2.isEmpty());
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a2.containsAll(a1));
		a1.removeAll(a2);
		System.out.println(a2);
		a2.clear();
		System.out.println(a2);
		
	}

}
