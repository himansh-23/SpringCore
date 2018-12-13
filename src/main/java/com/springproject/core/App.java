/**
 * Compilation javac App.java
 * Execution java com.springproject.core.App
 * Purpose: Main Class which is going to Ask for object from spring ApplicationContext.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-11/12/18
 */

package com.springproject.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args)
    {
    	//This Is For XML Based Configuration with Bean tag
    	//Instead Of ApplicationContext can be used BeanFactory
    		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");	   	
    	Vehicle vehicleObj=(Bike)context.getBean("vehicle");
    	vehicleObj.drive();
    	
    	//This Is For Java Config Based Configuration with A ConfigClass Who
    	//Implements @Configuration Interface Or By use @Bean Tag on That Method 
    	// Who is responsible for giving object of a particular class
    	context=new AnnotationConfigApplicationContext(VehicleConfig.class);
    	 vehicleObj=context.getBean(Car.class);
    	 vehicleObj.drive();
    	 
    }
}
