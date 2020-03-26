package com.nttdata.factory;

public class Mobile implements ElectricDevice{
	private int price=15000;
	private String name="Redmi";
	
	@Override
	public void details() {
		
		System.out.println("Price:"+price+"\nName:"+name);		
	}

}
