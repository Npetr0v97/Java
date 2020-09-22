package com.company;

public class Main {

    public static void main(String[] args) {

        /*System.out.println("10,000 at 2% interest is " + calculateInterest(10000,2));
        System.out.println("10,000 at 3% interest is " + calculateInterest(10000,3));
        System.out.println("10,000 at 4% interest is " + calculateInterest(10000,4));
        System.out.println("10,000 at 5% interest is " + calculateInterest(10000,5));
        System.out.println("10,000 at 6% interest is " + calculateInterest(10000,6));*/

        //for (<инициализиране на променлива, която съществува само за самия цикъл>;
        //<условие, което прекъсва цикъла при false>;<увеличаване на променливата от условието)
        //в примера i съществува в рамките на кодовия блок. За индекси се избират предимно променливите
        //i, j, k и тн.
        for (int i=8; i>1; i--) {

            System.out.println("10,000 at " + i + "% interest is " + String.format("%.2f",calculateInterest(10000,(double)i)));
        }

        System.out.println("\n -----------------Challenge---------------- \n");

        int number = 112;
        int countOfPrimeNums = 0;

        for (int i=number; i>0; i++) {

            if (isPrime(number)) {

                System.out.println("Found a Prime number "+number);
                countOfPrimeNums++;
            }
            number++;
            if (countOfPrimeNums==3){

                System.out.println("3 Prime number have been found");
                break;
                //break при for loop може да се използва за изрично излизане от цикъла
            }
        }

    }

    public static double calculateInterest(double amount,double interest){

        return (amount * (interest / 100));
    }

    public static boolean isPrime(int number) {

        if (number == 1) {

            return false;
        }

        for (int i=2; i<=number/2; i++) { //разделя се на 2, а i<=number/2 се прави, защото в противен случай винаги ще имаме true
                                        //пример, ако number е 7, то след 3 винаги ще имаме резултат true, което не е правилно
            //i<=number/2; може да се замени с (long) Math.sqrt(number)
            if (number % i == 0) {

                return false;
            }
        }

        return true;
    }
}
