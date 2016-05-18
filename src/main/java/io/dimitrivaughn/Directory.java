package io.dimitrivaughn;

import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dimitrivaughn on 5/17/16.
 */

public class Directory {

// Declaring fields

    HashMap<String, Being> workingDirectory;

// Initializing HashMap in the constructor

    public Directory() {
        workingDirectory = new HashMap<String, Being>();
    }

// Adds a being to the working directory

    public void addBeing(Being being) {
        workingDirectory.put(being.getBeingName(), being);
    }

// Removes a being from the working directory

    public void removeBeing(Being being) {
        workingDirectory.remove(being.getBeingName());
    }

// Return the size of the working directory

    public int returnDirectorySize() {
        return workingDirectory.size();
    }

// Looks up beings by name

    public Being getBeing(String name) {
        return workingDirectory.get(name);
    }

// Output being phone number using name

    public String outputPhoneNumber(String name) {
        if (workingDirectory.containsKey(name)) {
            return printPhoneNumber(workingDirectory.get(name).getPhoneNumber());
        }
        System.out.println("This being does not exist!");
        return null;
    }

// Return being phone number arraylist by name

    public ArrayList<String> lookupPhoneNumber(String name) {
        if (workingDirectory.containsKey(name)) {
            return workingDirectory.get(name).getPhoneNumber();
        }
        System.out.println("This being does not exist!");
        return null;
    }

// print phone numbers

    public String printPhoneNumber(ArrayList<String> array) {
        String key = "";
        for (String phoneNum : array) {
            key += phoneNum + " ";
        }
        return key;
    }

// print all entries in working directory

    public String printFullDirectory() {
        String result = "";

        for (String name : workingDirectory.keySet()) {
            String keys = name.toString();
            ArrayList phoneNum = workingDirectory.get(name).getPhoneNumber();
            String values = printPhoneNumber(phoneNum);
            result += keys + " " + values;
        }

        return result;

    }

// print directory names

    public String printDirectoryNames() {
        String result = "";

        for (String name : workingDirectory.keySet()) {
            String keys = name.toString();
            result += keys + " ";
        }

        return result;

    }

 // look up being name by phone number

    public String reverseLookup(String phoneNumber){
        String result = "";
        for(Map.Entry<String, Being> entry : workingDirectory.entrySet()){
            for (String phoneNum: lookupPhoneNumber(entry.getKey())){
                if (phoneNum.equals(phoneNumber)){
                    result= entry.getKey();
                }
            }
        }
        return result;
    }

}


