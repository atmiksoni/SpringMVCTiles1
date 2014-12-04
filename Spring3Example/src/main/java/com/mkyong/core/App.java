package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext appcontext=new ClassPathXmlApplicationContext("SpringBean.xml");
		HelloWorld helloworld= (HelloWorld)appcontext.getBean("helloBean");
		helloworld.setName("soni");
		HelloWorld helloworld1= (HelloWorld)appcontext.getBean("helloBean");
		System.out.println("Name::"+helloworld1.getName());
	}

}
