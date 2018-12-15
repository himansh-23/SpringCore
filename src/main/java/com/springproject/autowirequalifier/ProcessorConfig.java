/**
 * Compilation javac AMD.java
 * Purpose: This is Configuration file which is responsible for giving object when required.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/12/18
 */

package com.springproject.autowirequalifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages="com.springproject.autowirequalifier")
public class ProcessorConfig {
	/*for providing life cycle configuration we can imlement init and destroy method into Amd class So
	before calling constructor it call its life cycle related code*/
	@Bean
	public Amd a()
	{
		return new Amd(5);
	}
	
	@Bean
	public Intel a2()
	{
		return new Intel(5);
	}
	
	@Bean
	public Motorola a3()
	{
		return new Motorola();
	}
}
