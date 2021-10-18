package com.tutorial.hashmap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

         Hashtable h1= new Hashtable();
         h1.put(1,"tom");
         h1.put(2,"jerry");
         h1.put(3,"kate");
         
         System.out.println("hash table 1"+h1);
         
         Hashtable h2= new Hashtable();
         h2=(Hashtable)h1.clone();
         System.out.println("hash tabe 2"+h2);
         
         //contain value
         
         Hashtable st= new Hashtable();
         st.put(1,"java");
         st.put(2,"php");
         st.put(3,"python");
         if(st.contains("java"))
        	 System.out.println("match found it contain value");
         
         System.out.println("*****************");
         
         // print all value in hashtable using enumeration method
         Enumeration e=st.elements();
         System.out.println("print value fron st");
         
         while(e.hasMoreElements())
        	 System.out.println(e.nextElement());
         
         System.out.println("*****************");
         
         //get all the method from table through entry set
         System.out.println("print value through entry set");
         
         Set s = st.entrySet();
         System.out.println(s);
         System.out.println("*****************");
         
        	// check both the hash table equal or not 
         Hashtable st1= new Hashtable();
         st1.put(1,"java");
         st1.put(2,"php");
         st1.put(3,"python");
         st1.put(4, "java");
      
         // null key and null value not provide
        // st1.put(null, null);
         System.out.println(st1);
         System.out.println("*****************");
         
         if(st1.equals(st))
        	 System.out.println("table equal");
         else 
        	 System.out.println("not equal");
         
         // get the hachcode of key in hast table
         System.out.println("hashcode of key is "+st1.hashCode());
         
         
         


	}

}
