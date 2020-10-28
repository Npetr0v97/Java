import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contactsList = new ArrayList<Contact>();
    private String myName;

    public MobilePhone(String myNumber, String myName) {

        this.myName = myName;
        this.myNumber = myNumber;
        this.contactsList = new ArrayList<Contact>();
    }

    public String getMyNumber() {
        return myNumber;
    }

    public ArrayList<Contact> getContactsList() {
        return contactsList;
    }

    public String getMyName() {
        return myName;
    }
    // TODO: 28.10.2020 г. Method: check whether theres a contact with the same number or name

    // TODO: 28.10.2020 г. Method: return the index of the written name. Return -1 if it doesn't exist

    // TODO: 28.10.2020 г. Method: add a new contact + search whether this contact exists

    // TODO: 28.10.2020 г. Method: modify a contact. Find it by name and change its number

    // TODO: 28.10.2020 г. Method: remove a phone number by name

    // TODO: 28.10.2020 г. Method: print the whole contacts list


}
