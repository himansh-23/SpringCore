/**
 * Compilation javac AMD.java
 * Purpose: This is Configuration file which is responsible for giving object when required.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/12/18
 */

package com.springproject.autowirequalifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="com.springproject.autowirequalifier")
public class ProcessorConfig {
	
	
}
