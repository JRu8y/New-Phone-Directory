package io.dimitrivaughn;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by dimitrivaughn on 5/17/16.
 */
public class BeingSpec {

    Being Finn;
    Directory directory;
    String expectedName;
    String actualName;
    String expectedValue;
    String actualValue;
    int actualSize;
    int expectedSize;


    @Before

    public void Sandbox() {
        Finn = new Being("Finn Mertens", "1234567890");
        directory = new Directory();
    }

    @Test
    public void addPhoneNumberTest(){

        directory.addBeing(Finn);
        Finn.addPhoneNumber("3334546546");
        actualSize = 2;
        expectedSize = Finn.getPhoneNumber().size();
        assertEquals("The size of the array should be the same: Expected value = 2", expectedName, actualName);

    }

    @Test
    public void removePhoneNumberTest(){

        directory.addBeing(Finn);
        Finn.addPhoneNumber("3334546546");
        Finn.removePhoneNumber(1);
        actualSize = 1;
        expectedSize = Finn.getPhoneNumber().size();
        assertEquals("The size of the array should be the same: Expected value = 1", expectedName, actualName);

    }



}
