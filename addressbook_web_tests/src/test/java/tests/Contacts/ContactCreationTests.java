package tests.Contacts;

import model.ContactData;
import org.junit.jupiter.api.Test;
import tests.TestBase;

public class ContactCreationTests extends TestBase{

    @Test
    public void canCreateContact() {
        TestBase.app.contacts().createContact(new ContactData("Nikita", "Nikitin", "nikita1995@gmail.com"));
    }

    @Test
    public void canCreateEmptyContact() {
        TestBase.app.contacts().createContact(new ContactData());
    }

    @Test
    public void canCreateContactWithNameOnly() {
        TestBase.app.contacts().createContact(new ContactData().withFirstName("Ivan"));
    }

}
