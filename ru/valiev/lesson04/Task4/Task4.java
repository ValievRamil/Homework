package ru.valiev.lesson04.Task4;

//Программа, которая выводит арифметическую или геометрическую прогрессию для N чисел.

import java.util.Scanner;

public class Task4 {
    static int a = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите челое положительно число N: ");
        int N = scanner.nextInt();
        System.out.println("Арифметическая прогрессия:");
        System.out.print(a + " ");
        for (int i = 1; i < N; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        System.out.println("Геометрическая прогрессия: ");
        System.out.print(a + " ");

        for (int i = 1; i < N; i++) {
            int c = a * 2;
            a = c;
            System.out.print(a + " ");
        }
    }
}
