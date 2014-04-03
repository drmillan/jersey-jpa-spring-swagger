/**
 * 
 */
package com.chocodev.server.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.chocodev.server.services.FooService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Web service resource for feeds
 * 
 * @author Daniel Rodriguez Millan
 * 
 */
@Path("/foo")
@Api(value = "/foo")
public class FooResource {
    @Autowired
    public FooService fooService;

    /**
     * Returns a list of RSS Sources
     * 
     * @return
     */
    @GET
    @Path("/foo/list")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "/foo/list", httpMethod = "GET")
    public Response getFooList() {
        return Response.ok(fooService.getFooObjects()).build();
    }

}
