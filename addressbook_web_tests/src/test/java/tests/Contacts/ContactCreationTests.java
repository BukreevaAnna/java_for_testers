package tests.Contacts;

import model.ContactData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import tests.TestBase;

import java.util.ArrayList;
import java.util.List;

public class ContactCreationTests extends TestBase{


    public static List<ContactData> contactProvider() {
        var result = new ArrayList<ContactData>();
        for (var first_name : List.of("", "first name")){
            for (var last_name : List.of("", "last name")){
                for (var email : List.of("", "test@gmail.com")){
                    result.add(new ContactData(first_name, last_name, email));
                }
            }
        }
        for (int i = 0; i < 5; i++){
            result.add(new ContactData(randomString(i *3), randomString(i * 3), randomString(i + 5) +"@gmail.com"));
        }
        return result;
    }


    @ParameterizedTest
    @MethodSource("contactProvider")
    public void canCreateMultipleContacts(ContactData contact) {
        app.contacts().createContact(contact);
    }


}
