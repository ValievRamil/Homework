package ru.valiev.lesson02.Task1;

/* Программа, которая считает стоимость бензина */
public class Task1 {

    public static void main(String[] args) {
        int price = 43;
        int quantity = 50;

        int stoimost = price * quantity;

        System.out.println(quantity  + " литров безина при стоимости " + price + " за литр, будет стоить " + stoimost + " руб.");

    }
}
