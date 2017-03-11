package innossh.springboot.example.notweb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NonWebSpringBootApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NonWebSpringBootApplication.class).web(false).run(args);
    }

}
