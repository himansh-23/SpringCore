/**
 * Compilation javac Tyre.java
 * Purpose: Class Whose Object is going to created for the work
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-11/12/18
 */

package com.springproject.core;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	@Override
	public String toString()
	{
		return ("brand is " +"MRF");
	}
}
