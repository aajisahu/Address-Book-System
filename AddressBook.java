package com.bridgelabz;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Day8_Programs.PresentAbsent;
public class AddressBook {
	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
    public static void main(String[] args) {
        Log.info("Welcome to the Address Book System code !!!");
        newAddressBook person = new newAddressBook();
        person.addContact();
    }
}

class contactDetails {
	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName
            (String lastName) {
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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return
                        " FirstName : " + firstName +
                        " LastName : " + lastName +
                        " Address City : " + addressCity +
                        " State : " + state +
                        " Zip : " + zip +'\'' +
                        " PhoneNumber : " + phoneNumber +'\'' +
                        " Email : " + email;

    }
}
 class newAddressBook {

    Scanner sc = new Scanner(System.in);
    private static final Logger Log= LogManager.getLogger(PresentAbsent.class);

    public void addContact() {
        contactDetails person = new contactDetails();
        Log.info("Enter First Name: ");
        String firstName = sc.nextLine();
        Log.info("Enter last Name: ");
        String lastName = sc.nextLine();
        Log.info("Enter your addressCity: ");
        String addressCity = sc.nextLine();
        Log.info("Enter your state: ");
        String state = sc.nextLine();
        Log.info("Enter zip code : ");
        Long zip = sc.nextLong();
        sc.nextLine();
        Log.info("Enter phone number: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        Log.info("Enter your EMail ID: ");
        String email = sc.nextLine();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddressCity(addressCity);
        person.setState(state);
        person.setZip(zip.intValue());
        person.setPhoneNumber(phoneNumber.intValue());
        person.setEmail(email);
        Log.info("The Contact Details of "+firstName+ "\n"+ person);
    }
}