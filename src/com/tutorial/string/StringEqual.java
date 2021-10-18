package com.tutorial.string;

public class StringEqual {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4="wellcome";
		String s5="HELLO";
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s4)); // false
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equalsIgnoreCase(s5)); //true
		

	}

}
