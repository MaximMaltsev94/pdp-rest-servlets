package pdp.rest.servlets.dto;

public class HelloWorldDto {
    private String greeting;

    public HelloWorldDto() {
    }

    public HelloWorldDto(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
