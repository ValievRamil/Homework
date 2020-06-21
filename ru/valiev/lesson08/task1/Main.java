package ru.valiev.lesson08.task1;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        System.out.println(Calculator.amount(5,6));
        System.out.println(Calculator.amount(5.5,5.6));
        System.out.println(Calculator.difrence(8,5));
        System.out.println(Calculator.difrence(55.6,44.1));
        System.out.println(Calculator.miltiplication(12,43));
        System.out.println(Calculator.miltiplication(3.1,6.0));
        System.out.println(Calculator.division(15,5));
        System.out.println(Calculator.division(12.3,3.1));
        System.out.println(Calculator.percent(15.5, 5.5));// из 15,5 вычитаем 5.5 процентов



    }
}
