package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    @Test
    public void addTest (){
        // given
        String name = "Test1";
        ArrayList<String> phoneNumber = "(302)372-8261", null;
        PhoneBook phoneBook = new PhoneBook();
        // when
        phoneBook.add(name, phoneNumber);
        // then
        String actual = phoneBook.lookup(name);
        Assert.assertEquals(phoneNumber, actual);
    }

    @Test
    public void removeTest (){
        // given
        String name = "Test1";
        String phoneNumber = "(302)372-8261";
        PhoneBook phoneBook = new PhoneBook();
        // when
        phoneBook.remove(name, phoneNumber);
        // then
    }
}
