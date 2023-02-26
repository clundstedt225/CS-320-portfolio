package Project;

//SNHU CS-320
//Contact Class
//Connor Lundstedt

public class Contact {
	
	//Contact fields
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//Constructor
	public Contact(String ID, String fName, String lName, String pNum, String addr) {
		
		//Check for exceptions
		if(ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		} else if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		} else if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		} else if (pNum == null || pNum.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		} else if (addr == null || addr.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		//Set up fields
		id = ID;
		firstName = fName;
		lastName = lName;
		phone = pNum;
		address = addr;
	}
	
	//Accessors
	public String getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNum() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	//Mutators (none for ID since it's non-updatable)
	public void setFirstName(String newName) {
		firstName = newName;
	}
	
	public void setLastName(String newName) {
		lastName = newName;
	}
	
	public void setPhone(String pNum) {
		phone = pNum;
	}
	
	public void setAddress(String addr) {
		address = addr;
	}
}
