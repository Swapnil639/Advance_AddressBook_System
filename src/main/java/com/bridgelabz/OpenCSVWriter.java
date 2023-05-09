package com.bridgelabz;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    private static final String ADDRESS_BOOK_CSV_FILE="Z:\\RFP_Java fellowship - 270\\Advance_AddressBook_System\\src\\main\\java\\com\\bridgelabz\\address-book-CSV.csv";
    public static void main(String[] args) throws IOException, CsvException {
        writeCsvFile();
        readCsvFile();
    }
        private static void readCsvFile () throws IOException, CsvException {
            Reader reader = Files.newBufferedReader(Paths.get(ADDRESS_BOOK_CSV_FILE));
            CSVReader csvReader = new CSVReader(reader);
            List<String[]> csvUser = csvReader.readAll();
            for (String[] contact : csvUser) {
                System.out.println("First Name : " + contact[0]);
                System.out.println("Last Name : " + contact[1]);
                System.out.println("Address : " + contact[2]);
                System.out.println("City : " + contact[3]);
                System.out.println("State : " + contact[4]);
                System.out.println("Zip : " + contact[5]);
                System.out.println("Phone Number : " + contact[6]);
                System.out.println("Email id " + contact[7]);
                System.out.println("===============================");
            }
    }

        public static void writeCsvFile() throws FileNotFoundException {
            List<Contact> contactList = new ArrayList<>();
            contactList.add( new Contact("Swapnil", "Patil", "Panvel", "Panvel", "Mh", 410206, 9967891679l, "swapnil@gmail.com"));
            contactList.add( new Contact("Shubham", "Ghule", "Panvel", "Panvel", "Mh", 410206, 9988776655l, "shubham@gmail.com"));

            File csvFile = new File(ADDRESS_BOOK_CSV_FILE);
            PrintWriter writer2 = new PrintWriter(csvFile);
            for (Contact contact:contactList) {
                writer2.println(contact);
            }
            writer2.close();
        }
    }
