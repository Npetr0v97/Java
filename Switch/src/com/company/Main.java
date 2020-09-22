package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 1;

        if (value == 1) {

            System.out.println("Value is 1");
        } else if (value == 2) {

            System.out.println("Value is 2");
        } else {

            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;

        switch(switchValue) {

            case 1:

                System.out.println("Value is 1");
                break;

            case 2:

                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:

                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("The value was " + switchValue);
                break;

            default:

                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
            }

            char choice = 'B';

            switch(choice) {

                case 'A': case 'B': case 'C': case 'D': case 'E':

                    System.out.println("The answer is " + choice);
                    break;

                default:

                    System.out.println("Answer not found");
                    break;

            }

            String month="janUarY";

        System.out.println(month.toLowerCase());

            switch(month.toLowerCase()) {

                case "January":

                    System.out.println("Jan");
                    break;

                case "June":

                    System.out.println("Jun");
                    break;

                default:

                    System.out.println("Not sure");
                    break;
            }
        }
    }

