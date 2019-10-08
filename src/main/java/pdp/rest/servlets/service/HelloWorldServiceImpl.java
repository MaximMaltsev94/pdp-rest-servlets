package pdp.rest.servlets.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String hello() {
        return "Hello world!!1!";
    }
}
