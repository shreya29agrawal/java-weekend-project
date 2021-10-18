package com.tutorial.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("tom" , 21, "developer");
		Employee e2 = new Employee("peter" , 23, "tester");
		Employee e3 = new Employee("harry" , 25, "hr");
		
		ArrayList<Employee> ar=new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		Iterator<Employee> it = ar.iterator();
		while(it.hasNext())
				{
			Employee emp= it.next();	
				
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dep);
		System.out.println("**********");
		
				}
		
		
	}

}
