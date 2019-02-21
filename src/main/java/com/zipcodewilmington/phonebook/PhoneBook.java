package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, List<String>> numberList;

    public PhoneBook(Map<String, List<String>> numberList){
       this.numberList = numberList;
    }

    public PhoneBook(){
        this.numberList = new TreeMap<String, List<String>>();
    }

    public List<String> lookup(String name) {
        return numberList.get(name);
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = lookup(name);

        if (numbers == null){
            numbers = new ArrayList<String>();
        }

        numbers.add(phoneNumber);
        numberList.put(name, numbers);
    }

    public void remove(String name) {
        numberList.remove(name);
    }

    public String reverseLookup(String phoneNumber) {
        for (String key: numberList.keySet()) {
            List<String> foundNumber = numberList.get(key);

            if (foundNumber.contains(phoneNumber)){
                return key;
            }

        }
        return null;
    }

    public String listNamesAndNumbers() {
        StringBuilder listOfNames = new StringBuilder();

        for (String key : numberList.keySet()){
            listOfNames.append(key);
            listOfNames.append("\n");
            for (String number : numberList.get(key)){
                listOfNames.append(number);
                listOfNames.append("\n");
            }
        }
        return listOfNames.toString();
    }
}
