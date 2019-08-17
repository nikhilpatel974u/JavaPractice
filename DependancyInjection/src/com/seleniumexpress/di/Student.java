package com.seleniumexpress.di;

public class Student {
	
	private int id;
	private String studentName;
	
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	public Student(int id)
	{
		this.id = id;
	}

	/* 
	 * We also use constructor for spring dependency injection , here we use <constructor-arg> in Beans.xml file
	 * 
	 * we use setter method for spring dependency injection , here we use <property> tag in Beans.xml file
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 */

	public void displayStudentInfo()
	{
		System.out.println("Student name is : " +studentName + " and Student id is : " +id);
	}

}
