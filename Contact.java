package Contact;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phoneNum, String address) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID. Must be no more than 10 characters and non-null.");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name. Must be no more than 10 characters and non-null.");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name. Must be no more than 10 characters and non-null.");
		}
		if (phoneNum == null || phoneNum.length() != 10 || !phoneNum.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid Phone Number. Must be exactly 10 characters and non-null.");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address. Must be no more than 30 characters and non-null.");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public String getContactId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName != null && firstName.length() <= 10) {
			this.firstName = firstName;
		}
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName != null && lastName.length() <= 10) {
			this.lastName = lastName;
		}
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		if (phoneNum != null && phoneNum.length() == 10 && phoneNum.matches("\\d{10}")) {
			this.phoneNum = phoneNum;
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address != null && address.length() <= 30) {
			this.address = address;
		}
	}

}
