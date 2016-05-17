package io.dimitrivaughn;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

/**
 * Created by dimitrivaughn on 5/17/16.
 */
public class BeingSpec {

    Being Finn;
    Directory directory;
    HashMap<String,Being> workingDirectory = new HashMap<String, Being>();


    @Before

    public void Sandbox() {
        Finn = new Being("Finn Mertens", "1234567890");
        directory = new Directory();
    }


    @Test
    public void addCharacterTest(){
        Being being;

        workingDirectory.put(Finn.getCharacterName(),Finn);
        being = workingDirectory.get("Finn Mertens");
        System.out.println(being);


    }
}
