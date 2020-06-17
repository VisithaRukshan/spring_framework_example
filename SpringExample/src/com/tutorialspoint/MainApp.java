package com.tutorialspoint;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	

	 public static void main(String[] args) {
	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      
	      Test obj1 = (Test) context.getBean("test");
	      obj1.getMessage();
	      
	      context.registerShutdownHook();
	   }
	
}
