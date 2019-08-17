package com.seleniumexpress.ioc;

public class Airtel implements Sim {
	
	public Airtel() {
		System.out.println("Airtel constructor called");
	}

	public void call()
	{
		System.out.println("calling using Airtel");
	}
	
	public void data() 
	{
		System.out.println("browsing using Airtel");
		
	}

}