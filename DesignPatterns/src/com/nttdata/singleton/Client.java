package com.nttdata.singleton;

public class Client {

	public static void main(String[] args) {

	    
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      Singleton object = Singleton.getInstance();
	      Singleton object1 = Singleton.getInstance();
	      //show the message
	      object.showMessage();
	      object1.showMessage();
	   }
}
