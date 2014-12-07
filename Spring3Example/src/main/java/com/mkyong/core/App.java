package com.mkyong.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@Autowired
	HelloWorld helloWorld;

	public static void main(String[] args) {
		
		  ApplicationContext appcontext=new
		  ClassPathXmlApplicationContext("SpringBean.xml");
		 
		//FileSystemResource res = new FileSystemResource("C://Users//user//git//SpringHibernet//Spring3Example//src//main//resources//SpringBean.xml");

		//XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(res);
		// HelloWorld helloworld= (HelloWorld)appcontext.getBean("helloWorld");
		// new App().getHelloWorld();
		// new App().display();
		// helloworld.setName("soni");
		// HelloWorld helloworld1= (HelloWorld)appcontext.getBean("helloBean");
		// System.out.println("Name::"+helloworld1.getName());

		// System.out.println("Student Nam::"+helloworld.getStudent().getStdName());

	}

	private void display() {
		System.out.println("student Name::" + helloWorld);

	}

}
