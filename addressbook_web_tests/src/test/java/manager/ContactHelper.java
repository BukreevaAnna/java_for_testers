package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase{

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

//    public void openContactsPage() {
//        if (manager.isElementPresent(By.name("new"))) {
//            click(By.linkText("add new"));
//        }
//    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();
    }

    public void removeContact() {
        selectContact();
        removeSelectedContact();
        returnToHomePage();
    }

    private void selectAllContacts() {
        var checkboxes = manager.driver.findElements(By.name("selected[]"));
        for (var checkbox : checkboxes){
            checkbox.click();
        }
    }

    private void removeSelectedContact() {
        click(By.name("delete"));
    }

    private void initContactCreation() {
        click(By.linkText("add new"));
    }

    public boolean isContactPresent() {
        return manager.isElementPresent(By.name("selected[]"));
    }

    private void returnToHomePage() {
        click(By.linkText("home page"));
    }

    private void fillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.first_name());
        type(By.name("lastname"), contact.last_name());
        type(By.name("email"), contact.email());
    }

    private void selectContact() {
        click(By.name("selected[]"));
    }

    private void submitContactCreation() {
        click(By.name("submit"));
    }


    public int getCount() {
        return manager.driver.findElements(By.name("selected[]")).size();
    }

    public void removeAllContacts() {
            selectAllContacts();
            removeSelectedContact();
            returnToHomePage();


        }
    }
