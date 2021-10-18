package com.tutorial.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizeArraylist {

	public static void main(String[] args) {
		List<String> nameList=Collections.synchronizedList(new ArrayList<String>());
		
		nameList.add("pythone");
		nameList.add("ruby");
		nameList.add("java");
		
		// methods that why need synchronized
		synchronized(nameList)
		{
			Iterator<String> it =nameList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}

		//CopyOnWriteArrayList -> class
		// don't need any explicit synchronisation on fetching and traversing
		
		CopyOnWriteArrayList empList = new CopyOnWriteArrayList();
		
		empList.add("tom");
		empList.add("peter");
		empList.add("harry");
		
		Iterator<String> it =empList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
