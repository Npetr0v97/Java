package com.company;

public class Main {

    public static void main(String[] args) {

        //#45
        //всички думи се оцветяват в различен цвят
        //при One Dark Theme розовото е за ключови думи
        //синьото е име не метод
        //оранжевото е за стойности
        //сивото и бялото за име на променливи


        boolean gameOver = true;
        int score = 50000;
        int levelCompleted = 5 ;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//
//            System.out.println("Your score was less than 5000 and greater than 1000");
//
//        } else if (score <= 1000){
//            System.out.println("Your score is less that 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //int savedFinalScore = finalScore;
        //в горният code block се създавам finalScore променлива, която е достъпна само в рамките на кодовия блок. Това се нарича scope
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }
}
