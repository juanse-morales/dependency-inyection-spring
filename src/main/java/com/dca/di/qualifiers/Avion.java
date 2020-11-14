/**
 * 
 */
package com.dca.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Adminsitrador
 *
 */

@Component
public class Avion implements Volador{

	
	private static final Logger log = LoggerFactory.getLogger(Avion.class);

	
	@Override
	public void volar() {
		log.info("Soy un avión y estoy volando");
	}

}
