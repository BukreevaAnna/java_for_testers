package model;

public record ContactData(String id, String first_name, String last_name, String email) {

    public ContactData(){
        this("", "","","");

    }

    public ContactData withId(String id) {
        return new ContactData(id, this.first_name, this.last_name, this.email);
    }

    public ContactData withFirstName(String first_name) {
        return new ContactData(this.id, first_name, this.last_name, this.email);
    }

    public ContactData withLastName(String last_name) {
        return new ContactData(this.id, this.first_name, last_name, this.email);
    }

    public ContactData withEmail(String email) {
        return new ContactData(this.id, this.first_name, this.last_name, email);
    }

    public ContactData withAddress(String address) {
        return null;
    }

    public ContactData withAllPhones(String phones) {
        return null;
    }
}