package com.tutorial.array;

import java.util.Scanner;

public class Student {

	int id;
	String name;
	
	Student(int i,String n)

	{
		id=i;
		name=n;
	}
	
	void show()
	{
		System.out.println(id+"    "+name);
	}
	
	
	
	
	public static void main(String[] args) {
		Student s[]=new Student[3];
		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("enter the id and name for student");
			id=sc.nextInt();
			name= sc.next();
		   s[i]=new Student(id,name);
					
		}
		System.out.println("array element");
		/*for(int i=0;i<3;i++)
		{
			s[i].show();
		}*/
		
		for(Student e:s)
		{
			e.show();
		}
		
		sc.close();
	}

}
