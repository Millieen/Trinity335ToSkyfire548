import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ConvertItemTemplateTest {
    @Test
    public void test() throws IOException {
        String input335 = "./src/test/resources/mirmr_item_template.txt";
        String input548 = "./src/test/resources/skyfire_item_template.txt";
        String outputfile = "./item_template.txt";
        ConvertItemTemplate conveter = new ConvertItemTemplate();
        conveter.ConvertTXT(input335, input548, outputfile);
    }

}