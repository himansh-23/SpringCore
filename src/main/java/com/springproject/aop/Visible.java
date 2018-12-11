package com.springproject.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



@Component
public class Visible {
	
	public void show()
	{
		System.out.println("Showing something");
	}
}
