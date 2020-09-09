package com.airhacks;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("car")
@RolesAllowed("opal")
@DeclareRoles("opal")
public class MyEndpoint {

    @GET
    public String ping() {
        return "Priem";
    }

}
