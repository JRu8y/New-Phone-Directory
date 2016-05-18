package io.dimitrivaughn;

import java.util.ArrayList;

/**
 * Created by dimitrivaughn on 5/17/16.
 */

public class Being {

// Initializing fields

    private String name;
    private ArrayList<String> phoneNumber;

// Using constructor to instantiate a new character

    public Being(String name, String number){

         phoneNumber = new ArrayList<String>();


        this.name = name;
        phoneNumber.add(number);
    }

// Getter for phone number

    public ArrayList<String> getPhoneNumber() {
        return this.phoneNumber;
    }


// Adds a phone number to Being

    public void addPhoneNumber(String number) {
        this.phoneNumber.add(number);
    }

// Remove a phone number from Being

    public void removePhoneNumber(int number) {
        this.phoneNumber.remove(number);
    }

// Getters and setters for name

    public String getBeingName(){
        return this.name;
    }

    public void setBeingName(String name){
        this.name = name;
    }








}
