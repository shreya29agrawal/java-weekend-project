package com.tutorial.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CompaerArraylist {

	public static void main(String[] args) {

//sorting then equal
	ArrayList<String> l1=new ArrayList<String>(Arrays.asList("a","b","c","e","g"));
		
	ArrayList<String> l2=new ArrayList<String>(Arrays.asList("t","b","j","e","g"));
	ArrayList<String> l3=new ArrayList<String>(Arrays.asList("t","b","j","e","g"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		System.out.println(l1.equals(l2));//return false
		System.out.println(l2.equals(l3)); // true
		
		// compare two list -> find out addition element
		
		ArrayList<String> l4=new ArrayList<String>(Arrays.asList("t","v","j","k","g"));
		ArrayList<String> l5=new ArrayList<String>(Arrays.asList("t","b","j","e","g"));
     
		// l4.removeAll(l5);
		// System.out.println(l4);
		
		// find out the missing element
		
		l5.removeAll(l4);
		System.out.println(l5);
		
		// find out the common element
		
		ArrayList<String> lang4=new ArrayList<String>(Arrays.asList("tally","vb","java","c++"));
		ArrayList<String> lang5=new ArrayList<String>(Arrays.asList("tally","basic","js","eclips","git"));
		lang4.retainAll(lang5);
		System.out.println(lang4);
	}

}
