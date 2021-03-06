package innossh.springboot.example.nonweb;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NonWebSpringBootApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NonWebSpringBootApplication.class).web(WebApplicationType.NONE).run(args);
    }

}
