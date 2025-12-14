/* 
 * Author: Alan Davis
 * Date: 12-07-2025
 * Assignment: Project One All Services
 */

package contactService;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import contactService.ContactService;

class ContactServiceTest1 {
	
	private ContactService contactService;
	
	private String defaultId = "1";
	private String defaultFirstName = "Henry";
	private String defaultLastName = "Lasso";
	private String defaultPhoneNumber = "1234567890";
	private String defaultAddress = "123 Somewhere Street";
	
	@BeforeEach
	public void setup() {
		contactService = new ContactService();
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////	
// ADD
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@DisplayName("Test Add New Element Success")
	@Test
	public void testAdd_withNewElement_successfullyAdds() {
		
		ContactService testContactList = new ContactService();
		
		assertTrue(ContactService.contactList.isEmpty());
		
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertFalse(ContactService.contactList.isEmpty());
		assertEquals(defaultId, ContactService.contactList.get(0).getContactId());
		assertEquals(defaultFirstName, ContactService.contactList.get(0).getFirstName());
		assertEquals(defaultLastName, ContactService.contactList.get(0).getLastName());
		assertEquals(defaultPhoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		assertEquals(defaultAddress, ContactService.contactList.get(0).getAddress());
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// DELETE
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@DisplayName("Test Delete Element Success")
	@Test
	public void testDelete_withContactIdToSearch_successfullyDeletes() {
		
		ContactService testContactList = new ContactService();
		boolean testBool = false;
		
		assertTrue(ContactService.contactList.isEmpty());
		
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		testContactList.addNewContact("10", "Greg", "Hughes", "1234554321", "321 Nowhere");
		testContactList.addNewContact("20", "Albert", "Green", "9876543210", "456 OuterSpace");
		
		assertEquals(3, ContactService.contactList.size());
		
		testContactList.deleteContact(defaultId);
		
		assertEquals(2, ContactService.contactList.size());
		
		for (int i = 0; i < ContactService.contactList.size(); i++) {
			if (ContactService.contactList.get(i).getContactId() == "1") {
				testBool = true;
			}
		}
		assertFalse(testBool);
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////
// UPDATE
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//////////////// First Name
	
	@DisplayName("Test updating first name")
	@Test
	public void testUpdate_FirstName_successfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultFirstName, ContactService.contactList.get(0).getFirstName());
		
		testContactList.updateFirstName(defaultId, "New First");
		assertEquals("New First", ContactService.contactList.get(0).getFirstName());
	}
	
	@DisplayName("Test updating first name FAIL with empty")
	@Test
	public void testUpdate_FirstNameEmpty_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultFirstName, ContactService.contactList.get(0).getFirstName());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateFirstName(defaultId, "");
		});
	}
	
	@DisplayName("Test updating first name FAIL with null")
	@Test
	public void testUpdate_FirstNameNull_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultFirstName, ContactService.contactList.get(0).getFirstName());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateFirstName(defaultId, null);
		});
	}
	
	@DisplayName("Test updating first name FAIL with more than ten")
	@Test
	public void testUpdate_FirstNameMoreThanTen_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultFirstName, ContactService.contactList.get(0).getFirstName());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateFirstName(defaultId, "ABCDEFGHIJK");
		});
	}
	
//////////////// Last Name	
	
	@DisplayName("Test updating last name")
	@Test
	public void testUpdate_LastName_successfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultLastName, ContactService.contactList.get(0).getLastName());
		
		testContactList.updateLastName(defaultId, "New Last");
		assertEquals("New Last", ContactService.contactList.get(0).getLastName());
	}
	
	@DisplayName("Test updating last name FAIL with empty")
	@Test
	public void testUpdate_LastNameEmpty_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultLastName, ContactService.contactList.get(0).getLastName());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateFirstName(defaultId, "");
		});
	}
	
	@DisplayName("Test updating last name FAIL with null")
	@Test
	public void testUpdate_LastNameNull_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultLastName, ContactService.contactList.get(0).getLastName());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateFirstName(defaultId, null);
		});
	}
	
	@DisplayName("Test updating last name FAIL with more than ten")
	@Test
	public void testUpdate_LastNameMoreThanTen_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultLastName, ContactService.contactList.get(0).getLastName());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateFirstName(defaultId, "ABCDEFGHIJK");
		});
	}
	
////////////////////// Phone Number
	
	@DisplayName("Test updating phone number")
	@Test
	public void testUpdate_PhoneNumber_successfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultPhoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		
		testContactList.updatePhoneNumber(defaultId, "1122334455");
		assertEquals("1122334455", ContactService.contactList.get(0).getPhoneNumber());
	}
	
	@DisplayName("Test updating phone number FAIL with empty")
	@Test
	public void testUpdate_PhoneNumberEmpty_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultPhoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updatePhoneNumber(defaultId, "");
		});
	}
	
	@DisplayName("Test updating phone number FAIL with null")
	@Test
	public void testUpdate_PhoneNumberNull_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultPhoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updatePhoneNumber(defaultId, null);
		});
	}
	
	@DisplayName("Test updating phone number FAIL with more than ten")
	@Test
	public void testUpdate_PhoneNumberMoreThanTen_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultPhoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updatePhoneNumber(defaultId, "12345678901");
		});
	}
	
/////////////////////// Address
	
	@DisplayName("Test updating address")
	@Test
	public void testUpdate_Address_successfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultAddress, ContactService.contactList.get(0).getAddress());
		
		testContactList.updateAddress(defaultId, "New Address");
		assertEquals("New Address", ContactService.contactList.get(0).getAddress());
	}
	
	@DisplayName("Test updating address FAIL with blank")
	@Test
	public void testUpdate_AddressBlank_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultAddress, ContactService.contactList.get(0).getAddress());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateAddress(defaultId, "");
		});
	}
	
	@DisplayName("Test updating address FAIL with null")
	@Test
	public void testUpdate_AddressNull_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultAddress, ContactService.contactList.get(0).getAddress());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateAddress(defaultId, null);
		});
	}
	
	@DisplayName("Test updating address FAIL with more than thirty")
	@Test
	public void testUpdate_AddressMoreThanThirty_unsuccessfullyUpdates() {
		
		ContactService testContactList = new ContactService();
		testContactList.addNewContact(defaultId, defaultFirstName, 
				defaultLastName, defaultPhoneNumber, defaultAddress);
		
		assertEquals(defaultAddress, ContactService.contactList.get(0).getAddress());
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateAddress(defaultId, "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345");
		});
	}
	
}
