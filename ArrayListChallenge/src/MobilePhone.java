import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contactsList;
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


    public boolean contactExists(String name) {

        for (int i=0; i < contactsList.size(); i++) {

            if (contactsList.get(i).getName().equals(name)) {

                return true;
            }
        }

        return false;
    }

    public int contactPosition(String name) {

        for (int i=0; i < contactsList.size(); i++) {

            if (contactsList.get(i).getName().equals(name)) {

                return i;
            }
        }

        return -1;
    }

    public void addContact(String name, String phoneNumber) {

        if (contactExists(name)) {

            System.out.println("Contact " + name + " already exists.");
        } else {

            contactsList.add(Contact.createContact(name,phoneNumber));
            System.out.println("Contact created");
        }
    }

    public void modifyContact(String name, String newNumber) {

        int contactPosition = contactPosition(name);
        if (contactPosition >= 0) {

            contactsList.get(contactPosition).setPhoneNumber(newNumber);
            System.out.println("Phone number changed.");
        } else {

            System.out.println("No contact with the name " + name + " found.");
        }
    }


    public void removeContact(String name) {

        int contactPosition = contactPosition(name);
        if (contactPosition >= 0) {

            contactsList.remove(contactPosition);
            System.out.println("Contact removed.");
        } else {

            System.out.println("No contact with the name " + name + " found.");
        }
    }

    public void printContactList() {

        for (int i=0; i < contactsList.size(); i++) {

            System.out.println((i+1) + ". " + contactsList.get(i).getName() + ": " + contactsList.get(i).getPhoneNumber());
        }
    }

}
