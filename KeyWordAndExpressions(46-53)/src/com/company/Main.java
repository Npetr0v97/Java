package com.company;

public class Main {

    //#43

    public static void main(String[] args) {
	double kilometres = 100d * 1.609344d;

	int highScore = 50;

	if (highScore==50) {

        System.out.println("This is an expression");

    }

        int score = 100; //целият ред е statement, а score = 100 е expression
        if (score > 99) { //целият ред е statement, а score > 99 е expression
            System.out.printf("You got the high score"); //целият ред е statement, а You got the high score е expression
            score = 0; //целият ред е expression
        }

    }

}
