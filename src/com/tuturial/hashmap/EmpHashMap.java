package com.tuturial.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class EmpHashMap {

	public static void main(String[] args) {
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		
		Employee e1=new Employee("tom",25,"QA");
		Employee e2=new Employee("peter",35,"fashion");
		Employee e3=new Employee("jack",28,"dev");
		
		 emp.put(1,e1 );
		 emp.put(2,e2 );
		 emp.put(3,e3 );
		 
		 // traves the hash map
		 
		 for(Entry<Integer,Employee> e: emp.entrySet())
		 {
			Integer i= e.getKey();
			Employee j=e.getValue();
			System.out.println(i+" information ");
			System.out.println(j.name+" "+j.age+" " +j.dept);
			System.out.println("  ");
		 }
		 
		 
		
		 

	}

}
