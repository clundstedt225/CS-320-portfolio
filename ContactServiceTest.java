package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Project.Contact;
import Project.ContactService;

class ContactServiceTest {

	private String ID, fName, lName, pNum, address;
	
	@BeforeEach
	public void setUp() {
		ID = "12345";
		fName = "Connor";
		lName = "Lundstedt";
		pNum = "0123456789";
		address = "123 example drive";
	}
	
	@Test
	public void testAddContact() {
		//Create service and contact objects
		Contact contact1 = new Contact(ID, fName, lName, pNum, address);
		ContactService service = new ContactService();
		
		//Add a test contact to service
		service.addContact(contact1);
		
	    //Assert that list is not empty
	    Assertions.assertTrue(service.getContactsList().size() == 1);
	}
	
	@Test
	public void testDeleteContact() {
		//Create service and contact objects
		Contact contact1 = new Contact(ID, fName, lName, pNum, address);
		ContactService service = new ContactService();
		
		//Add a test contact to service then remove it
		service.addContact(contact1);
		service.deleteContact(contact1.getID());
		
	    //Assert that list is empty
	    Assertions.assertTrue(service.getContactsList().size() == 0);
	}
	
	@Test
	public void testUpdateContact() {
		//Create service and contact objects
		Contact contact1 = new Contact(ID, fName, lName, pNum, address);
		ContactService service = new ContactService();
		
		//Add a test contact to service
		service.addContact(contact1);
		
		//Test service for expected results
		service.updateFirstName("12345", "John");
		assertTrue(contact1.getFirstName().equals("John"));
		
		service.updateLastName("12345", "Smith");
		assertTrue(contact1.getLastName().equals("Smith"));
		
		service.updatePhone("12345", "1122334455");
		assertTrue(contact1.getPhoneNum().equals("1122334455"));
		
		service.updateAddress("12345", "321 example road");
		assertTrue(contact1.getAddress().equals("321 example road"));
	}

}
