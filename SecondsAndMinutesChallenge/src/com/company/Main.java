package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    //тук е декларирана констана, която е полезна за използване на еднаки съобщения
    //Те не може да бъде коригирана
    //Конвенцията е да се пише с главни букви и долна черта на мястото на интервала, така по-лесно се разпознава

    public static void main(String[] args) {

        String time = getDurationString(1222, -7);
        System.out.println(time);

        System.out.println("\n---------\n");
        time = getDurationString(3652);
        System.out.println(time);
    }

    private static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 60) {

            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes/60 ;
        minutes %= 60;

        String time;

        if (hours >= 10) {
            time = hours + "h ";
        } else {

            time = "0" + hours + "h ";
        }

        if (minutes >= 10) {

            time += minutes + "m ";
        } else {

            time += "0" + minutes + "m ";
        }

        if (seconds >= 10) {

            time += seconds + "s";
        } else {

            time += "0" + seconds + "s ";
        }

        return time;
    }

    private static String getDurationString(int seconds){

        if (seconds < 0) {

            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60 ;
        seconds %= 60;

        String time = getDurationString(minutes,seconds);
        return time;
    }
}
