package com.tutorial.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
// count the occurrence of every character in string
	// mahika motwani
	//hm->linked has map
	
	public static void main(String[] args) {
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		s=sc.nextLine();
		char ar[] =s.toCharArray();
		
		LinkedHashMap<Character,Integer> hm =new LinkedHashMap<Character,Integer>();
		
		for(char r:ar)
		{
			if(hm.containsKey(r))
				hm.put(r,hm.get(r)+1);
			else
				hm.put(r,1);
		}
		System.out.println(hm);

		for(Map.Entry<Character,Integer>r:hm.entrySet())
		{
			System.out.println(r.getKey()+" : "+r.getValue());
		}
		
	}

}
