package com.tuturial.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronisedHashMAp {

	public static void main(String[] args) {
		Map<String,String> map1=new HashMap<String,String>();
		
        map1.put("A", "tom");
        map1.put("B", "ted");
        map1.put("C", "terry");
        
        // synchronized map
        Map<String,String> synmap=Collections.synchronizedMap(map1);
        System.out.println(synmap);
        
        // concurrent map
        ConcurrentHashMap<String,String> concmap = new ConcurrentHashMap();
        concmap.put("p", "java");
        concmap.put("q", "php");
        concmap.put("r", "selenium");
        
        System.out.println(concmap.get("p"));
        
        
        
        
        
	}

}
