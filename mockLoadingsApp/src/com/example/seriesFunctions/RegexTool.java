package com.example.seriesFunctions;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTool {

    private static int ID = 1;

    public static String searchLoadings(String text) {
        ArrayList<String> loadings = new ArrayList<>();
        ArrayList<String> loadingURLs = new ArrayList<>();

        String newText = text; //текстът, който ще бъде променен в последствие

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
                loadingURLs.add("["+loading+"|https://econt-bg.com/page.php?page=loading_order&id="+ID+"&returnAction=onCloseEditedLoading]");
                ID++;
            }
        }
        if (!loadings.isEmpty()){ // извеждане на листа с товарителници
            for (int i = 0; i < loadings.size(); i++) {

                newText.replaceAll(loadings.get(i),loadingURLs.get(i));

                //todo Тук replaceAll функцията връща нов стринг с новите стойности, тъй като веднъж инициализиран, Стрингът е immutable. Трябва да се оправи кодът
                //да присвоява промененият String На нова променлива

            }
        } else {

            System.out.println("No changes were made to the original text"); //или съобщение, че няма намерени резултати
        }

        return newText;
    }
}
