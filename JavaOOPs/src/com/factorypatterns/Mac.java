package com.factorypatterns;

public class Mac extends Laptop {
	 private String ram;
	    private String processor;
	    public  Mac(String ramSize, String processorType ) {
	    	this.ram= ramSize;
	    	this.processor= processorType;
	    	
	    }
		@Override
		public String getConfiguration() {

	           
			return "Mac config ram:" +this.ram + "Mac processor:" +this.processor ;
		}
		@Override
		public String toString() {
			return "Mac {ram=" + ram + ", processor=" + processor + "}";
		}
	    
	
}
