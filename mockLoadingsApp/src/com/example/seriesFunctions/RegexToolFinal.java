package com.example.seriesFunctions;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexToolFinal {

    private static ArrayList<Loading> loadings = new ArrayList<>();


    public static void addLoading(long number) {

        loadings.add(new Loading(number));
    }

    public static void printLoadings() {

        for (Loading l : loadings) {

            System.out.println(l);
        }
    }

    public static Loading searchLoading(long number) {

        for (Loading l : loadings) {

            if (l.getNumber()==number){
                return l;
            }
        }
        return null;
    }
    // TODO: 19.5.2021 г. да се приложи аналогичен алгоритъм. Неоткритите товарителници да се извеждат отделно в конзолата 

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
                loadingURLs.add("["+loading+"|https://econt-bg.com/page.php?page=loading_order&id="+"X"+"&returnAction=onCloseEditedLoading]");

            }
        }
        if (!loadings.isEmpty()){ // извеждане на листа с товарителници
            for (int i = 0; i < loadings.size(); i++) {

                newText=newText.replaceAll(loadings.get(i),loadingURLs.get(i));


            }
        } else {

            System.out.println("No changes were made to the original text"); //или съобщение, че няма намерени резултати
        }

        return newText;
    }
}
