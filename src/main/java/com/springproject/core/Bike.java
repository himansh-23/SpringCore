/**
 * Compilation javac Bike.java
 * Purpose: Class Whose Object is going to created for the work
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-11/12/18
 */

package com.springproject.core;

import javax.annotation.PostConstruct;

public class Bike implements Vehicle {
	public void drive()
	{
		System.out.println("Bike is stunting");
	}
	
}
