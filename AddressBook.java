package com.bridgelabz;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Day8_Programs.PresentAbsent;
public class AddressBook {
	private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
    public static void main(String[] args) {
        Log.info("Welcome to the Address Book System code !!!");
            Scanner sc = new Scanner(System.in);
        AddressBookDe Book = new AddressBookDe();
            Book.addContact();//Calling Add Contacts Method
            Log.info(Book.person);
            Log.info("Enter the choice \n 1. Edit \n 2. Delete");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Book.editContact();
                    Log.info("You have Entered following data");
                    Log.info(Book.person);
                    Log.info("Thank you for Using the Address book");
                    break;
                case 2:
                    Book.deleteContact();
                    Log.info("Address Book details :" + Book.person);
                    break;
            }
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
 class AddressBookDe {
	 private static final Logger Log= LogManager.getLogger(PresentAbsent.class);
     Scanner sc = new Scanner(System.in);

     contactDetails person = new contactDetails();

     public void addContact() {
         //contactDetails person = new contactDetails();
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
         Log.info("The Contact Details of " + firstName + "\n" + person);
     }


     public void editContact() {
         //Scanner editName = new Scanner(System.in);
         Log.info("Enter the firstName of person");
         String editName = sc.nextLine();
         if (editName.equalsIgnoreCase(person.getFirstName()))
             addContact();
         else
             Log.info("The Entered First Name Is Not Match");
         editContact();
     }
     public void deleteContact() {
         Log.info("Enter firstName of the person");
         String editName = sc.nextLine();
         if (editName.equals(person.getFirstName())) {
             Log.info("Deleted " + person.getFirstName() + " details");
             person = null;
         }
     }
 }