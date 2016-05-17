import java.util.ArrayList;

/**
 * Created by dimitrivaughn on 5/17/16.
 */

public class Character {

// Initializing fields

    private String name;
    private ArrayList<String> phoneNumber;

// Using constructor to instantiate a new character

    public Character(String name, String number){
        this.name = name;
        phoneNumber.add(number);
    }

// Getters and setters for phone number

    public ArrayList<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(ArrayList<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

// Getters and setters for name

    public String getCharacterName(){
        return this.name;
    }

    public void setCharacterName(String name){
        this.name = name;
    }
}
