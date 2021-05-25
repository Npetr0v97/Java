package com.example.seriesFunctions;

public class SearchedLoading extends Loading{

    private boolean isFound;

    public SearchedLoading(long number, int ID, boolean isFound) {

        super(number, ID);
        this.isFound = isFound;
    }

    public boolean isFound() {
        return isFound;
    }

    @Override
    public String toString() {

        return "SearchedLoading{" +
                "number=" +  this.getNumber() + ", " +
                "ID=" + this.getID() + ", " +
                "isFound=" + isFound +
                '}';
    }

    //// TODO: 19.5.2021 г. генерирана на товарителници с маркер
}
