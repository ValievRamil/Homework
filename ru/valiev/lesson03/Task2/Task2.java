package ru.valiev.lesson03.Task2;

import java.util.Scanner;

/* Программа, которая считает зарплату «на руки» */
public class Task2 {

    public static void main(String[] args) {
        System.out.println("Укажите Вашу зарплату до вычета налогов:");

        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        int tax = (salary * 13 / 100);
        System.out.print("Ваша зарплата \" на руки \" сотавит: " + (salary - tax));

    }

}
