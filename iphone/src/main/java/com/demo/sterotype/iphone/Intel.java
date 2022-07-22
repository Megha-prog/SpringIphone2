package com.demo.sterotype.iphone;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Intel implements MobileProcessor {
	public void process() {
		System.out.println("Good Processor");
	}
}