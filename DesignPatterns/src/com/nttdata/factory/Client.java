package com.nttdata.factory;

import java.util.Scanner;

public class Client {

	public static void main(String args[]){
		ElectricDeviceFactory device= new ElectricDeviceFactory();
		System.out.println("Choose option \n1.Laptop\n2.Mobile");
		Scanner a=new Scanner(System.in);
		String devicename=a.next();
		
		System.out.println(devicename);
		ElectricDevice dev=device.getDevice(devicename.toUpperCase());
		dev.details();
		
	}
}
