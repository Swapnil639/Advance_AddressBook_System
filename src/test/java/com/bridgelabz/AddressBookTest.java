package com.bridgelabz;

import org.junit.Test;

import java.util.Arrays;

import static com.bridgelabz.AddressBook.IOService.FILE_IO;

public class AddressBookTest {
    @Test
    public void givenContactDetails() {
        Contact[] array = {
                new Contact("Swapnil", "Patil", "Panvel", "Panvel", "Mh", 410206, 9967891679l, "swapnil@gmail.com"),
                new Contact("Shubham", "Ghule", "Panvel", "Panvel", "Mh", 410206, 9988776655l, "shubham@gmail.com"),
        };
        AddressBook addressBook;
        addressBook = new AddressBook(Arrays.asList(array));
        addressBook.writeTheData(FILE_IO);
    }

    @Test
    public void readTheContactDetails() {
        AddressBook addressBook = new AddressBook();
        addressBook.readContactDetails(FILE_IO);
    }
}
