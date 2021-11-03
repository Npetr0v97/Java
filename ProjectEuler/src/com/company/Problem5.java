package com.company;

public class Problem5 {

    public static void main(String[] args) {

        boolean evenlyDivisible=false;
        int answer=0;
        int counter=0;
        int number=20;

        while (true) {
            counter++;

            for (int i=10;i<=20;i++) {

                if (number%i==0 && i==20) {
                    evenlyDivisible=true;

                } else if (number%i!=0){
                    break;
                }
            }

            if (evenlyDivisible) {

                answer=number;
                break;
            } else {

                number+=10;
            }

        }

        System.out.println("Answer "+answer);
        System.out.println(counter+" cycles");
    }
}
