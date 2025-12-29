package tests.Contacts;
import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import java.util.ArrayList;
import java.util.Random;

public class ContactRemovalTests extends TestBase{

    @Test
    public void canRemoveContact() {
        if (app.contacts().isContactPresent()){
            app.contacts().createContact(new ContactData("", "Test", "Test","", "test@gmail.com", ""));
        }
        var oldContacts = app.hbm().getContactList();
        var rnd = new Random();
        var index = rnd.nextInt(oldContacts.size());
        TestBase.app.contacts().removeContact(oldContacts.get(index));
        var expectedList = new ArrayList<>(oldContacts);
        var newContacts = app.hbm().getContactList();
        expectedList.remove(index);
        Assertions.assertEquals(newContacts, expectedList);
    }

    @Test
    void canRemoveAllContactAtOnce() {
        if (app.contacts().getCount() == 0){
            app.contacts().createContact(new ContactData("", "Test", "Test","", "test@gmail.com", ""));
        }
        app.contacts().removeAllContacts();
        Assertions.assertEquals(0, app.contacts().getCount());
    }

    @Test
    void canRemoveContactFromGroup() {
        var groups = app.hbm().getGroupList();
        if (groups.isEmpty()) {
            app.hbm().createGroup(new GroupData("", "Group", "Header", "Footer"));
            groups = app.hbm().getGroupList();
        }
        var group = groups.get(0);
        if (app.hbm().getContactsInGroup(group).isEmpty()) {
            var contact = new ContactData()
                    .withFirstName("Test")
                    .withLastName("GroupRemove")
                    .withPhoto(randomFile("src/test/resources/images"));
            app.contacts().createContact(contact, group);
        }
        var oldContacts = app.hbm().getContactsInGroup(group);
        var contactToRemove = oldContacts.get(0);
        app.contacts().removeContactFromGroup(contactToRemove, group);
        var newContacts = app.hbm().getContactsInGroup(group);
        Assertions.assertEquals(oldContacts.size() - 1, newContacts.size());
    }

}
