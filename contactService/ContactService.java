/* 
 * Author: Alan Davis
 * Date: 12-07-2025
 * Assignment: Project One All Services
 */

package contactService;

import java.util.List;
import java.util.ArrayList;

public class ContactService {

	int currentIdNumber = 1; // Unique Identifier
	
	// Create new ArrayList to hold contact objects
	public static List<Contact> contactList; //= new ArrayList<Contact>();
	
	private String ErrorID = "-111";
	
	public ContactService() {
		contactList = new ArrayList<>();
	}

	/*
	 * Adds new contact with unique ID 
	 * The constructor will validate each field during construction
	 * 
	 * @param contactId
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param address
	 * */
	public void addNewContact(String contactId, String firstName, String lastName, 
			String phoneNumber, String address) {
		
		int index = -1; // Set index to unused value
		
		System.out.println("Searching for any duplicate contact with ID: " + contactId);
		
		// Loop through contactList to find a matching contactId
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactId().equals(contactId)) {
				System.out.println("Contact found.");
				index = i; // Set index to matching Contact index in contactList
				break;
			}
		}
		if (index == -1) {
			// Create new contact with passed parameters
			Contact newContact = new Contact(contactId, firstName, 
					lastName, phoneNumber, address);
			
			contactList.add(newContact); // Add new contact to list
		}
		else {
			System.out.println("Unable to add contact. There is already a contact with ID: " + contactId);
		}
	}
	
	/*
	 * Delete contact with matching contactId used to search contactList.
	 * @param contactId
	 * */
	public void deleteContact(String contactId) {
		
		int index = -1; // Set index to unused value
		
		System.out.println("Searching for contact with ID: " + contactId);
		
		// Loop through contactList to find a matching contactId
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactId().equals(contactId)) {
				System.out.println("Contact found.");
				index = i; // Set index to matching Contact index in contactList
				break;
			}
		}
		
		if (index != -1) {
			System.out.println("Deleting contact with ID: " + contactId);
			contactList.remove(index);  // Remove Contact from contactList at index
		}
		else {
			System.out.println("Contact not found with ID: " + contactId);
		}
	}
	
	/*
	 * Update first name with matching contactId used to search contactList
	 * @param contactId
	 * @param newFirstName
	 * */
	public void updateFirstName (String contactId, String newFirstName) {
		
		int index = -1; // Set index to unused value
		
		System.out.println("Searching for contact with ID: " + contactId);
		
		// Loop through contactList to find a matching contactId
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactId().equals(contactId)) {
				System.out.println("Contact found.");
				index = i; // Set index to matching Contact index in contactList
				break;
			}
		}
		
		if (index != -1) {
			System.out.println("Updating first name.");
			System.out.println("First name was: " + contactList.get(index).getFirstName());
			contactList.get(index).setFirstName(newFirstName);;  // Update First Name
			System.out.println("First name is now: " + contactList.get(index).getFirstName());
		}
		else {
			System.out.println("Contact not found with ID: " + contactId);
		}
		
	}
	
	/*
	 * Update last name with matching contactId used to search contactList
	 * @param contactId
	 * @param newLastName
	 * */
	public void updateLastName (String contactId, String newLastName) {
		
		int index = -1; // Set index to unused value
		
		System.out.println("Searching for contact with ID: " + contactId);
		
		// Loop through contactList to find a matching contactId
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactId().equals(contactId)) {
				System.out.println("Contact found.");
				index = i; // Set index to matching Contact index in contactList
				break;
			}
		}
		
		if (index != -1) {
			System.out.println("Updating last name.");
			System.out.println("Last name was: " + contactList.get(index).getLastName());
			contactList.get(index).setLastName(newLastName);;  // Update Last Name
			System.out.println("Last name is now: " + contactList.get(index).getLastName());
		}
		else {
			System.out.println("Contact not found with ID: " + contactId);
		}
		
	}
	
	/*
	 * Update phone number with matching contactId used to search contactList
	 * @param contactId
	 * @param newPhoneNumber
	 * */
	public void updatePhoneNumber (String contactId, String newPhoneNumber) {
		
		int index = -1; // Set index to unused value
		
		System.out.println("Searching for contact with ID: " + contactId);
		
		// Loop through contactList to find a matching contactId
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactId().equals(contactId)) {
				System.out.println("Contact found.");
				index = i; // Set index to matching Contact index in contactList
				break;
			}
		}
		
		if (index != -1) {
			System.out.println("Updating phone number.");
			System.out.println("Phone number was: " + contactList.get(index).getPhoneNumber());
			contactList.get(index).setPhoneNumber(newPhoneNumber);;  // Update Phone Number
			System.out.println("Phone number is now: " + contactList.get(index).getPhoneNumber());
		}
		else {
			System.out.println("Contact not found with ID: " + contactId);
		}
		
	}
	
	/*
	 * Update address with matching contactId used to search contactList
	 * @param contactId
	 * @param newAddress
	 * */
	public void updateAddress (String contactId, String newAddress) {
		
		int index = -1; // Set index to unused value
		
		System.out.println("Searching for contact with ID: " + contactId);
		
		// Loop through contactList to find a matching contactId
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactId().equals(contactId)) {
				System.out.println("Contact found.");
				index = i; // Set index to matching Contact index in contactList
				break;
			}
		}
		
		if (index != -1) {
			System.out.println("Updating address.");
			System.out.println("Address was: " + contactList.get(index).getAddress());
			contactList.get(index).setAddress(newAddress);;  // Update Address
			System.out.println("Address is now: " + contactList.get(index).getAddress());
		}
		else {
			System.out.println("Contact not found with ID: " + contactId);
		}
		
	}
}
