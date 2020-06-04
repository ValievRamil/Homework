package ru.valiev.lesson02.Task2;

/* Программа, которая считает зарплату «на руки» */

public class Task2 {
    public static void main(String[] args) {
        double zarplata = 70000;
        double ndfl = zarplata * 0.13;

        System.out.println("При зарплате в " + zarplata + " руб. \" на руки \" получаешь " + (zarplata - ndfl) + " руб.");

    }
}
