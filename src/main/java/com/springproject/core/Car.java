/**
 * Compilation javac Bike.java
 * Purpose: Class Whose Object is going to created for the work
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-11/12/18
 */

package com.springproject.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired
	Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	public void drive()
	{
		System.out.println("Car is speeding");
		System.out.println(this);
	}
	
	public String toString()
	{
		return "Car Tyre"+tyre;
	}
}
