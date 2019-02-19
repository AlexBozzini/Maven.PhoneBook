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
        ArrayList<String> phoneNumber = new ArrayList<String>();
        phoneNumber.add("(302)372-8261");
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
        PhoneBook phoneBook = new PhoneBook();
        // when
        phoneBook.remove(name);
        // then
        String actual = phoneBook.lookup(name);
        Assert.assertNotEquals(name, actual);
    }

    @Test
    public void lookupTest(){
        // given
        String name = "Test1";
        ArrayList<String> phoneNumber = new ArrayList<String>();
        phoneNumber.add("(302)372-8261");
        PhoneBook phoneBook = new PhoneBook();
        // when
        phoneBook.add(name, phoneNumber);
        ArrayList<String> expected = phoneNumber;
        // then
        String actual = phoneBook.lookup(name);
        Assert.assertEquals(expected, actual);
    }
}
