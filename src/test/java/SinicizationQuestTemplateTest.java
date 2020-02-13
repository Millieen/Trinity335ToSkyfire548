import org.junit.Test;

import java.io.IOException;

public class SinicizationQuestTemplateTest {
    @Test
    public void test() throws IOException {
        String input335 = "./src/test/resources/mirmr_quest_template.txt";
        String input548 = "./src/test/resources/skyfire_quest_template.txt";
        String outputfile = "./quest_template.txt";
        SinicizationQuestTemplate conveter = new SinicizationQuestTemplate();
        conveter.ConvertTXT(input335, input548, outputfile);
    }

}