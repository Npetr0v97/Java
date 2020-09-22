package com.company;

public class Main {

    public static void main(String[] args) {

      //обектът може да е всеки един обект около нас, той си има параметри и състояния
      //клас е "шаблон" за създаване на обект


        //public - няма никакви рестрикции за ползване на класа. Обикновено се използва public
        //private - никой друг клас няма достъп до този клас
        //protected - всички класове в рамките на пакета имат до достъпа на класа
        //самите променливи в класа (наричат се fields) обикновено се дефинират с private. Това се нарична encapsulation.
        //Така дефиницията на класа често е public - достъпна за всички, а променливите са затворени вътре в нея.

        Car porsche = new Car();
        //това инициализира променлива от тип Car с името porsche. След създаването на променливатам обектите трябва
        //да се инициализрат, което става с = new Car();
        Car holden = new Car();

/*        public class Car {

            private int doors;
            private int numberOfWheels;
            public String model; <- оставяйки я public така данните стават достъпни от класовете извън самия class
            //оставяйки я на private (което е прието като конвенция) то тогава само методи в самия клас имат достъп до променливата
            private String engine;
            private String color;
        }*/
        System.out.println("The model of the car is " + porsche.getModel());
        //това връща null, защото самият field не е инициализиран, което реално се случва на следващия ред
        porsche.setModel("911");
        //това се нарича Setter и е конвенция да се използва за Update-ване на field-овете (променливите) на самия клас

        System.out.println("The model of the car is " + porsche.getModel()); //това се нарича Getter, конвенция за извеждане на данни
        // от полетата (field-овете) на класа

        //Какви всъщност за ползите от Getters and Setters
        //setters позволяват да се добавя логиката, като различна валидация на входните данни
    }
}
