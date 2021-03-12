package com.abstractionpattern;

public class Class {

	public static void main(String[] args) {
		Device dell= FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DEll);
		
		System.out.println(dell.getDetails());
		
		AbstractDeviceFactory mobilefactory= FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY);
		Device nokia = mobilefactory.getGadget(DeviceType.NOKIA);
		
		System.out.println(nokia.getDetails());
		System.out.println(nokia.toString());
	}

}
