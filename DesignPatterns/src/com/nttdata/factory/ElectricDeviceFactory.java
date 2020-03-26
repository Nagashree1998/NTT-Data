package com.nttdata.factory;

public class ElectricDeviceFactory {

	
	public  ElectricDevice getDevice(String device)
	{
		if (device==null)
			return null;
		else if(device.equals("MOBILE"))
			return new Mobile();
		else if(device.equals("LAPTOP"))
			return new Laptop();
		else
			return null;
	}
}
