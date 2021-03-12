package com.abstractionpattern;

public class Iphone extends Device {
private String ram; 
private String processor;
    
    public  Iphone(String ramSize, String processorType ) {
    	this.ram= ramSize;
    	this.processor= processorType;
    	
    	
    }
	@Override
	public String getDetails() {

           
		return "Iphone config ram:" +this.ram + "and Hp processor:" +this.processor  ;
	}
	@Override
	public String toString() {
		return "Iphone [ram=" + ram + ", processor=" + processor + ",]";
	}
	
}
