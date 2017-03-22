package innossh.springboot.example.nonweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NonWebCommandLineRunner implements CommandLineRunner {

    @Autowired
    private ApplicationArguments appArgs;

    @Autowired
    private JsonValidator jsonValidator;

    @Override
    public void run(String... args) throws Exception {
        boolean verbose = appArgs.containsOption("verbose");
        appArgs.getNonOptionArgs().stream().forEachOrdered((s -> {
            boolean isValid = jsonValidator.validate(s, verbose);
            log.info(isValid ? "It's a JSON object!" : "It's not a JSON object.");
        }));
    }

}
