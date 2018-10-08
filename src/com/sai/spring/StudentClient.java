package com.sai.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentClient {

	public static void main(String[] args) {
		
	/* Traditional way of creating objects */
		
		Student eSt=new Student();
		
		eSt.setId(100);
		eSt.setFname("sai");
		eSt.setLname("kira");
		
		System.out.println(eSt);
		
		/*Using Spring IOC to create Objects*/
		
		//Resource resource=new ClassPathResource("student.xml");
		//BeanFactory factory= new XmlBeanFactory(resource);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		
		Student st1=(Student) context.getBean("student1");
		
		
		System.out.println(st1);
		
		
		ClassPathXmlApplicationContext ctx= (ClassPathXmlApplicationContext) context;
		
		ctx.close();
		
		

		
	}

}
