package ru.valiev.lesson04.Task2;

/*Написать программу, которая описывает введенное число.
Отрицательное оно число или положительное (или нулевое), чётное или нечётное. */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число! ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Число равно нулю!");
            return;
        }
        if (number > 0) {
            System.out.println("Число положительное!");
        }else if (number < 0) {
            System.out.println("Число отрицательное!");
        }
        if (number % 2 == 0 ) {
            System.out.println("Число четное!");
        } else  {
            System.out.println("Число нечетное!");
        }
    }
}
