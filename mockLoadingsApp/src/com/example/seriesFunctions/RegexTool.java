package com.example.seriesFunctions;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTool {

    public static ArrayList<String> searchLoadings(String text) {
        ArrayList<String> loadings = new ArrayList<>();

        String tokens[] = text.split(" "); //Текстът се разбива на токени
        String loading; //дефинира се променилива за товарителниците
        Matcher matcher; //дефинира се матчер
        Pattern loadingsApi = Pattern.compile("(105)\\d{9}|(5300)\\d{10}", Pattern.MULTILINE); //сглобява се патерн, който следи за товарителници през АПИ
                                                                                                    // или за товарителници, подготвени през рецепция

        for (int i = 0; i < tokens.length; i++) { //обхождат се токените
            loading = null; //занулява се променливата на товарителницата
            matcher = loadingsApi.matcher(tokens[i]); // сравнява се дали патерна съществува в токена

            if (matcher.find()) { //ако съществува
                loading = matcher.group(); //loading присвоява резултата
            }

            if (loading!=null) {

                loadings.add(loading); //ако има резултата, той се добавя в листа
            }
        }
        if (!loadings.isEmpty()){ // извеждане на листа с товарителници
            for (String s: loadings) {
                System.out.println(s);
            }
        } else {

            System.out.println("No loadings found"); //или съобщение, че няма намерени резултати
        }

        return loadings;
    }
}
