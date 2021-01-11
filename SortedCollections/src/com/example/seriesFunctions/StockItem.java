package com.example.seriesFunctions;

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private double price;
    private int quantity = 0;

    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {

        int newQuantity = this.quantity + quantity;

        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object obj) { //override-ва се, за да може правилно да се вкарват обекит в Set и HashMap

        System.out.println("Entering StockItem.equals");
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() { //override-ва се, за да може equals да работи коректно
        return super.hashCode() + 311;
    }


    @Override
    public int compareTo(StockItem o) { //override-ва се, за да може правилно да се сортира SortedCollection-a
        System.out.println("Entering StockItem.compareTo");
        if (this == o) {

            return 0;
        }

        if (o!=null) {

            return this.name.compareTo(o.getName()); //това не е рекурсия а използване на overload-нат compareTo метод с параметър String
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
