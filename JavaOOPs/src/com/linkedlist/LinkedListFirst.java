package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFirst {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(12);
		list.add(78);
		//list.remove();
		//list.clear();
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		
		/*Iterator it = list.iterator();
		while(it.hasNext()) {
			if((int)it.next() == 12) {
				System.out.println("we found 12:");
				
				
			}
		}*/
		
	}

}
