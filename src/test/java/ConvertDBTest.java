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

    @Test
    public void ConvertCharacterAura() throws IOException {
        String inputfile = "./src/test/resources/character_aura.txt";
        String outputfile = "./character_aura.txt";
        ConvertCharacterAura conveter = new ConvertCharacterAura();
        conveter.ConvertTXT(inputfile, outputfile);
    }

    @Test
    public void ConvertItemInstance() throws IOException {
        String inputfile = "./src/test/resources/item_instance.txt";
        String outputfile = "./item_instance.txt";
        ConvertItemInstance conveter = new ConvertItemInstance();
        conveter.ConvertTXT(inputfile, outputfile);
    }
}
