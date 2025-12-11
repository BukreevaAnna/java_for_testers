package tests.Contacts;

import common.CommonFunctions;
import model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import tests.TestBase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase{


    public static List<ContactData> contactProvider() {
        var result = new ArrayList<ContactData>();
        for (var first_name : List.of("", "first name")){
            for (var last_name : List.of("", "last name")){
                for (var email : List.of("", "test@gmail.com")){
                    result.add(new ContactData().withFirstName(first_name).withLastName(last_name).withEmail(email));
                }
            }
        }
        for (int i = 0; i < 5; i++){
            result.add(new ContactData()
                    .withFirstName(CommonFunctions.randomString(i *3))
                    .withLastName(CommonFunctions.randomString(i * 3))
                    .withEmail(CommonFunctions.randomString(i + 5) +"@gmail.com"));
        }
        return result;
    }


    @ParameterizedTest
    @MethodSource("contactProvider")
    public void canCreateMultipleContacts(ContactData contact) {
        var oldContacts = app.contacts().getList();
        app.contacts().createContact(contact);
        var newContacts = app.contacts().getList();
        Comparator<ContactData> compareById = (o1, o2) -> {
            return Integer.compare(Integer.parseInt(o1.id()), Integer.parseInt(o2.id()));
        };
        newContacts.sort(compareById);
        var expectedList = new ArrayList<>(oldContacts);
        expectedList.add(contact.withId(newContacts.get(newContacts.size() - 1).id()));
        expectedList.sort(compareById);
        Assertions.assertEquals(newContacts, expectedList);
    }

    @Test
    void canCreateContact(){
        var contact = new ContactData()
                .withFirstName(CommonFunctions.randomString(6))
                .withLastName(CommonFunctions.randomString(6))
                .withPhoto(randomFile("src/test/resources/images"));
        app.contacts().createContact(contact);
    }

}
