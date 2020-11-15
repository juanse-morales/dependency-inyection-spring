package com.dca.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.dca.di.aop.TargetObject;
import com.dca.di.lifecycle.ExplicitBean;
import com.dca.di.lifecycle.LifeCycleBean;

@SpringBootApplication
public class DependencyInyectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		TargetObject targetObject = context.getBean(TargetObject.class);
		targetObject.hello("Hello world");
		targetObject.foo();
	}

}
