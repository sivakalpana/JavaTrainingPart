package com.hashmap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		int a=10;
		int b= 20;
		int c = 99;
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a",10);
		happy.put("b",20);
		happy.put("c",99);
		
		//System.out.println(happy);
		System.out.println(happy.get("b"));
	}

}
