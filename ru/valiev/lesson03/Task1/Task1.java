package ru.valiev.lesson03.Task1;

import java.util.Scanner;
/* Программа, которая считает стоимость бензина */

public class Task1 {

    public static void main(String[] args) {
        int price = 43;

        System.out.println("Сколько литров бензина Вы хотите заправить?");

        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        int sum = price * quantity;
        System.out.println("К оплате " + sum + " руб.12");


    }
}
