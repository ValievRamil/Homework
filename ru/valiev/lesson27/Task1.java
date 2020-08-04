package ru.valiev.lesson27;

import java.util.Scanner;

public class Task1 {
    public void fibanacci(int n) {
        int array[] = new int[n];

        for (int i = 0; i <n; i++) {
            if (i == 0) array[i] = 0;
            if (i == 1) array[i] = 1;
            if (i > 1) array[i] = array[i - 1] + array[i - 2];
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.fibanacci(10);
    }
}

