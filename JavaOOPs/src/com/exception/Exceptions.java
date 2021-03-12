package com.exception;

import java.util.ArrayList;

public class Exceptions {

	public static void main(String[] args) {
		//String [] pets = {"dog" , "cat", "monkey"};
		//System.out.println(pets[3]);
//indexoutofBoundException
		//int i= "dog";
		//unresolved compiltion problem
		//ArrayList<String> list= new ArrayList<String>() ;
		//list.get(0);//exception will come
		//ArrayList<String> list= null;
		//list.get(0);
		//Null pointer exception
		ArrayList<String> list= new ArrayList<String>() ;
		list.add("monkey");
		System.out.println(list.get(0));
	}
}
