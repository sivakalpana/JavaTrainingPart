package com.factorypatterns;

public class LaptopFactory {
 public static Laptop getLaptop(LaptopType laptopType) 
    {
	 switch(laptopType) {
		 
	 
	 case Hp:
	 return  new Hp("8gb", "Intel");
	 case Dell:
	 return new Dell("16gb", "Intel");
	 case Mac:
	 return new Mac("12gb", "Intel");
	 }
	 return null;
	 
    }
	
}
