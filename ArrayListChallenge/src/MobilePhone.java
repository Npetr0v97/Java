import java.util.ArrayList;

public class MobilePhone {

    ArrayList<Contact> myContacts = new ArrayList<Contact>();
    private String myNumber;

    public MobilePhone(String myNumber) {

        this.myNumber =  myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public void printList() {

        System.out.println("Phone contacts\n=======================================");

        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " - " + myContacts.get(i).getPhoneNumber());

        }
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName())>=0) {

            System.out.println("Contact already exists.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {

            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else {

            this.myContacts.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
            return true;
        }
    }

/*    public boolean contactPhoneExists(String phoneNumber) {

        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getPhoneNumber() == phoneNumber) {
                System.out.println("Contact with phone number " + phoneNumber + " already exists.");
                return true;
            }
        }
        return false;
    }*/

    public boolean removeContact (Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {

            System.out.println(contact.getName() + " was found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;

    }

    private int findContact(Contact contact) {

        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (int i=0; i < this.myContacts.size(); i++) {

            Contact contact = this.myContacts.get(i);

            if (contact.getName().equals(contactName)) {

                return 1;
            }
        }

        return -1;
    }

    public String queryContact(Contact contact) {

        if (findContact(contact) >= 0) {

            return contact.getName();

        } else {

            return null;
        }
    }
}
