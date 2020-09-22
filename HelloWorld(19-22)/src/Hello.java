public class Hello {

    //#19
    //public - access key word, който дава достъп до всички останали класове
    //class се използва за дефиниция на клас като със скобите тип мустачки се отваря и затваря калсовия блок,

    //#20
    // метод е колекция от кодови блокове, които изпълняват дадени операции. Main методът се използва за отправна точка на програмата

    public static void main(String[] args){

        System.out.println("Hello Nikolay!");
        //statement - операция

        //#22
        //variables - променливи, които запазват данни, които могат да бъдат променяни. Данните могат да са от различни типове
        int myFirstNumber = (5 + 6) + (2 * 10),
            mySecondNumber = 12,
            myThirdNumber = 8,
            myTotal = myFirstNumber + mySecondNumber + myThirdNumber,
            myLastOne = myTotal - 1000;

        System.out.println(myFirstNumber);
        System.out.println(myFirstNumber);
        //sout + Tab - комбинацията бързо ни извежда println функцията
        System.out.println(myTotal);
        System.out.println(myLastOne);

        

    }

}
