package Contact;
import java.util.HashMap;
import java.util.Map;


public class ContactService {
	private final Map<String, Contact> contacts = new HashMap<>();
	
	public void addContact(Contact contact) {
		if (contact == null || contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID must be unique and non-null.");
		}
		contacts.put(contact.getContactId(), contact);
	}
	
	public void removeContact(String contactId) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Could not find a contact matching this ID.");
		}
		contacts.remove(contactId);
	}
	
	public void updateContact(Contact contact) {
        if (contact == null || !contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Could not find a contact matching this ID.");
        }
        contacts.put(contact.getContactId(), contact);
	}
	
	public Contact getContact(String contactId) {
        return contacts.get(contactId);
	}
	
	public Map<String, Contact> getAllContacts() {
        return contacts;
    }

}
