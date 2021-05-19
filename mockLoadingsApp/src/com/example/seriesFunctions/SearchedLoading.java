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

    //// TODO: 19.5.2021 г. генерирана на товарителници с маркер
}
