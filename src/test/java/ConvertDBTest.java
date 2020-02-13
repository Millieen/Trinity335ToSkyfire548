import org.junit.Test;

import java.io.IOException;

public class ConvertDBTest {

    @Test
    public void ConvertCharacters() throws IOException {
        String inputfile = "./src/test/resources/characters.txt";
        String outputfile = "./characters.txt";
        ConvertCharacters conveter = new ConvertCharacters();
        conveter.ConvertTXT(inputfile, outputfile);
    }

    @Test
    public void ConvertAccount() throws IOException {
        String inputfile = "./src/test/resources/account.txt";
        String outputfile = "./account.txt";
        ConvertAccount conveter = new ConvertAccount();
        conveter.ConvertTXT(inputfile, outputfile);
    }
}
