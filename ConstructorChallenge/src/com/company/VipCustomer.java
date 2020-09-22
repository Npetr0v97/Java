package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer() {

        this("Default name",1000,"defaultmail@econt.com");
    }

    public VipCustomer(String name, String emailAddress) {

        this(name,1000,emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void printData() {

        System.out.println("Name: " + getName() + "\n Credit limit: " + String.format("%.2f",getCreditLimit()) + "\n E-mail Address: " + getEmailAddress());
        System.out.println("-------------------");
    }
}
