import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

/**
 * Created by dimitrivaughn on 5/17/16.
 */
public class CharacterSpec {

    Character Finn;
    Directory directory;
    HashMap<String,Character> workingDirectory = new HashMap<String, Character>();


    @Before

    public void Sandbox() {
        Finn = new Character("Finn Mertens", "123-456-7890");
        directory = new Directory();
    }


    @Test
    public void addCharacter(){

        workingDirectory.put(Finn.getCharacterName(),Finn);

    }
}
