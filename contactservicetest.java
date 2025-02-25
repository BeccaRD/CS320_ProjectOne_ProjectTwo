package Test;

import static org.junit.jupiter.api.Assertions.*;
import Contact.Contact;
import Contact.ContactService;

import org.junit.jupiter.api.Test;

class contactservicetest {

	@Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1023", "Enzo", "Larocca", "1234567890", "5821 Corley St");

        service.addContact(contact);
        assertNotNull(service.getContact("1023"));
    }

    @Test
    void testAddDuplicateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1023", "Enzo", "Larocca", "1234567890", "5821 Corley St");

        service.addContact(contact);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact));
    }

    @Test
    void testRemoveContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1023", "Enzo", "Larocca", "1234567890", "5821 Corley St");

        service.addContact(contact);
        service.removeContact("1023");

        assertNull(service.getContact("1023"));
    }

    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1023", "Enzo", "Larocca", "1234567890", "5821 Corley St");

        service.addContact(contact);

        Contact updatedContact = new Contact("1023", "Natalia", "Larocca", "0987654321", "2158 Corley St");
        service.updateContact(updatedContact);

        Contact result = service.getContact("1023");
        assertEquals("Natalia", result.getFirstName());
        assertEquals("Larocca", result.getLastName());
        assertEquals("0987654321", result.getPhoneNum());
        assertEquals("2158 Corley St", result.getAddress());
    }
}
