package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("loaded");
		Student student = context.getBean("stu",Student.class);
		student.cheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherStudent",AnotherStudent.class);
		anotherStudent.startCheating();
		
		
		
		/*
		 * Student student = new Student(); MathCheat cheat = new MathCheat();
		 * student.setMathCheat(cheat);
		 */
		
		
	}

}
