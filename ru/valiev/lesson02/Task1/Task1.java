package ru.valiev.lesson02.Task1;

/* Программа, которая считает стоимость бензина */
public class Task1 {

    public static void main(String[] args) {
        double cena = 43;
        double kolvo = 50;

        double stoimost = cena * kolvo;

        System.out.println(kolvo  + " литров безина при стоимости " + cena + " за литр будет стоить " + stoimost + " руб.");
    }
}
