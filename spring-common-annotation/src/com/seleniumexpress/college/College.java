package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

	public void test()
	{
		System.out.println("testing method");
	}
}










/*
* @Component do same thing as <bean id = "collegeBean" class = "com.seleniumexpress.college.College"></bean> in Beans.xml file
* but we need to provide <context:component-scan base-package="com.seleniumexpress.college" /> in Beans.xml file
* with @Component annotation we can use @ComponentScan annotation 
* 
*
*and if we don't want to use xml file then we can do the configuration from java side using class(here, we use CollegeConfig.java) class
*and we use 
*/