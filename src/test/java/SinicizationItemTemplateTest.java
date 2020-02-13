import org.junit.Test;

import java.io.IOException;

public class SinicizationItemTemplateTest {
    @Test
    public void test() throws IOException {
        String input335 = "./src/test/resources/mirmr_item_template.txt";
        String input548 = "./src/test/resources/skyfire_item_template.txt";
        String outputfile = "./item_template.txt";
        SinicizationItemTemplate conveter = new SinicizationItemTemplate();
        conveter.ConvertTXT(input335, input548, outputfile);
    }

}