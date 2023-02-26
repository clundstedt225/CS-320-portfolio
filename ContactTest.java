package Test;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Project.Contact;
import Project.Task;

class ContactTest {

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
	public void testCreateContact() {
		//Create contact object
		Contact contact = new Contact(ID, fName, lName, pNum, address);
		
		//Test accessors for expected values
		assertTrue(contact.getID().equals("12345"));
		assertTrue(contact.getFirstName().equals("Connor"));
		assertTrue(contact.getLastName().equals("Lundstedt"));
		assertTrue(contact.getPhoneNum().equals("0123456789"));
		assertTrue(contact.getAddress().equals("123 example drive"));
	}
	
	@Test
	public void testIDFail() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, fName, lName, pNum, address); 
		});
	}
	
	@Test
	public void testNameFail() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(ID, null, lName, pNum, address); 
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(ID, fName, null, pNum, address); 
		});
	}
	
	@Test
	public void testPhoneFail() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(ID, fName, lName, null, address); 
		});
	}
	
	@Test
	public void addressFail() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(ID, fName, lName, pNum, null); 
		});
	}

}
