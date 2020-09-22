package com.company;

public class Main {

    public static void main(String[] args) {
            //и четирите алгоритъма постигат един и същ резултат
            //break: функция, която прекратява даден цикъл и спира последващ код да бъде изпълнен;
            //continue: подобен на break, с разликата, че прекратява последващ код да бъде изпълнен, но пуска цикъла отначало
            //независимо дали е while, for или do while
            int count=0;

            while (count != 6) {

                System.out.println("Count is " + count);
                count++;
            }

            for (int i=0; i<6; i++) {

                System.out.println("Count is " + i);
            }
            count=0;
            while (true) {

                if (count==5) {

                    break;
                } else {
                    count++;
                    System.out.println("Message");
                }
            }
            count=0;
            do {

                System.out.println("Message");
                count++;
            }while (count!=5);

        System.out.println("\n------------Challenge------------\n");

        int number=4;
        int finishNumber=20;
        int evenNumberCount=0;

        while (number <= finishNumber) {
            number++;

            if (evenNumberCount==5){

                break;
            }
            if (!isEvenNumber(number)) {
                continue;

            }

            System.out.println("Found an even Number: " + number);
            evenNumberCount++;
        }
    }

    public static boolean isEvenNumber (int number) {

        if (number % 2 == 0) {

            return true;
        } else {

            return false;
        }
    }
}
