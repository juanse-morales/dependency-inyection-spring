package com.dca.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure {

	@Value("2.5")
	private double radius;
	
	@Override
	public double calculateArea() {
		
		return Math.PI * Math.pow(this.radius, 2);
	}

}
