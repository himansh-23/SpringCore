package com.springproject.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Processor pr1=(Processor)context.getBean("processor1");
		Processor pr2=(Processor)context.getBean("processor1");
		
		System.out.println(pr1);
		System.out.println(pr2);
		
		 pr1=(Processor)context.getBean("processor2");
		 pr2=(Processor)context.getBean("processor2");
		 
		 System.out.println(pr1);
		 System.out.println(pr2);
	}

}
