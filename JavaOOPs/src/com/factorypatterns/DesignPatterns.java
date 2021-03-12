package com.factorypatterns;

public class DesignPatterns {

	public static void main(String[] args) {
		Laptop hp = LaptopFactory.getLaptop(LaptopType.Hp);
		Laptop dell = LaptopFactory.getLaptop(LaptopType.Dell);
		Laptop mac = LaptopFactory.getLaptop(LaptopType.Mac);
		
		System.out.println(hp.getConfiguration());
		System.out.println(hp.toString());
		System.out.println(dell.getConfiguration());
		System.out.println(dell.toString());
		System.out.println(mac.getConfiguration());
		System.out.println(mac.toString());
		
		
		
		
	}

}
