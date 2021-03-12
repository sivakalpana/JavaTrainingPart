package com.singletonclass;

public class DesignPattern {

	public static void main(String[] args) {
		Singleton s1=  Singleton.getInstance();
		Singleton s2=  Singleton.getInstance();
		System.out.println("s1: " +s1);
		System.out.println("s2: " +s2);
		System.out.println(s1.equals(s2));
		
	}

}
