import org.junit.Test;

import java.io.IOException;

public class ConvertCharactersTest {

    @Test
    public void test() throws IOException {
        String inputfile = "./src/test/resources/characters.txt";
        String outputfile = "./characters.txt";
        ConvertCharacters conveter = new ConvertCharacters();
        conveter.ConvertCharactersTXT(inputfile, outputfile);
    }
}
