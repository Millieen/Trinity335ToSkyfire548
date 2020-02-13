import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ConvertGameObjectTemplateTest {
    @Test
    public void test() throws IOException {
        String input335 = "./src/test/resources/mirmr_gameobject_template.txt";
        String input548 = "./src/test/resources/skyfire_gameobject_template.txt";
        String outputfile = "./gameobject_template.txt";
        ConvertGameObjectTemplate conveter = new ConvertGameObjectTemplate();
        conveter.ConvertTXT(input335, input548, outputfile);
    }
}