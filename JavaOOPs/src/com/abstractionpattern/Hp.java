

package com.abstractionpattern;


public class Hp extends Device  {
    private String ram;
	private String processor;
    
    public  Hp(String ramSize, String processorType ) {
    	this.ram= ramSize;
    	this.processor= processorType;
    	
    	
    }
	@Override
	public String getDetails() {

           
		return "HP config ram:" +this.ram + "and Hp processor:" +this.processor  ;
	}
	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", processor=" + processor + ",]";
	}
}
