package ru.valiev.lesson21.task2;

public class Methods {


    static void arrayReverse(int[] ar) {
        int[] temp = new int[ar.length];
        int tmp = ar.length - 1;
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[tmp];
            tmp--;
        }
        for (int i = 0; i < ar.length; i++) {
            ar[i] = temp[i];
        }
    }

    static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%d  ", ar[i]);

        }
        System.out.println();
    }
}

