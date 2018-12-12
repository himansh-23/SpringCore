/**
 * Compilation javac App.java
 * Execution java com.springproject.aop.App
 * Purpose: Main File Which Use Spring DI For Creating Object of Visible Class 
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-11/12/18
 */
package com.springproject.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Visible v1= context.getBean(Visible.class);
		v1.show();
		Visible v2= context.getBean(Visible.class);
		System.out.println(v1);
		System.out.println(v2);

	}

}
