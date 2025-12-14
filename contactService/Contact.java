/* 
 * Author: Alan Davis
 * Date: 12-07-2025
 * Assignment: Project One All Services
 */


package contactService;

public class Contact {

	private final String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	private String contactIdErrorMessage = "Invalid Contact Id.\n"
			+ "Contact ID must be provided and be 1-10 characters.";
	
	private String firstNameErrorMessage = "Invalid First Name.\n"
			+ "First Name must be provided and be 1-10 characters.";
	
	private String lastNameErrorMessage = "Invalid Last Name.\n"
			+ "Last Name must be provided and be 1-10 characters.";
	
	private String phoneNumberErrorMessage = "Invalid Phone Number.\n"
			+ "Phone Number must be provided and be be exactly 10 characters.";
	
	private String addressErrorMessage = "Invalid Address.\n"
			+ "Address must be provided and be 1-30 characters.";
	
	// constructor
	public Contact(String contactId, String firstName, 
		String lastName, String phoneNumber, String address) {
		
		// constructor logic calling validate methods for each parameter
		if (!this.validateId(contactId)) {
			throw new IllegalArgumentException(contactIdErrorMessage);
		}
		if (!this.validateFirstName(firstName)) {
			throw new IllegalArgumentException(firstNameErrorMessage);
		}
		if (!this.validateLastName(lastName)) {
			throw new IllegalArgumentException(lastNameErrorMessage);
		}
		if (!this.validatePhoneNumber(phoneNumber)) {
			throw new IllegalArgumentException(phoneNumberErrorMessage);
		}
		if (!this.validateAddress(address)) {
			throw new IllegalArgumentException(addressErrorMessage);
		}
		
		// All parameters valid. Construct Contact 
		this.contactId = contactId; 
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
/////////////////////////////////////////////////////////////////////////////////////
// Helper methods to validate each attribute
/////////////////////////////////////////////////////////////////////////////////////	
	
	/*
	 * Validates contactId by ensuring the provided contactId
	 * is not null, not greater than a length of 10 characters,
	 * and is at least a length of 1 character
	 * @param String contactId
	 * @return boolean
	 * */
	private boolean validateId(String contactId) {
		if (contactId == null || contactId.length() > 10 || contactId.length() <= 0 ) {
			return false;
		}
		
		return true;
	}
	
	/*
	 * Validates firstName by ensuring the provided firstName
	 * is not null, not greater than a length of 10 characters, 
	 * and is at least a length of 1 character
	 * @param String firstName
	 * @return boolean
	 * */
	private boolean validateFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10 || firstName.length() <= 0 ) {
			return false;
		}
		return true;
	}
	
	/*
	 * Validates lastName by ensuring the provided lastName
	 * is not null, not greater than a length of 10 characters, 
	 * and is at least a length of 1
	 * @param String lastName
	 * @return boolean
	 * */
	private boolean validateLastName(String lastName) {
		if (lastName == null || lastName.length() > 10 || lastName.length() <= 0 ) {
			return false;
		}
		return true;
	}
	
	/*
	 * Validates phoneNumber by ensuring the provided phoneNumber
	 * is not null and has exactly 10 characters
	 * @param String phoneNumber
	 * @return boolean
	 * */
	private boolean validatePhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			return false;
		}
		return true;
	}
	
	/*
	 * Validates address by ensuring the provided address
	 * is not null, not greater than a length of 30 characters, 
	 * and is at least a length of 1 characters
	 * @param String address
	 * @return boolean
	 * */
	private boolean validateAddress(String address) {
		if (address == null || address.length() > 30 || address.length() <= 0 ) {
			return false;
		}
		return true;
	}
	
/////////////////////////////////////////////////////////////////////////////////////
// Getter and Setter Methods
/////////////////////////////////////////////////////////////////////////////////////
	
	public String getContactId () {
		return contactId;
	}
	
	public String getFirstName () {
		return firstName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public String getPhoneNumber () {
		return phoneNumber;
	}
	
	public String getAddress () {
		return address;
	}
	
	public void setFirstName(String firstName) {
		if (!this.validateFirstName(firstName)) {
			throw new IllegalArgumentException(firstNameErrorMessage);
		}
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (!this.validateLastName(lastName)) {
			throw new IllegalArgumentException(lastNameErrorMessage);
		}
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (!this.validatePhoneNumber(phoneNumber)) {
			throw new IllegalArgumentException(phoneNumberErrorMessage);
		}
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		if (!this.validateAddress(address)) {
			throw new IllegalArgumentException(addressErrorMessage);
		}
		this.address = address;
	}
	
}
