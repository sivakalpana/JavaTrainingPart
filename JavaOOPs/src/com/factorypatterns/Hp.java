package com.factorypatterns;

public class Hp extends Laptop {
    private String ram;
    private String processor;
    
    public  Hp(String ramSize, String processorType ) {
    	this.ram= ramSize;
    	this.processor= processorType;
    	
    	
    }
	@Override
	public String getConfiguration() {

           
		return "HP config ram:" +this.ram + "and Hp processor:" +this.processor  ;
	}
	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", processor=" + processor + ",]";
	}
    
}
