package com.airhacks;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("unsafe")
@Stateless
public class UnsecureEndpoint {
    @GET
    public String ping() {
        return "Priem from UnsecureEndpoint";
    }

}
