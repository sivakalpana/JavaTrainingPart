package com.abstractionpattern;

public class Nokia extends Device {
    private String ram;
	private String processor;
    
    public  Nokia(String ramSize, String processorType ) {
    	this.ram= ramSize;
    	this.processor= processorType;
    	
    	
    }
	@Override
	public String getDetails() {

           
		return "Nokia config ram:" +this.ram + "and Hp processor:" +this.processor  ;
	}
	@Override
	public String toString() {
		return " Nokia[ram=" + ram + ", processor=" + processor + ",]";
	}
}
