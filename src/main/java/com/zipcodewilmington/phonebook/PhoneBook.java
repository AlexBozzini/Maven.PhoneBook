package com.zipcodewilmington.phonebook;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private TreeMap<String, ArrayList> directory;
    public PhoneBook(){
        this.directory = new TreeMap<String, ArrayList>();
    }
    public void add (String name, ArrayList<String> phoneNumber){
        directory.put(name, phoneNumber);
        }
    public void remove (String name, ArrayList<String> phoneNumber){

    }
}
