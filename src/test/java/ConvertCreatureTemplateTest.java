import org.junit.Test;

import java.io.IOException;

public class ConvertCreatureTemplateTest {

    @Test
    public void test() throws IOException {
        String input335 = "./src/test/resources/mirmr_creature_template.txt";
        String input548 = "./src/test/resources/skyfire_creature_template.txt";
        String outputfile = "./creature_template.txt";
        ConvertCreatureTemplate conveter = new ConvertCreatureTemplate();
        conveter.ConvertCreatureTemplatesTXT(input335, input548, outputfile);
    }
}