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
    	
   /* 	Vehicle obj=(Vehicle)context.getBean("vehicle");
    	obj.drive();*/
    	
    	Vehicle obj2=(Car)context.getBean("car");
    //	obj2.drive();
    	System.out.println(obj2);
//        System.out.println( "Hello World!" );
//    	Tyre t=(Tyre)context.getBean("tyre");
//    	System.out.println(t);*/
    }
}
