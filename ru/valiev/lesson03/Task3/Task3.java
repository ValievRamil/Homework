package ru.valiev.lesson03.Task3;

import java.util.Scanner;

/* Программа, которая конвертирует секунды в часы */
public class Task3 {

    public static void main(String[] args) {
        System.out.print("Введите секунды:");

        Scanner scanner = new Scanner( System.in);

        int sec = scanner.nextInt();

        int hour =  (sec / 3600);
        double min = sec % 3600;
        int min2 = (int) (min  / 60);



        System.out.println( sec + "  ceкунд это " + hour + " час " + min2 + " минут.");



    }
}
