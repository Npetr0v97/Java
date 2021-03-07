package com.example.seriesFunctions;

public class Algorithms {

    public static int[] insertionSort(int[] array) {

        if (array.length > 1) { // Проверка дали масивът има 2 или повече елемента. Ако има само 1, то няма нужда от сортиране

            for (int i = 1; i < array.length; i++) { // Обхожда се масивът

                int holder = array[i]; // Запазва се текущия елемент в променлива

                while (i >= 1) { //Започва while цикъл, докато не се достигне втория елемент
                    //До втория, защото се прави проверка дали временната променлива е по-голяма от предходния на втори елемент
                    if (holder < array[i-1]) {
                    // ако временният елемент е по-голям от предходния (на i) елемент, то в  i-ти се записва предходният му елемент и се продължава с цикъла...
                    array[i] = array[i-1];
                    i--;
                    } else {
                        //в противе случай се излиза от цикъла
                        break;
                    }
                }
                // на мястото на i-тия (последно обходен елемент където while цикълът е прекъснал) се записва временният елемент
                array[i] = holder;
            }


        }
        return array;
     }

     public static int[] reverseInsertionSort(int[] array) {

        if (array.length > 1) { // Проверка дали масивът има 2 или повече елемента. Ако има само 1, то няма нужда от сортиране

            for (int i = 1; i < array.length; i++) {

                int holder = array[i];

                while (i >= 1) {

                    if (holder > array[i - 1]) {

                        array[i] = array[i - 1];
                        i--;
                    } else {
                        break;
                    }


                }
                array[i] = holder;
            }
        }
        return array;
     }

     public static int returnIndexOf(int[] array, int searchedInt) {

        int index = -1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == searchedInt) {

                index = i;
            }
        }
        return index;
     }

     public static int[] binarySum (int[] array1, int[] array2) {

        int sizeOfArray;
        int dif;

         int[] arrayX;
         int[] arrayY;

        if (array1.length > array2.length) {
            sizeOfArray = array1.length + 1;

            arrayX = new int[sizeOfArray];
            arrayY = array1;
            dif = array1.length - array2.length;
            for (int i = 0; i < array1.length; i++) {

                if (array1.length - i > array2.length) {

                    arrayX[i] = 0;
                } else {

                    arrayX[i] = array2[i-dif];
                }
            }
        } else {

            sizeOfArray = array2.length + 1;
            arrayX = new int[sizeOfArray];
            arrayY = array2;

            dif = array2.length - array1.length;
            for (int i = 0; i < array2.length; i++) {

                if (array2.length - i > array1.length) {

                    arrayX[i] = 0;
                } else {

                    arrayX[i] = array1[i-dif];
                }
            }

        }

        int[] newArray = new int[sizeOfArray];
        int excess=0;
        int first;
        int second;
        int sum;

        for (int i=sizeOfArray-1; i>=0; i--) {

            if (i-1 >= 0) {
                first = arrayX[i-1];
                second = arrayY[i-1];
            } else {

                first = 0;
                second = 0;
            }

            sum = first + second + excess;

            if (sum==3) {

                newArray[i] = 1;
                excess = 1;
            } else if (sum == 2) {
                newArray[i] = 0;
                excess = 1;
            } else if (sum == 1) {
                newArray[i] = 1;
                excess = 0;
            } else if (sum == 0) {
                newArray[i] = 0;
                excess = 0;
            }

        }

        return newArray;

     }

     public static int[] selectionSort(int[] array) {



        for (int i=0; i < array.length; i++) {
            int min = array[i];
            int indexOfMin = i;
            for (int j = i; j < array.length; j++) {
                System.out.println("...");
                if (min > array[j]) {
                    min = array[j];
                    indexOfMin = j;
                }
            }

            array[indexOfMin] = array[i];
            array[i] = min;
        }
        return array;
     }


}
