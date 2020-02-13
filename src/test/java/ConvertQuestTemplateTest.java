import org.junit.Test;

import java.io.IOException;

public class ConvertQuestTemplateTest {
    @Test
    public void test() throws IOException {
        String input335 = "./src/test/resources/mirmr_quest_template.txt";
        String input548 = "./src/test/resources/skyfire_quest_template.txt";
        String outputfile = "./quest_template.txt";
        ConvertQuestTemplate conveter = new ConvertQuestTemplate();
        conveter.ConvertTXT(input335, input548, outputfile);
    }

}