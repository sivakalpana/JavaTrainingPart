package com.hashmap;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
         
		
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("Yao Yao");
		ts.add("Volvo");
		ts.add("Cooking");
		ts.add("Watch");
		ts.add("zoo");
		ts.add("Kite");
		ts.add("Book");
		//ts.add("Kalpana");tree set will not allow duplicate
		
	/*	System.out.println("Tree Set is:" +ts);

		String check = "Cooking";
		System.out.println("contains" +check +" " +ts.contains(check));
		
    	System.out.println("First Value" +ts.first());
    	
    	System.out.println("Last Value" +ts.last());
		
    	String val = "Volvo";
    	System.out.println("Higher Value" +ts.higher(val));
    	System.out.println("Lower Value" +ts.lower(val));
			*/	
	   //ts.remove("B");
    	//ts.pollFirst();
    	//ts.pollLast();
    	 // Iterating though the TreeSet 
        for (String value : ts) 
            System.out.print(value 
                             + ", "); 
        System.out.println(); 
	}

}
