package ru.valiev.lesson03.Task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

/* Программа, которая считает зарплату «на руки» */
public class Task2 {

    public static void main(String[] args) {

        System.out.println("Укажите Вашу зарплату до вычета налогов:");
        Scanner scanner = new Scanner(System.in);

        BigDecimal bigDecimal;
        bigDecimal = scanner.nextBigDecimal();

        BigDecimal bigDecimal1;
        bigDecimal1 = bigDecimal.multiply(BigDecimal.valueOf(0.13));

        BigDecimal result;
        result = bigDecimal.subtract(bigDecimal1);


        System.out.print("Ваша зарплата \" на руки \" сотавит: " + result + ";");

    }

}
