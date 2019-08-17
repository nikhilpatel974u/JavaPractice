package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	//@Value("${student.name}")
	private String name;
	private String interestedCourse;
	private String hobby;
	
	/*if we use @Value annotation before variable then we don't need setter mathod
	 * ex : -  @Value("${student.name}")
	 * 		   private String name;
	 * */
	
	//@Value("Nikhil")
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
		System.out.println("using setName method");
	}
	
	@Required
	//@Value("Java")
	@Value("${student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
		System.out.println("using setInterestedCourse method");
	}
	
	@Required
	//@Value("cricket")
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void display()
	{
		System.out.println("Student Name : " + name);
		System.out.println("Student interested course : " + interestedCourse);
		System.out.println("Student hobby : " + hobby);
	}
	

}
