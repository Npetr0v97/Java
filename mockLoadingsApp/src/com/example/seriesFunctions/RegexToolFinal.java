package com.example.seriesFunctions;

import javax.management.StandardEmitterMBean;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexToolFinal  {

    private ArrayList<Loading> loadings;
    private ArrayList<SearchedLoading> searchedLoadings;
    private static Scanner scanner;
    private FileWriter loadingsFile;
    private int idCounter=1;


    public RegexToolFinal() {

        loadings = new ArrayList<>();
        searchedLoadings = new ArrayList<>();


//        try {
//            loadingsFile = new FileWriter("loadings.txt", true);
////            loadingsFile.write("\n");
//        } catch (IOException e) {
//
//            e.printStackTrace();
//        }


    }

    public void addLoading(long number) {



        if (checkLoadingNumber(number) == -1l) {
            try {
                loadingsFile = new FileWriter("loadings.txt", true);
                Loading tempLoading = new Loading(number, returnLastLoadingId()+idCounter);
                idCounter++;
                String tempID = String.valueOf(tempLoading.getID());
                String tempNumber = String.valueOf(tempLoading.getNumber());

                System.out.println(tempLoading.getID()+", " + tempLoading.getNumber());
                loadingsFile.write(tempID+", " + tempNumber+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            System.out.println("There is already a loading with the number " + number);
        }

//        loadings.add(new Loading(number));
    }

    public String returnLoadingURL(long number) throws IOException{

        Loading tempLoading = checkLoadingObj(number);

        if (tempLoading!=null) {

            return "["+tempLoading.getNumber()+"|https://econt-bg.com/page.php?page=loading_order&id="+tempLoading.getID()+"&returnAction=onCloseEditedLoading]";
        }

        return "Loading with the number " + number + " was not found";
    }

    public long checkLoadingNumber(long number) {

        try {
            scanner = new Scanner(new FileReader("loadings.txt"));
            scanner.useDelimiter(",");

            while (scanner.hasNextLine()) {

                scanner.next();
                scanner.skip(scanner.delimiter());
                String tempNext=scanner.nextLine().trim();
                long tempNumber = Long.parseLong(tempNext);
                if (number == tempNumber) {
                    return tempNumber;
                }


            }
        } catch (IOException e) {

            e.printStackTrace();
        }


        return -1;
    }

    public int returnLastLoadingId() throws IOException{

        scanner = new Scanner(new FileReader("loadings.txt"));
        scanner.useDelimiter(",");
        int tempID=-1;
        while (scanner.hasNextLine()) {

            tempID = scanner.nextInt();
            scanner.nextLine();


        }

        return tempID;
    }

    public Loading checkLoadingObj(long number) throws IOException{

        scanner = new Scanner(new FileReader("loadings.txt"));

        while (scanner.hasNextLine()) {

            scanner.useDelimiter(",");
            int tempInt = scanner.nextInt();
            scanner.skip(scanner.delimiter());
            String tempNext=scanner.nextLine().trim();
            long tempNumber = Long.parseLong(tempNext);
            if (number == tempNumber) {
                return new Loading(tempNumber, tempInt);
            }


        }

        return null;
    }

    public void cleanUp() throws IOException{



        if (loadingsFile!=null) {

            loadingsFile.close();
        }

    }

    public void printLoadings() {

        for (Loading l : loadings) {

            System.out.println(l);
        }
    }

    public Loading searchLoading(long number) {

        for (Loading l : loadings) {

            if (l.getNumber()==number){
                return l;
            }
        }
        return null;
    }
    // TODO: 19.5.2021 г. да се приложи аналогичен алгоритъм. Неоткритите товарителници да се извеждат отделно в конзолата 

    public String searchLoadings(String text) {
        String newText=text;
        String tokens[] = text.split(" ");


        String loading; //дефинира се променилива за товарителниците
        Pattern loadingsApi = Pattern.compile("(105)\\d{9}|(5300)\\d{10}", Pattern.MULTILINE); //сглобява се патерн, който следи за товарителници през АПИ

        for (int i = 0; i < tokens.length; i++) { //обхождат се токените
            loading = null; //занулява се променливата на товарителницата
            Matcher matcher;

            matcher = loadingsApi.matcher(tokens[i]); // сравнява се дали патерна съществува в токена

            if (matcher.find()) { //ако съществува
                loading = matcher.group(); //loading присвоява резултата
            }

            if (loading!=null) {

                Loading tempLoading = searchLoading(Long.parseLong(loading));
                if (tempLoading!=null) {

                    searchedLoadings.add(new SearchedLoading(tempLoading.getNumber(), tempLoading.getID(), true));
                } else {
                    searchedLoadings.add(new SearchedLoading(Long.parseLong(loading), -1, false));

                }


                //loadingURLs.add("["+loading+"|https://econt-bg.com/page.php?page=loading_order&id="+"X"+"&returnAction=onCloseEditedLoading]");

            } else {
                System.out.println(tokens[i]+" is not a loading");
            }


        }

        for (SearchedLoading sl : searchedLoadings) {

            System.out.println(sl);
        }
//        // или за товарителници, подготвени през рецепция
//        ArrayList<String> loadings = new ArrayList<>();
//        ArrayList<String> loadingURLs = new ArrayList<>();
//
//        String newText = text; //текстът, който ще бъде променен в последствие
//
//        String tokens[] = text.split(" "); //Текстът се разбива на токени
//        String loading; //дефинира се променилива за товарителниците
//        Matcher matcher; //дефинира се матчер
//        Pattern loadingsApi = Pattern.compile("(105)\\d{9}|(5300)\\d{10}", Pattern.MULTILINE); //сглобява се патерн, който следи за товарителници през АПИ
//        // или за товарителници, подготвени през рецепция
//
//        for (int i = 0; i < tokens.length; i++) { //обхождат се токените
//            loading = null; //занулява се променливата на товарителницата
//            matcher = loadingsApi.matcher(tokens[i]); // сравнява се дали патерна съществува в токена
//
//            if (matcher.find()) { //ако съществува
//                loading = matcher.group(); //loading присвоява резултата
//            }
//
//            if (loading!=null) {
//
//                loadings.add(loading); //ако има резултата, той се добавя в листа
//                loadingURLs.add("["+loading+"|https://econt-bg.com/page.php?page=loading_order&id="+"X"+"&returnAction=onCloseEditedLoading]");
//
//            }
//        }
//        if (!loadings.isEmpty()){ // извеждане на листа с товарителници
//            for (int i = 0; i < loadings.size(); i++) {
//
//                newText=newText.replaceAll(loadings.get(i),loadingURLs.get(i));
//
//
//            }
//        } else {
//
//            System.out.println("No changes were made to the original text"); //или съобщение, че няма намерени резултати
//        }
//
//        return newText;
        return null;
    }
}
