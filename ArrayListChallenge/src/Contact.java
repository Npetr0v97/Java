public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {

        this.name = name;
        this.phoneNumber = phoneNumber;

        System.out.println("New contact added: " + this.name +" (" + this.phoneNumber + ") ");
    }



    public String getName() {

        return name;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {

        return new Contact(name, phoneNumber);
    }
}









