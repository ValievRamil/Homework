package ru.valiev.lesson21.task2;

import static ru.valiev.lesson21.task2.Methods.arrayReverse;
import static ru.valiev.lesson21.task2.Methods.printArray;

public class Reverse {

    public static void main(String[] args) {
        int[] array = {10,11,12,13,14,15,16,17,18,19};

        printArray(array);
        arrayReverse(array);
        printArray(array);

    }
}
