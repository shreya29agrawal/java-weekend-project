package com.tutorial.string;
// methodes for string class

public class StringClassMethodes {

	public static void main(String[] args) {
		String s1 = "Hello, How are you";
		String s2="Welcome";
		String s3="good-luck";
		String s4="hello";
		String s5="GOOD";
		String s6="      shreya     ";
		
		
		System.out.println(s1.charAt(1));//e
		System.out.println(s2.length());//7
		System.out.println(s1.substring(7));//how are you
		System.out.println(s1.substring(7,11));  //how
		System.out.println(s3.toUpperCase());  //GOOD-LUCK
		System.out.println(s5.toLowerCase());  //good
		System.out.println(s3.replace("good", "bad"));//  bad uck
		System.out.println(s1.contains("are"));  //true
		System.out.println(s1.endsWith("bye"));// false
	    System.out.println(s1.startsWith("Hello"));  // true
	    System.out.println(s6.trim());  //shreya
	    System.out.println(s4.indexOf("l"));//2 print value of first l
		

	}

}
