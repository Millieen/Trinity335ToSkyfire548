import org.junit.Test;

import java.io.IOException;

public class SinicizationGameObjectTemplateTest {
    @Test
    public void test() throws IOException {
        String input335 = "./src/test/resources/mirmr_gameobject_template.txt";
        String input548 = "./src/test/resources/skyfire_gameobject_template.txt";
        String outputfile = "./gameobject_template.txt";
        SinicizationGameObjectTemplate conveter = new SinicizationGameObjectTemplate();
        conveter.ConvertTXT(input335, input548, outputfile);
    }
}