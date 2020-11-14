/**
 * 
 */
package com.dca.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Adminsitrador
 *
 */

@Component
public class Perro extends Animal{

	public Perro(@Value("Rocky") String nombre, @Value("5") Integer edad) {
		super(nombre, edad);
	}

}
