package com.company;

public class Main {

    public static void main(String[] args) {


        VipCustomer nikolay = new VipCustomer();
        nikolay.printData();

        VipCustomer diana = new VipCustomer("Diana Petrova","petrovadiana@yahoo.com");
        diana.printData();

        VipCustomer petyo = new VipCustomer("Petar Petrov", 2000, "psp@yahoo.com");
        petyo.printData();


    }
}
