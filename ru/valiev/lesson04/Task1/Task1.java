package ru.valiev.lesson04.Task1;

/* Написать программу для поиска минимального из двух чисел */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("Введенные числа равны!");
        } else {
            System.out.println("Минимальным из двух чисел является число: " + Math.min(a,b));
        }
    }
}
