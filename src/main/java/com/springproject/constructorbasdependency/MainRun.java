package com.springproject.constructorbasdependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springproject.scopes.Processor;

public class MainRun {

	public static void main(String[] args) {
				
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Company pr1=(Company)context.getBean("company");
		System.out.println(pr1.temp);
		System.out.println(pr1.x);
		
	}

}
