/**
 * 
 */
package com.dca.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Adminsitrador
 *
 */

@Service
@Profile({"dev","default"})
public class DevEnvironment implements EnvironmentService{

	@Override
	public String getEnvironment() {
		return "Dev";
	}

}
