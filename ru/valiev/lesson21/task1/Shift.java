package ru.valiev.lesson21.task1;


import static ru.valiev.lesson21.task1.Methods.printArray;
import static ru.valiev.lesson21.task1.Methods.toLeft;


public class Shift {

    public static void main(String[] args) {

        int[][] array = {{4, 6, 8, 1, 4}, {3, 5, 6, 2, 10}};
        printArray(array);
        toLeft(array);
        printArray(array);
    }

}
