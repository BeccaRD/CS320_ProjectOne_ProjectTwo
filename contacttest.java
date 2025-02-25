package Test;

import static org.junit.jupiter.api.Assertions.*;
import Contact.Contact;

import org.junit.jupiter.api.Test;

class contacttest {

	 @Test
	    void testValidContactCreation() {
	        Contact contact = new Contact("1023", "Enzo", "Larocca", "1234567890", "5821 Corley St");
	        assertEquals("1023", contact.getContactId());
	        assertEquals("Enzo", contact.getFirstName());
	        assertEquals("Larocca", contact.getLastName());
	        assertEquals("1234567890", contact.getPhoneNum());
	        assertEquals("5821 Corley St", contact.getAddress());
	    }

	    @Test
	    void testInvalidContactCreation() {
	        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Enzo", "Larocca", "1234567890", "5821 Corley St"));
	        assertThrows(IllegalArgumentException.class, () -> new Contact("10239001062023", "Enzo", "Larocca", "1234567890", "5821 Corley St"));
	        assertThrows(IllegalArgumentException.class, () -> new Contact("1023", "Enzo", "Larocca", "102390", "5821 Corley St"));
	        assertThrows(IllegalArgumentException.class, () -> new Contact("1023", "Enzo", "Larocca", "1234567890", null));
	    }

	    @Test
	    void testContactFieldUpdates() {
	        Contact contact = new Contact("1023", "Enzo", "Larocca", "1234567890", "5821 Corley St");

	        contact.setFirstName("Natalia");
	        contact.setLastName("Larocca");
	        contact.setPhoneNum("0987654321");
	        contact.setAddress("2158 Corley St");

	        assertEquals("Natalia", contact.getFirstName());
	        assertEquals("Larocca", contact.getLastName());
	        assertEquals("0987654321", contact.getPhoneNum());
	        assertEquals("2158 Corley St", contact.getAddress());
	    }
	}