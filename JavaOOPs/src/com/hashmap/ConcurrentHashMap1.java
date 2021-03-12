package com.hashmap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> m= new ConcurrentHashMap();
		m.put(100, "Dog");
		m.put(101, "Elephant");
		m.put(102, "Cat");
		m.put(103, "After");
	/*	m.putIfAbsent(101, "Elephant");
		//m.remove(102,"Cat");
		m.putIfAbsent(104,"Banana");
		m.replace(100,"Dog", "Fox" );
		//m.clear();
		
		System.out.println(m.contains("Cat"));
		
		System.out.println("The Mappings are" +m);
		System.out.println("the value associated with 102:" +m.get(102));
		
		System.out.println("the value Associated with 100:" +m.get(100));
		*/
		
		
		Iterator<ConcurrentHashMap.Entry<Integer,String> >itr =
				m.entrySet().iterator();
		while(itr.hasNext()) {
			ConcurrentHashMap.Entry<Integer,String> entry = itr.next();
			System.out.println("key = "+ entry.getKey() + ",Value = "+entry.getValue());
			
					
		}
		
		
		
		
		
		

	}

}
