package tests.Contacts;
import model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import java.util.ArrayList;
import java.util.Random;

public class ContactRemovalTests extends TestBase{

    @Test
    public void canRemoveContact() {
        if (app.contacts().isContactPresent()){
            app.contacts().createContact(new ContactData("", "Test", "Test","test@gmail.com"));
        }
        var oldContacts = app.contacts().getList();
        var rnd = new Random();
        var index = rnd.nextInt(oldContacts.size());
        TestBase.app.contacts().removeContact(oldContacts.get(index));
        var expectedList = new ArrayList<>(oldContacts);
        var newContacts = app.contacts().getList();
        expectedList.remove(index);
        Assertions.assertEquals(newContacts, expectedList);
    }

    @Test
    void canRemoveAllContactAtOnce() {
        if (app.contacts().getCount() == 0){
            app.contacts().createContact(new ContactData("", "Test", "Test","test@gmail.com"));
        }
        app.contacts().removeAllContacts();
        Assertions.assertEquals(0, app.contacts().getCount());
    }

}
