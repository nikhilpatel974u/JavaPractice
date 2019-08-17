
package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		
		Sim sim = context.getBean("sim",Sim.class);
		sim.call();
		sim.data();
		
		//((ClassPathXmlApplicationContext) context).close();
		//context.close();

	}

}
