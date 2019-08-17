package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("CollegeConfig.class");
		System.out.println("loaded");
		College college = context.getBean("collegeBean",College.class);
		System.out.println("College object is : " + college);
		college.test();
	}

}
