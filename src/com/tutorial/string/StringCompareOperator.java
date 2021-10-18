package com.tutorial.string;

// string which use comparator operator not show true for new
 //string because it create different object everytime
 
public class StringCompareOperator {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3= new String("hello");
		String s4=new String("hello");
		System.out.println(s1==s2); //truw
		System.out.println(s1==s3); //false
		System.out.println(s3==s4);// false
	}

}
