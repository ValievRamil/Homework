package ru.valiev.lesson03.Task3;

import java.util.Scanner;

/* Программа, которая конвертирует секунды в часы */
public class Task3 {

    public static void main(String[] args) {
        System.out.print("Введите секунды:");

        Scanner scanner = new Scanner( System.in);

        int sec = scanner.nextInt();

        double hour = sec / 3600.0;

        System.out.println( sec + "  ceкунд это " + hour + " час.");


    }
}
