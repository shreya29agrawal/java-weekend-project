package com.tutorial.string;
//compare value lexicographically
//return an integer value
//each character of both string convert into unicode value for comparision
//s1==s2
//s1>s2 positive value
//s1<s2 negative value
//compareToIgnoreCase is case insensitive

public class StringCompaerTo {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		
		String s3="wellcome";
		String s4="hi";
		String s5="HELLO";
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3));//-15
		System.out.println(s3.compareTo(s1));//15
		System.out.println(s4.compareTo(s2));//4
		System.out.println(s1.compareToIgnoreCase(s5)); //0
		

	}

}
