/**
 * Compilation javac Visible.java
 * Purpose: A class whose object is going to created 
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-11/12/18
 */

package com.springproject.aop;

import org.springframework.stereotype.Component;

@Component
public class Visible {
	
	//int val;
	public void show()
	{
		System.out.println("Showing something");
	}
}
