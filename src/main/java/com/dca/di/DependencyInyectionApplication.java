package com.dca.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dca.di.scopes.EjemploScopeService;

@SpringBootApplication
public class DependencyInyectionApplication {

	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		
		EjemploScopeService ejemploScopeService = context.getBean(EjemploScopeService.class);
		EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);
		
		log.info("Are beans equal {} ", ejemploScopeService.equals(ejemploScopeService1));
		log.info("Are beans == {} ", ejemploScopeService == ejemploScopeService1);
		log.info(""+ejemploScopeService);
		log.info(""+ejemploScopeService1);
		
		context.close();
	}

}
