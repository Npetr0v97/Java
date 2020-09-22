package com.company;

public class Car {

    private int doors;
    private int numberOfWheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        //тук се стига до парадокс, в който имаме два параметъра (променливи) с еднакво име
        //първо е дефинира private String model, а в текущия метод е дефиниран като входен параметър
        //за тази цел се използва this, което е указател към field (променливата дефинирана в самия клас)

        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
        //.equals методът се използва за сравняване на String-ове
            this.model = model;
        } else {

            this.model = "Unknown";
        }

    }

    public String getModel() {

        return this.model;
    }
}
