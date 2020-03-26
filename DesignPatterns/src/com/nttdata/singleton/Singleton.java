package com.nttdata.singleton;

public class Singleton {
	int count=0;
	private static Singleton instance = new Singleton();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private Singleton(){
		   count++;
		   System.out.println("No of objects Created"+count);
	   }

	   public static Singleton getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Singleton Design Pattern");
	   }
}
