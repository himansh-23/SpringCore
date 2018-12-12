package com.springproject.autowirequalifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Motorola {

	@Autowired
	@Qualifier("amd")
	Processor cpu;

	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}
	
	public void show()
	{
		cpu.process();
	}
	
	
	
	
}
