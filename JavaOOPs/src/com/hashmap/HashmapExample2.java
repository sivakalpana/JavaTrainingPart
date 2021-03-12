package com.hashmap;

import java.util.HashMap;

public class HashmapExample2 {

	public static void main(String[] args) {
		
		HashMap<String,String> fun = new HashMap<String,String>();
		 fun.put("Honey Singh" , "abcdefg");
		 fun.put("michel" , "Allover");
		 fun.put("Jackie chan" , "ghtjgh");
		 
		// fun.remove("michel", "Allover");
		 
		// System.out.println(fun.containsValue("ghtjg"));

		 System.out.println(fun.size());
		 System.out.println(fun.replace("michel","password"));
		 System.out.println(fun);
		 System.out.println(fun.keySet());



	}

}
