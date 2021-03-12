package com.hashmap;

import java.util.concurrent.ConcurrentHashMap;

public class AddingConcurrent {

	public static void main(String[] args) {
		
		 ConcurrentHashMap<String, String> chm
         = new ConcurrentHashMap<String, String>();
		 chm.put("1","1");
		 chm.put("2","1");
		 chm.put("3","1");
		 chm.put("4","1");
		 chm.put("5","1");
		 chm.put("6","1");
		 System.out.println("Mapping into my CHM:" +chm);
		 
		ConcurrentHashMap<String, String> chm1
        = new ConcurrentHashMap<String, String>();
		chm1.putAll(chm);
		
		System.out.println("New Mapping into Chm1:" +chm1);
		chm1.replace("6","1","2");
		//chm1.remove("5");
		
		System.out.println("new added element" +chm1);
		String valueRemoved =  chm1.remove("10"); 
		  
	        // Printing the map after remove() 
	        System.out.println( 
	            "After removing mapping with key 10:"); 
	        System.out.println("Map: " + chm1); 
	        System.out.println("Value removed: "
	                         + valueRemoved); 
	        System.out.println(); 
		
	}

}
