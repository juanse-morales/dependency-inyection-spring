/**
 * 
 */
package com.dca.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Adminsitrador
 *
 */

@Component
public class Nido {
	
	//@Qualifier("pajarito")
	@Autowired
	private Animal animal;
	
	
	private static final Logger log = LoggerFactory.getLogger(Nido.class);

	public void imprimir() {
		log.info("Mi nido tiene el animal {} ", animal.getNombre());
	}
	
}
