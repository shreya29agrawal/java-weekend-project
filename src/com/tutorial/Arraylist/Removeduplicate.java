package com.tutorial.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
// linkedHashset remove duplicate value




public class Removeduplicate {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,2,3,5,3,1,5,7,8,9,4));
		System.out.println(number);
        LinkedHashSet<Integer> lhs= new  LinkedHashSet<Integer>(number);
        ArrayList<Integer> newlist = new ArrayList<Integer>(lhs);
        System.out.println(newlist);
        
        
        ArrayList<Integer> arl = new ArrayList<Integer>(Arrays.asList(1,2,3,4,2,3,5,3,1,5,7,8,9,4));
        List<Integer>arunique=arl.stream().distinct().collect(Collectors.toList());
        System.out.println(arunique);
        
	}

}
