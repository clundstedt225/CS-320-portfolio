package Project;
import java.util.ArrayList;
import java.util.List;

//SNHU CS-320
//ContactService Class
//Connor Lundstedt

public class ContactService {
	
	//Storage for contacts
	private List<Contact> contacts = new ArrayList();
	
	public List<Contact> getContactsList(){
		return contacts;
	}
	
	public void addContact(Contact ct) {
		
		//Make sure ID is unique before adding
		for(int i = 0; i < contacts.size(); i++) {
			
			String idToCompare = contacts.get(i).getID();
			
			//Throw exception if match found
			if(ct.getID() == idToCompare) {
				throw new IllegalArgumentException("ID has already been used");
			}
		}
		
		//Passed ID check, add contact to list
		contacts.add(ct);
	}
	
	public void deleteContact(String idToDelete) {	
		//Remove contact at index 
		contacts.remove(getContactIndex(idToDelete));					
	}
	
	public void updateFirstName(String id, String newName) {
		int index = getContactIndex(id);
		contacts.get(index).setFirstName(newName);
	}
	
	public void updateLastName(String id, String newName) {
		int index = getContactIndex(id);
		contacts.get(index).setLastName(newName);
	}
	
	public void updatePhone(String id, String newNumber) {
		int index = getContactIndex(id);
		contacts.get(index).setPhone(newNumber);
	}
	
	public void updateAddress(String id, String newAddr) {
		int index = getContactIndex(id);
		contacts.get(index).setAddress(newAddr);
	}
	
	//Find and return contact ID index
	public int getContactIndex(String idToFind) {
		//Loop through list to find ID 
		for(int i = 0; i < contacts.size(); i++) {
			
			//Compare ID string 
			if(idToFind.equals(contacts.get(i).getID())) {				
				//Return matched contact at index
				return i;
			}
		}
		
		return 0;
	}
}
