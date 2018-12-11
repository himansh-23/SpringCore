package com.springproject.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	
    	Vehicle obj=(Vehicle)context.getBean("bike");
    	obj.drive();
    	
    	Car obj2=(Car)context.getBean("car");
    	obj2.drive();
    	System.out.println(obj2);
//        System.out.println( "Hello World!" );
//    	Tyre t=(Tyre)context.getBean("tyre");
//    	System.out.println(t);
    }
}
