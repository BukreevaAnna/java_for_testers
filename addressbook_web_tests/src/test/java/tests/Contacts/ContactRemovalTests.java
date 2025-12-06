package tests.Contacts;
import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.TestBase;

public class ContactRemovalTests extends TestBase{

    @Test
    public void canRemoveContact() {
        if (app.contacts().isContactPresent()){
            app.contacts().createContact(new ContactData("Test", "Test","test@gmail.com"));
        }
        TestBase.app.contacts().removeContact();
    }

    @Test
    void canRemoveAllContactAtOnce() {
        if (app.contacts().getCount() == 0){
            app.contacts().createContact(new ContactData("Test", "Test","test@gmail.com"));
        }
        app.contacts().removeAllContacts();
        Assertions.assertEquals(0, app.contacts().getCount());
    }

}
