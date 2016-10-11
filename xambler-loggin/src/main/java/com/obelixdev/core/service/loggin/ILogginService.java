/**
 * 
 */
package com.obelixdev.core.service.loggin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author jorgguca
 *
 */

@Path("/loggin")
public interface ILogginService {
		
    @GET
	@Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserLoggin(String pass, String user);

}
