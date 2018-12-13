package com.springproject.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springproject.core")
public class VehicleConfig  {

	//If you dont want to use @ComponentScan Annotation So manually send the new object	
//	@Bean
}
