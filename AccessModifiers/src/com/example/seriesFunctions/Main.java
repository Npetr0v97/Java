package com.example.seriesFunctions;

public class Main {
    public static int multiplier = 7;
    public static void main(String[] args) {

//        Account timsAccount = new Account("Tim");
//        timsAccount.deposit(1000);
//        timsAccount.withdraw(500);
//        timsAccount.withdraw(-200);
//        timsAccount.deposit(-20);
//        timsAccount.calculateBalance();
////        timsAccount.balance = 5000;
//
//
//        System.out.println("Balance on account is " + timsAccount.getBalance());
////        timsAccount.transactions.add(4500);
//        timsAccount.calculateBalance();
//
//        StaticTest firstInstance = new StaticTest("1st instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("2rd instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        int answer = multiply(6);
//        System.out.println("The answer is " + answer);
//        System.out.println("Multiplier is " + multiplier);

//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//        System.out.println(Math.PI);


//
//        int pw = 674312;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(4546456);
//        password.letMeIn(0);
//        password.letMeIn(674312);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();

        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }

    public static int multiply(int number) {

        return number * multiplier;
    }
}
