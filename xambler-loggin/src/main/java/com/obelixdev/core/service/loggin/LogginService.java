/**
 * 
 */
package com.obelixdev.core.service.loggin;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

/**
 * @author jorgguca
 *
 */

@Service("logginService")
public class LogginService implements ILogginService {

	@Override
	public Response getUserLoggin(String pass, String user) {
		 return Response.status(200).entity("Hola").build();
	}

}
