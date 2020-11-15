package com.dca.di.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {
	
	// @Pointcut("execution(* com.dca.di.aop.TargetObject.*(..))")
	// @Pointcut("within(com.dca.di.aop.TargetObject)")
	@Pointcut("@annotation(DCAAnnotation)")
	public void targetObjectMethods() {
		
	}
}
