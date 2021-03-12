package com.hashmap;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		//int [] a= {3,5,1};
		//System.out.println(a[1]);
		HashSet<String> h= new HashSet<String>();
		h.add("happy");
		h.add("mango");
		h.add("apple");
		
		//h.remove("mango");
		//h.clear();
		System.out.println(h);
		System.out.println(h.contains("mango"));
		System.out.println(h.isEmpty());

	}

}
