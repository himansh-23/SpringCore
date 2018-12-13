/**
 * Compilation javac MainRun.java
 * Execution java com.springproject.core.MainRun
 * Purpose: Class Whose Object is Created Using Normal Initailization.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-13/12/18
 */

package com.springproject.lazyinitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("lazy.xml");
		
		//Or we can use @Lazy annotation on the appconfig file with @Bean annotation 
		System.out.println("hello");
		context.getBean("a");
	}

}
