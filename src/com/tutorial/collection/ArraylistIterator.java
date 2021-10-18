package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Iterator;
// iterator is universal cursor -> it can work with any collection class
public class ArraylistIterator {

	public static void main(String[] args) {
		ArrayList<String> a2=new ArrayList<String>();// generic for specific type
		a2.add("ram");
		a2.add("tom");
		a2.add("Ram");
		a2.add("peter");
		a2.add("tina");
		
		/*for(String r:a2)
			System.out.println(r);
		System.out.println("");
		*/
		Iterator<String> it = a2.iterator();	
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			while(it.hasNext())
			{
				if(it.next().equals("ram"));
				it.remove();
				
				
			}
			
			
			
						
			
			
		/*
		 * class Arraylist
		 * {
		 * Itr iterator()
		 * {return new Itr()
		 * }
		 * 
		 * 
		 * private class Itr implement Iterator
		 * 
				
		 */

	}

}
