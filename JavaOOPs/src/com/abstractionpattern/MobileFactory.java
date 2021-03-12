package com.abstractionpattern;

public class MobileFactory extends AbstractDeviceFactory {

	@Override
	Device getGadget(DeviceType deviceType) {
		switch(deviceType)
		{
		case NOKIA:
			return new Nokia("2gb","Qualcom");
		case IPHONE:
			return new Iphone("4gb", "Intel");
		}
		return null;
	}
	
}
