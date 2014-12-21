package com.mkyong.core;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.model.Child;
import com.mkyong.model.Parent;


public class App {

	

	public static void main(String[] args) {
		
		 ApplicationContext appcontext=new  ClassPathXmlApplicationContext("SpringBean.xml");
		 
		//FileSystemResource res = new FileSystemResource("C://Users//user//git//SpringHibernet//Spring3Example//src//main//resources//SpringBean.xml");

		//XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(res);
		 //HelloWorld helloworld= (HelloWorld)appcontext.getBean("helloWorld");
		 	Parent parent=appcontext.getBean("parent",Parent.class);
		
		 	System.out.println("parent::"+parent.getName());
		 	// new App().getHelloWorld();
		// new App().display();
		// helloworld.setName("soni");
		// HelloWorld helloworld1= (HelloWorld)appcontext.getBean("helloBean");
		// System.out.println("Name::"+helloworld1.getName());

		// System.out.println("Student Nam::"+helloworld.getStudent().getStdName());
	/* check single ton and proto type 
	 * 
	 * 
	 * 
	 */
		 parent.getChild().setChildName("parent-child");
		 
		 Child child=appcontext.getBean("child",Child.class);
		 System.out.println("child NMW::: "+child.getChildName());
	}

	

	private void display() {
		//System.out.println("parent Name::" + parent);

	}

}
