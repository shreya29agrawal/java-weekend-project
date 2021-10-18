package com.tuturial.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
	  HashMap<Integer,String> hm= new HashMap<Integer,String>();
	  
	  hm.put(1, "tom");
	  hm.put(2,"peter");
	  hm.put(3, "harry");
	  hm.put(4, "jhon");
	  
	  System.out.println(hm);
	  
	  for(Entry e:hm.entrySet())
	  {
		  System.out.println(e.getKey()+"  "+e.getValue()) ;
	  }
	  hm.remove(2);
	  System.out.println(hm);
	  
	  System.out.println(hm.containsKey(1));
	  System.out.println(hm.containsValue("shreya"));
	  
	  HashMap<Integer,String> hm1= new HashMap<Integer,String>();
	  

	}

}
