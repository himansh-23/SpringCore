/**
 * Compilation javac AppConfig.java
 * Purpose: This class is going to configure(make object of visible class) give it to whose required.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-11/12/18
 */

package com.springproject.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages= "com.springproject.aop")
public class AppConfig {

//If you dont want to use @ComponentScan Annotation So manually send the new object	
//	@Bean
//	public Visible sendVisible()
//	{
//		return new Visible();
//	}
}
