package com.abstractionpattern;

public class LaptopFactory extends AbstractDeviceFactory {

	@Override
	Device getGadget(DeviceType deviceType) {
		switch(deviceType)
		{
		case HP:
			return new Hp("8gb","Intel" );
		case DEll:
			return new Dell("16gb", "Intel");
			
		}
		return null;
	}

}
