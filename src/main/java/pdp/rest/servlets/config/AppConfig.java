package pdp.rest.servlets.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {
    public AppConfig() {
        packages("pdp.rest.servlets.resources");
        register(JacksonFeature.class);
    }
}
