package com.company;

public class Main {

    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();

        groceryList.addGroceryItem("Milk");
        groceryList.addGroceryItem("Bread");
        groceryList.addGroceryItem("Eggs");
        groceryList.printGroceryList();
        groceryList.modifyGroceryItem(1,"Yoghurt");
        groceryList.printGroceryList();
        groceryList.removeGroceryItem(1);
        groceryList.printGroceryList();
    }
}
