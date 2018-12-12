/**
 * Compilation javac Intel.java
 * Purpose: This is Component Class For Main class which implements Processor interface
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/12/18
 */

package com.springproject.autowirequalifier;

import org.springframework.stereotype.Component;

@Component
public class Intel implements Processor{

	@Override
	public void process()
	{
		System.out.println("World's Best CPU");
	}	
}
