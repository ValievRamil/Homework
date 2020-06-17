package ru.valiev.lesson02.Task2;

/* Программа, которая считает зарплату «на руки» */

public class Task2 {
    public static void main(String[] args) {
        int salary = 70000;
        int ndfl = (int) (salary * 0.13);

        System.out.println("При зарплате в " + salary + " руб. \" на руки \" получаешь " + (salary- ndfl) + " руб.");

    }
}
