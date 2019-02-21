package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {
    @Test
    public void addTest (){
        // given
        PhoneBook phoneBook = new PhoneBook();
        List<String> expected = Arrays.asList("(281)231-1839");
        // when
        phoneBook.add("SamplePerson", "(281)231-1839");
        List<String> actual = phoneBook.lookup("SamplePerson");
        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addTest2 (){
        // given
        PhoneBook phoneBook = new PhoneBook();
        List<String> expected = Arrays.asList("(729)816-1364");
        // when
        phoneBook.add("SamplePerson", "(729)816-1364");
        List<String> actual = phoneBook.lookup("SamplePerson");
        // then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void removeTest (){
        // given
        Map<String, List<String>> phoneNumberMap = new TreeMap<String, List<String>>();
        phoneNumberMap.put("SamplePerson", Arrays.asList("(281)231-1839"));
        PhoneBook phoneBook = new PhoneBook(phoneNumberMap);
        // when
        phoneBook.remove("SamplePerson");
        List<String> actual = phoneBook.lookup("SamplePerson");
        // then
        Assert.assertNull(actual);
    }

    @Test
    public void lookupTest (){
        // given
        Map<String, List<String>> phoneNumberMap = new TreeMap<String, List<String>>();
        phoneNumberMap.put("SamplePerson", Arrays.asList("(281)231-1839"));
        PhoneBook phoneBook = new PhoneBook(phoneNumberMap);
        List<String> expected = Arrays.asList("(281)231-1839");
        // when
        List<String> actual = phoneBook.lookup("SamplePerson");
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lookupTest2 (){
        // given
        Map<String, List<String>> phoneNumberMap = new TreeMap<String, List<String>>();
        phoneNumberMap.put("SamplePerson", Arrays.asList("(729)816-1364"));
        PhoneBook phoneBook = new PhoneBook(phoneNumberMap);
        List<String> expected = Arrays.asList("(729)816-1364");
        // when
        List<String> actual = phoneBook.lookup("SamplePerson");
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseLookupTest (){
        // given
        Map<String, List<String>> phoneNumberMap = new TreeMap<String, List<String>>();
        phoneNumberMap.put("SamplePerson", Arrays.asList("(281)231-1839"));
        PhoneBook phoneBook = new PhoneBook(phoneNumberMap);
        String expected = "SamplePerson";
        // when
        String actual = phoneBook.reverseLookup("(281)231-1839");
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseLookupTest2 (){
        // given
        Map<String, List<String>> phoneNumberMap = new TreeMap<String, List<String>>();
        phoneNumberMap.put("SamplePerson2", Arrays.asList("(281)231-1839"));
        PhoneBook phoneBook = new PhoneBook(phoneNumberMap);
        String expected = "SamplePerson2";
        // when
        String actual = phoneBook.reverseLookup("(281)231-1839");
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listNamesAndNumbersTest(){
        // given
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Zebra", "111-222-333");
        phoneBook.add("Zebra", "139-131-1343");
        phoneBook.add("Dog", "222-444-4444");
        phoneBook.add("Dog", "239-139-1341");
        String expected = "Dog\n222-444-4444\n239-139-1341\n" +
                "Zebra\n111-222-333\n139-131-1343\n";
        // when
        String actual = phoneBook.listNamesAndNumbers();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listNamesAndNumbersTest2(){
        // given
        Map<String, List<String>> phoneNumberMap = new TreeMap<String, List<String>>();
        List<String> numberList1 = new ArrayList<String>();
        numberList1.add("(382)083-1834");
        phoneNumberMap.put("SamplePerson", numberList1);
        List<String> numberList2 = new ArrayList<String>();
        numberList2.add("(113)134-1341");
        phoneNumberMap.put("SamplePerson2", numberList2);
        PhoneBook phoneBook = new PhoneBook(phoneNumberMap);

        String expected = "SamplePerson\n(382)083-1834\n" +
                "SamplePerson2\n(113)134-1341\n";
        // when
        String actual = phoneBook.listNamesAndNumbers();
        // then
        Assert.assertEquals(expected, actual);
    }
}
