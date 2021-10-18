package com.tutorial.basics;

import java.util.Scanner;

// instance variable, user define variable
public class Student {
	int id;
	String  name; // String->class-> java.lang

	 Scanner sc=new Scanner(System.in);
	
	 void input()
	{ System.out.println("enter value of id in integer and name in string");
		id=sc.nextInt();
		name=sc.next();
		
	}
	
	void show(){
		System.out.println("id is "+id);
		System.out.println("name is "+name);
	}
	
	public static void main(String[] args) {
	 
		Student s1=new Student();
	 s1.input();
	 s1.show();
	 Student s2 = new Student();
	 s2.input();
	 s2.show();
	}

}
