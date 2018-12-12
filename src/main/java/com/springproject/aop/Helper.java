/**
 * Compilation javac Helper.java
 * Purpose: This class is behave like log operation which is required when we need to save operations.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-11/12/18
 */

package com.springproject.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	@Before("execution (public void show())")
	public void log()
	{
		System.out.println("Log Called");
	}
	
	@After("execution (public void show())")
	public void log2()
	{
		System.out.println("Log2 Called");
	}
}
