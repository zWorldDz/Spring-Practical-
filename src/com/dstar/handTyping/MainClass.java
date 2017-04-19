package com.dstar.handTyping;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		//Define XML
		ClassPathXmlApplicationContext Context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		InterfaceCoach theCoach = Context.getBean("theFlyCoach",InterfaceCoach.class);
		System.out.println(theCoach.getSpeed());
		System.out.println(theCoach.getFlyFortune());
		Context.close();
	}

}
