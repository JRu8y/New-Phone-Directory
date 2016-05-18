package io.dimitrivaughn;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by dimitrivaughn on 5/17/16.
 */


public class DirectorySpec {

    Being Finn;
    Being Lemongrab;
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
        Lemongrab = new Being("Earl of Lemongrab", "2224536654");
        directory = new Directory();


    }


    @Test
    public void addBeingTest(){
        Being being;

        directory.addBeing(Finn);
        being = directory.workingDirectory.get("Finn Mertens");
        expectedName = "Finn Mertens";
        actualName = being.getBeingName();
        assertEquals("The name stored should be the same: Expected value = Finn Mertens", expectedName, actualName);

    }

    @Test
    public void removeBeingTest(){

        directory.addBeing(Finn);
        directory.removeBeing(Finn);
        expectedSize = directory.returnDirectorySize();
        actualSize = 0;
        assertEquals("The added key value pair should be removed: Expected value = 0", expectedSize, actualSize);
    }

    @Test
    public void outputPhoneNumberTest(){

        directory.addBeing(Finn);
        expectedValue = "1234567890 ";
        actualValue = directory.outputPhoneNumber("Finn Mertens");
        assertEquals("The actual phone number should match Finn's number: Expected value = 1234567890 ", expectedValue, actualValue);
    }

    @Test
    public void printDirectoryTest(){
        directory.addBeing(Finn);
        directory.addBeing(Lemongrab);
        expectedValue = "Earl of Lemongrab 2224536654 Finn Mertens 1234567890 ";
        actualValue = directory.printFullDirectory();
        assertEquals("The actual String should print entire hashmap: Expected value = ", expectedValue, actualValue);
    }

    @Test
    public void printDirectoryNamesTest(){
        directory.addBeing(Finn);
        directory.addBeing(Lemongrab);
        expectedValue = "Earl of Lemongrab Finn Mertens ";
        actualValue = directory.printDirectoryNames();
        assertEquals("The actual String should print entire hashmap (keys, values): Expected value = ", expectedValue, actualValue);
    }

    @Test
    public void reverseLookupTest(){
        directory.addBeing(Finn);
        expectedValue = "Finn Mertens";
        actualValue = directory.reverseLookup("1234567890");
        assertEquals("The actual String should print all hashmap names(keys): Expected value = ", expectedValue, actualValue);

    }




}
