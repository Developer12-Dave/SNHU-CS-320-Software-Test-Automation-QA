/* 
 * Author: Alan Davis
 * Date: 12-07-2025
 * Assignment: Project One All Services
 */

package contactService;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import contactService.Contact;

class ContactTest1 {

	private final String VALID_ID_MIN = "1";
	private final String VALID_FIRST_NAME_MIN = "A";
	private final String VALID_LAST_NAME_MIN = "Z";
	private final String VALID_PHONE_NUMBER = "7778889999";
	private final String VALID_ADDRESS_MIN = "B";
	
	private final String VALID_ID_MAX = "1112223333";
	private final String VALID_FIRST_NAME_MAX = "ABCDEFGHIJ";
	private final String VALID_LAST_NAME_MAX = "KLMNOPQRST";
	private final String VALID_ADDRESS_MAX = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234";
	
	private final String INVALID_ID_EMPTY = "";
	private final String INVALID_FIRST_NAME_EMPTY = "";
	private final String INVALID_LAST_NAME_EMPTY = "";
	private final String INVALID_PHONE_NUMBER_LESS_THAN_TEN = "777888999";
	private final String INVALID_PHONE_NUMBER_EMPTY = "";
	private final String INVALID_ADDRESS_EMPTY = "";

//////////////////////////////////////////////////////////////////////////////////////
// Test contactId Constructor
//////////////////////////////////////////////////////////////////////////////////////

	@DisplayName("Test Contact ID with min characters")
	@Test
	public void testContactId_withValidIdMin_IsSuccessful() {
		Contact validContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		assertEquals("1", validContact.getContactId());
	}
	
	@DisplayName("Test Contact ID with max characters")
	@Test
	public void testContactId_withValidIdMax_IsSuccessful() {
		Contact validContact = new Contact(VALID_ID_MAX, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		assertEquals("1112223333", validContact.getContactId());
	}
	
	@DisplayName("Test Contact ID with zero characters")
	@Test
	public void testContactId_withEmptyString_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(INVALID_ID_EMPTY, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		});
	}
	
	@DisplayName("Test Contact ID with more than ten characters")
	@Test
	public void testContactId_withMoreThanTenCharacters_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MAX + "A", VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		});
	}
	
	@DisplayName("Test Contact ID with null")
	@Test
	public void testContactId_withNull_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		});
	}
	
//////////////////////////////////////////////////////////////////////////////////////
// Test First Name Constructor
//////////////////////////////////////////////////////////////////////////////////////
	

	@DisplayName("Test First name with min characters")
	@Test
	public void testFirstName_withValidFirstNameMin_IsSuccessful() {
		Contact validContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		assertEquals("A", validContact.getFirstName());
	}
	
	@DisplayName("Test First name with max characters")
	@Test
	public void testFirstName_withValidFirstNameMax_IsSuccessful() {
		Contact validContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MAX, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		assertEquals("ABCDEFGHIJ", validContact.getFirstName());
	}
	
	@DisplayName("Test First Name with zero characters")
	@Test
	public void testFirstName_withEmptyString_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, INVALID_FIRST_NAME_EMPTY, 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		});
	}
	
	@DisplayName("Test First Name with null")
	@Test
	public void testFirstName_withNull_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, null, 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		});
	}
	
	@DisplayName("Test First Name with more than ten characters")
	@Test
	public void testFirstName_withMoreThanTenCharacters_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MAX + "Z", 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		});
	}

//////////////////////////////////////////////////////////////////////////////////////
//Test Last Name Constructor
//////////////////////////////////////////////////////////////////////////////////////
	
	@DisplayName("Test Last name with min characters")
	@Test
	public void testLastName_withValidLastNameMin_IsSuccessful() {
		Contact validContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		assertEquals("Z", validContact.getLastName());
	}
	
	@DisplayName("Test Last name with max characters")
	@Test
	public void testLastName_withValidLastNameMax_IsSuccessful() {
		Contact validContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MAX, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		assertEquals("KLMNOPQRST", validContact.getLastName());
	}
	
	@DisplayName("Test Last Name with zero characters")
	@Test
	public void testLastName_withEmptyString_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					INVALID_LAST_NAME_EMPTY, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		});
	}
	
	@DisplayName("Test Last Name with null")
	@Test
	public void testLastName_withNull_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					null, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		});
	}
	
	@DisplayName("Test Last Name with more than ten characters")
	@Test
	public void testLastName_withMoreThanTenCharacters_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MAX + "A", VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		});
	}
	
//////////////////////////////////////////////////////////////////////////////////////
//Test Phone Number Constructor
//////////////////////////////////////////////////////////////////////////////////////
	
	@DisplayName("Test Phone number with ten characters")
	@Test
	public void testPhoneNumber_withValidPhoneNumber_IsSuccessful() {
		Contact validContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		assertEquals("7778889999", validContact.getPhoneNumber());
	}
	
	@DisplayName("Test Phone number with less than ten characters")
	@Test
	public void testPhoneNumber_withLessThanTenCharacters_throwsIllegalArgumentException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, INVALID_PHONE_NUMBER_LESS_THAN_TEN, VALID_ADDRESS_MIN);
		});
	}
	
	@DisplayName("Test Phone number with zero characters")
	@Test
	public void testPhoneNumber_withEmptyString_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, INVALID_PHONE_NUMBER_EMPTY, VALID_ADDRESS_MIN);
		});
	}
	
	@DisplayName("Test Phone number with null")
	@Test
	public void testPhoneNumber_withNull_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, null, VALID_ADDRESS_MIN);
		});
	}
	
	@DisplayName("Test Phone number with more than ten characters")
	@Test
	public void testPhoneNumber_withMoreThanTenCharacters_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER + "5", VALID_ADDRESS_MIN);
		});
	}
	
//////////////////////////////////////////////////////////////////////////////////////
//Test Address Constructor
//////////////////////////////////////////////////////////////////////////////////////	
	
	@DisplayName("Test Address with min characters")
	@Test
	public void testAddress_withValidAddressMin_IsSuccessful() {
		Contact validContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		assertEquals("B", validContact.getAddress());
	}
	
	@DisplayName("Test Address with max characters")
	@Test
	public void testAddress_withValidAddressMax_IsSuccessful() {
		Contact validContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MAX);
		
		assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234", validContact.getAddress());
	}
	
	@DisplayName("Test Address with zero characters")
	@Test
	public void testAddress_withEmptyString_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, INVALID_ADDRESS_EMPTY);
		});
	}
	
	@DisplayName("Test Address with null")
	@Test
	public void testAddress_withNull_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, null);
		});
	}
	
	@DisplayName("Test Address with more than thirty characters")
	@Test
	public void testAddress_withMoreThanThirtyCharacters_throwsIllegalArgumentException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
					VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MAX + "Z");
		});
	}
	
//////////////////////////////////////////////////////////////////////////////////////
//Test SETTERS First Name
//////////////////////////////////////////////////////////////////////////////////////
	
	@DisplayName("Test Setter First Name min characters")
	@Test
	public void testSetterFirstName_withValidFirstNameMin_IsSuccessful() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		myContact.setFirstName("B");
		
		assertEquals("B", myContact.getFirstName());
	}
	
	@DisplayName("Test Setter First Name max characters")
	@Test
	public void testSetterFirstName_withValidFirstNameMax_IsSuccessful() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		myContact.setFirstName("ABCDEFGHIJ");
		
		assertEquals("ABCDEFGHIJ", myContact.getFirstName());
	}
	
	@DisplayName("Test Setter First Name zero characters")
	@Test
	public void testSetterFirstName_withEmptyString_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setFirstName("");
		});
	}
	
	@DisplayName("Test Setter First Name null")
	@Test
	public void testSetterFirstName_withNull_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setFirstName(null);
		});
	}
	
	@DisplayName("Test Setter First Name more than ten characters")
	@Test
	public void testSetterFirstName_withMoreThanTenCharacters_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setFirstName("ABCDEFGHIJK");
		});
	}
	
//////////////////////////////////////////////////////////////////////////////////////
//Test SETTERS Last Name
//////////////////////////////////////////////////////////////////////////////////////	
	
	@DisplayName("Test Setter Last Name min characters")
	@Test
	public void testSetterLastName_withValidLastNameMin_IsSuccessful() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		myContact.setLastName("B");
		
		assertEquals("B", myContact.getLastName());
	}
	
	@DisplayName("Test Setter Last Name max characters")
	@Test
	public void testSetterLastName_withValidLastNameMax_IsSuccessful() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		myContact.setLastName("ABCDEFGHIJ");
		
		assertEquals("ABCDEFGHIJ", myContact.getLastName());
	}
	
	@DisplayName("Test Setter Last Name zero characters")
	@Test
	public void testSetterLastName_withEmptyString_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setLastName("");
		});
	}
	
	@DisplayName("Test Setter Last Name null")
	@Test
	public void testSetterLastName_withNull_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setLastName(null);
		});
	}
	
	@DisplayName("Test Setter Last Name more than ten characters")
	@Test
	public void testSetterLastName_withMoreThanTenCharacters_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setLastName("ABCDEFGHIJK");
		});
	}
	
//////////////////////////////////////////////////////////////////////////////////////
//Test SETTERS Phone Number
//////////////////////////////////////////////////////////////////////////////////////
	
	@DisplayName("Test Setter Phone Number with ten characters")
	@Test
	public void testSetterPhoneNumber_withValidLastPhoneNumber_IsSuccessful() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		myContact.setPhoneNumber("9998886666");
		
		assertEquals("9998886666", myContact.getPhoneNumber());
	}
	
	@DisplayName("Test Setter Phone Number with less than ten character")
	@Test
	public void testSetterPhoneNumber_withValidLastNameMax_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setPhoneNumber("123456789");
		});
	}
	
	@DisplayName("Test Setter Phone Number zero characters")
	@Test
	public void testSetterPhoneNumber_withEmptyString_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setPhoneNumber("");
		});
	}
	
	@DisplayName("Test Setter Phone Number null")
	@Test
	public void testSetterPhoneNumber_withNull_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setPhoneNumber(null);
		});
	}
	
	@DisplayName("Test Setter Phone Number more than ten characters")
	@Test
	public void testSetterPhoneNumber_withMoreThanTenCharacters_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setPhoneNumber("44455566667");
		});
	}
	
//////////////////////////////////////////////////////////////////////////////////////
//Test SETTERS Address
//////////////////////////////////////////////////////////////////////////////////////	
	
	@DisplayName("Test Setter Address min characters")
	@Test
	public void testSetterAddress_withValidAddressMin_IsSuccessful() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		myContact.setAddress("B");
		
		assertEquals("B", myContact.getAddress());
	}
	
	@DisplayName("Test Setter Address max characters")
	@Test
	public void testSetterAddress_withValidAddressMax_IsSuccessful() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		myContact.setAddress("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234");
		
		assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234", myContact.getAddress());
	}
	
	@DisplayName("Test Setter Address zero characters")
	@Test
	public void testSetterAddress_withEmptyString_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setAddress("");
		});
	}
	
	@DisplayName("Test Setter Address null")
	@Test
	public void testSetterAddress_withNull_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setAddress(null);
		});
	}
	
	@DisplayName("Test Setter Address more than thirty characters")
	@Test
	public void testSetterAddress_withMoreThanThirtyCharacters_throwsIllegalArgumentException() {
		Contact myContact = new Contact(VALID_ID_MIN, VALID_FIRST_NAME_MIN, 
				VALID_LAST_NAME_MIN, VALID_PHONE_NUMBER, VALID_ADDRESS_MIN);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContact.setAddress("ABCDEFGHIJKLMNOPQRSTUVWXYZ56789");
		});
	}
}


