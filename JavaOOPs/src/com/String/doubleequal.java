package com.String;

public class doubleequal {

	public static void main(String[] args) {
		String a= "DOG f IF";
		String b= new String("abcd");
		if(a.toLowerCase().equals("dog f if")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if( b == b) {
			System.out.println("true1");
		}else {
			System.out.println("false1");
		}

	}

}
