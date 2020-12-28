package com.example.seriesFunctions;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            //започваме с втория елемент arr[i]

            int key = arr[i]; //запаметяваме стойността му в key
            int j = i - 1; //вземаме индекса на предходния елемент

            //към този момент разполаме със стойността на i-тия елемент, неговия индекс и индекса на елемента преди него

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) { //докато не сме стигнали началото на масива И j-тия елемент е по-голям от запаметената ни стойност в key
                arr[j + 1] = arr[j]; //елементът след j-тия елемент присвоява j-тия елемент
                j = j - 1; //връщаме се една позиция назад
            }
            arr[j + 1] = key; //елементът, до който сме стигнали, присвоява първоначалната запаметена стойност
            //insertion sort може да се разглежда като нареждане на картите в ръка по големина. Държиш картите и поставяш най-малките отляво, докато не получиш
            //правилната подредба
        }
        return arr;
    }
}
