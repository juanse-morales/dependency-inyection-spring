package com.dca.di.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean{

	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);
	
	
	// Se ejecuta durante la construcción del Bean "BeanNameAware"
	@Override
	public void setBeanName(String name) {
		log.info("Bean name aware: {} ", name);		
	}

	// Se ejecuta después de la inyección de dependencias
	@PostConstruct
	public void init() {
		log.info("Init");
	}
	
	// Se ejecuta antes de que el Bean sea desturido
	@PreDestroy
	public void destroyBean() {
		log.info("Destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("After properties set method");
	}

	@Override
	public void destroy() throws Exception {
		log.info("Destroy method");
	}
}
