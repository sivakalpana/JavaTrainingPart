package com.singletonclass;

public class Singleton {

	
	private static Singleton lazyInitialization=null;
	private Singleton() {}
	public static  synchronized Singleton getInstance(){
      if(lazyInitialization==null) {
    	synchronized(Singleton.class) 
    	{
      
		if(lazyInitialization==null) {
			lazyInitialization = new Singleton();
		 }
    	}
      }
		return lazyInitialization;		
	
      }
}
