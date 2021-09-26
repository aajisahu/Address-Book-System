package com.bridgelabz;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Day8_Programs.PresentAbsent;

import java.util.ArrayList;

public class AddressBook {
	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
    public static void main(String[] args) {
        Log.info("Welcome to the Address Book System code !!!");
        Scanner sc = new Scanner(System.in);
        AddressBookDe Book = new AddressBookDe();
        Book.getMenu();
        Book.showContact();
    }
}

class contactDetails { //Person object
	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private String email;
    private Long zip;
    private Long phoneNumber;


    public contactDetails(String firstName, String lastName, String addressCity, String state, String email, Long zip, Long phoneNumber) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressCity = addressCity;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public contactDetails() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNum(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "ContactDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

class AddressBookDe {
	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
    Scanner sc = new Scanner(System.in);
    contactDetails person = new contactDetails();
    ArrayList<contactDetails> contactList = new ArrayList<>();

    public contactDetails addContact() {
        Log.info("Enter the details of the contact");
        {
            Log.info("Enter First Name: ");
            String firstName = sc.nextLine();
            Log.info("Enter last Name: ");
            String lastName = sc.nextLine();
            Log.info("Enter your addressCity: ");
            String addressCity = sc.nextLine();
            Log.info("Enter your state: ");
            String state = sc.nextLine();
            Log.info("Enter your EMail ID: ");
            String email = sc.nextLine();
            Log.info("Enter zip code : ");
            long zip = sc.nextLong();
            Log.info("Enter phone number: ");
            long phoneNumber = sc.nextLong();
            contactList.add(new contactDetails(firstName, lastName, addressCity, state, email, zip, phoneNumber));
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setAddressCity(addressCity);
            person.setState(state);
            person.setEmail(email);
            person.setPhoneNum(phoneNumber);
            person.setZip(zip);
            Log.info("The Details Of Contact Is : " + person);
            return person;
        }
    }


    public void editContact() {
        Log.info(" Enter the first name of the contact : ");
        String contactFirstName = sc.nextLine();
        if (contactList.isEmpty()) {
            Log.info(" Contact List is Empty! ");
        } else {
            for (contactDetails person : contactList) {
                String checkName = person.getFirstName();
                if (checkName.equalsIgnoreCase(contactFirstName)) {
                    System.out.print("Enter New First Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter New Last Name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter New AddressCity: ");
                    String address = sc.nextLine();
                    System.out.print("Enter New State: ");
                    String state = sc.nextLine();
                    System.out.print("Enter New Email Id: ");
                    String email = sc.nextLine();
                    System.out.print("Enter New Zip Code of area: ");
                    long zip = sc.nextLong();
                    System.out.print("Enter New Mobile Number: ");
                    long phoneNumber = sc.nextLong();

                    person.setFirstName(firstName);
                    person.setLastName(lastName);
                    person.setAddressCity(address);
                    person.setState(state);
                    person.setEmail(email);
                    person.setZip(zip);
                    person.setPhoneNum(phoneNumber);
                    Log.info("Contact List Updated! ");
                } else {
                    Log.info(" Name not found. Enter Valid Name");
                }
            }
        }
    }

    public void deleteContact() {
        Log.info("Enter the name of the contact to be deleted : ");
        String deleteName = sc.next();
        if (contactList.isEmpty()) {
            Log.info("The AddressBook is Empty....!");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String matcher = contactList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(deleteName)) {
                    contactList.remove(i);
                    Log.info("Contact Deleted Successfully...");
                } else {
                    Log.info("Name Not Found");
                }
            }
        }
    }


    public void showContact() {
        Log.info("Total Number of Contacts : " + contactList.size());
        Log.info("---------------------------------------------------");
        if (contactList.isEmpty()) {
            Log.info("There are no contacts in the contact list");
        } else {
            Log.info(contactList);
            Log.info("\n---------------------------------------------");
        }
    }


    public void getMenu() {
        boolean exit = false;
        do {
            Log.info("Choose the valid option \n1. Add Contacts \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    Log.info(person);
                    Log.info("Contact added successfully....");
                    break;
                case 2:
                    editContact();
                    Log.info(person);
                    Log.info("Contact details updated successfully");
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showContact();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.print("Enter the valid option!");
                    break;
            }
        } while (!exit);
    }
}