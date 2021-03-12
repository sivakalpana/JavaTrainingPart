package com.hashmap;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetExample2 {

	public static void main(String[] args) {
		
		
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(123);
		hash.add(345);
		hash.add(897);
		
		//Object [] h = hash.toArray();
		//System.out.println(h[2]);
		//System.out.println(hash.hashCode());
		
		
		Iterator<Integer> it = hash.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//System.out.println();
	}

}
