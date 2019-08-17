package com.seleniumexpress.ioc;

public class Vodaphone implements Sim {
	
	public void call()
	{
		System.out.println("calling using Vodaphone");
	}
	
	public void data() 
	{
		System.out.println("browsing using Vodaphone");
		
	}

}