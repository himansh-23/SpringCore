package com.springproject.autowirequalifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRun {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ProcessorConfig.class);
		
		Motorola p=context.getBean(Motorola.class);
		p.show();
		
		
	}

}
