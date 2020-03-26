package com.nttdata.factory;

public class Laptop implements ElectricDevice
{
	private int price=50000;
	private String name="Lenovo";
	
	@Override
	public void details() {
		System.out.println("Price:"+price+"\nName:"+name);		
	}

}
