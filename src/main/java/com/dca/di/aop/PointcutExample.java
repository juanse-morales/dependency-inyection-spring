package com.dca.di.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {
	
	@Pointcut("execution(* com.dca.di.aop.TargetObject.*(..))")
	public void targetObjectMethods() {
		
	}
}
