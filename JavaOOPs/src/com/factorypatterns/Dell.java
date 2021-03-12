package com.factorypatterns;

public class Dell extends Laptop{
	 private String ram;
	    private String processor;
	    public  Dell(String ramSize, String processorType ) {
	    	this.ram= ramSize;
	    	this.processor= processorType;
	    	
	    }
		@Override
		public String getConfiguration() {

	           
			return "Dell config ram:" +this.ram + "Dell processor:" +this.processor ;
		}
		@Override
		public String toString() {
			return "Dell "
					+ "[ram=" + ram + ","
							+ " processor=" + processor + "]";
		}
	    
	}

