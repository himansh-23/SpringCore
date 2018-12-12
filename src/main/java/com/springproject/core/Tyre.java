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

	private String brand;

	public String getBrand() {
		return brand; 
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString()
	{
		return ("brand is " +"Maserati");
	}
}
