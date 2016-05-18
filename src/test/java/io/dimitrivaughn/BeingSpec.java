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
    String returnName;


    @Before

    public void Sandbox() {
        Finn = new Being("Finn Mertens", "1234567890");
        directory = new Directory();


    }



}
