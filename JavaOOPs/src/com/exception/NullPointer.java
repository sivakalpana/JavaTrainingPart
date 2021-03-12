package com.exception;

import java.util.Scanner;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // String a = null;//this means nothing in the container
        //  System.out.println(a.length());
          //Null pointer exception will com because here string is Null
	        //int i= null;//float,double ,long these are biult in java becasuse these ar primitive in java
	        //String a=  null; //non primitive 
	       // Scanner scan = new Scanner(System.in); 
	        //Scanner is also non primitive
         /*  System.out.println("enter a number");
           Scanner scan = new Scanner(System.in);
           System.out.println(scan.nextInt());
  */
		Scanner scan =null;
		scan.nextInt();
	
	}

}
