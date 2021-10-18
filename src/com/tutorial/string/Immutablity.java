package com.tutorial.string;
// string is immutable;



public class Immutablity {

	public static void main(String[] args) {
	String str ="shreya";
			str.concat("Agrawal");
			System.out.println(str);//shreya
			str=str.concat("Agrawal");
			System.out.println(str);// shreya agrawal

	}

}
