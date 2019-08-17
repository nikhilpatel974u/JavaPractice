package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/*
		 * Student abhi = context.getBean("student",Student.class);
		 * abhi.displayStudentInfo();
		 */
		
		/*
		 * Student alay = context.getBean("student1",Student.class);
		 * alay.displayStudentInfo();
		 */
		
		Student jay = context.getBean("student2",Student.class);
		jay.displayStudentInfo();
		
		Student harsh = context.getBean("student3",Student.class);
		harsh.displayStudentInfo();
		
	}

}
