package com.String;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s= "  WORdr rjr, jr,r  ";
       String s1 = "Word rr";
      // System.out.println(s1.toUpperCase());
     // System.out.println(s.toLowerCase());
	 //System.out.println(s.concat(s1));
	//  System.out.println(s.charAt(2));
	  //System.out.println(s1.indexOf("rd", 2));
	 // System.out.println(s.substring(3,6));
	  //System.out.println(s.replace('r' , 'd'));
	 // System.out.println(s.trim());
	  System.out.println(s);
       if(s1.startsWith("word")) {
		 System.out.println("s1 start with words");
	 }
	 if(s1.endsWith("word")) {
		 System.out.println("s1 start with words");
	 }
	 if(s.equals(s1)) {
		 System.out.println("s1 and s2 are equal");
	 }
	}

}
