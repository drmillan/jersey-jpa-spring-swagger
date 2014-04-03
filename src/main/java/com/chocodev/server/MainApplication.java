/**
 * 
 */
package com.chocodev.server;

import java.util.HashSet;
import java.util.Set;

import com.chocodev.server.resources.FooResource;
import com.wordnik.swagger.jersey.listing.ApiListingResourceJSON;
import com.wordnik.swagger.jersey.listing.JerseyApiDeclarationProvider;
import com.wordnik.swagger.jersey.listing.JerseyResourceListingProvider;

/**
 * Base Jersey/Spring Application
 * 
 * @author Daniel Rodriguez Millan
 * 
 */
public class MainApplication extends javax.ws.rs.core.Application {
    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>() {
            private static final long serialVersionUID = 3765976593299491721L;
            {
                // Add your resources, this is required (multiple dependency bugs on autodiscovery require this)
                add(FooResource.class);
                // Swagger
                add(ApiListingResourceJSON.class );
                add(JerseyApiDeclarationProvider.class );
                add(JerseyResourceListingProvider.class );
            }
        };
    }
}
