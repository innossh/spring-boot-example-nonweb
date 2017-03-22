package innossh.springboot.example.nonweb;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class JsonValidator {

    public boolean validate(String jsonStr) {
        return validate(jsonStr, false);
    }

    public boolean validate(String jsonStr, boolean verbose) {
        try {
            new ObjectMapper().readValue(jsonStr, Map.class);
            if (verbose) {
                log.info(jsonStr);
            }
            return true;
        } catch (Exception e) {
            if (verbose) {
                log.info(e.getMessage());
            }
            return false;
        }
    }

}
