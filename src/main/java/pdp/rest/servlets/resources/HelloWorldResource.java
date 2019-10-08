package pdp.rest.servlets.resources;

import org.springframework.beans.factory.annotation.Autowired;
import pdp.rest.servlets.dto.HelloWorldDto;
import pdp.rest.servlets.service.HelloWorldService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloWorldResource {

    @Autowired
    private HelloWorldService helloWorldService;

    @Path("/hello/")
    @GET
    public HelloWorldDto helloWorldIndex() {
        String greeting = helloWorldService.hello();
        return new HelloWorldDto(greeting);
    }
}
