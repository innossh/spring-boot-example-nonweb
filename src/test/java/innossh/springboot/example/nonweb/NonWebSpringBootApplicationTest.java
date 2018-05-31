package innossh.springboot.example.nonweb;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

import static org.assertj.core.api.Assertions.assertThat;

public class NonWebSpringBootApplicationTest {

    @Rule
    public OutputCapture out = new OutputCapture();

    @Test
    public void testJson() throws Exception {
        NonWebSpringBootApplication.main(new String[]{"--verbose", "{\"hoge\":\"fuga\"}"});
        assertThat(this.out.toString()).contains("It's a JSON object!");
    }

    @Test
    public void testNotJson() throws Exception {
        NonWebSpringBootApplication.main(new String[]{"--verbose", "invalid"});
        assertThat(this.out.toString()).contains("It's not a JSON object.");
    }

}
