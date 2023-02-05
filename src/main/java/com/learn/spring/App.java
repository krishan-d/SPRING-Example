package com.learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {
	public static void main(String[] args) {

		// BeanFactory...
//    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));

		// ApplicationContext...
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Basically spring-container is created by ApplicationContext and beans/object
		// are created within container even if not used

		// spring container...
		// scope : sigleton vs prototype
		
		Alien a1 = (Alien) factory.getBean("alien");
		a1.code();
		System.out.println(a1.getAge());

		// NOTE : by default spring follows singleton design pattern
		
		
		
		
		
	}
}
