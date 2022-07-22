package com.demo.sterotype.iphone;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Iphone {
	
	@Autowired
	///@Qualifier("snapdragon")
	MobileProcessor processor;
	
	public void config() {
		System.out.println("Octa Core, 20MP, 8GB RAM");
		processor.process();
	}
}