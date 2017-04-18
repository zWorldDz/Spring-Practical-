package com.dstar.handTyping;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		//Define Xml
		ClassPathXmlApplicationContext Context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	 
		InterfaceCoach theCoach = Context.getBean("theFlyCoach",InterfaceCoach.class);
		System.out.println(theCoach.getSpeed());
		Context.close();
	}

}
