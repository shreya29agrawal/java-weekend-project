package com.tutorial.controlstructure;

import java.util.Scanner;

public class NestedIfExample {

	void check()
	{
		String username,pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name");
		username = sc.next();
		System.out.println("enter password");
		pwd=sc.next();
		sc.close();
		if(username.equals("abcd"))
		{
			if(pwd.equals("xyz"))
				System.out.println("succesfull login");	
			else
				System.out.println("incorrect password");
				}
			else
			System.out.println("incorrect username");
		
	}
	public static void main(String[] args) {
		NestedIfExample obj=new NestedIfExample();
		obj.check();
		

	}

}
