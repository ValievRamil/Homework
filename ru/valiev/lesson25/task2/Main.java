package ru.valiev.lesson25.task2;


public class Main {
    public static void main(String[] args) {
        CustomerBasket customerBasket = new CustomerBasket();
        customerBasket.addProduct("Каша", 2);
        customerBasket.addProduct("Водка", 15);
        customerBasket.addProduct("Мясо", 7);
        System.out.println(customerBasket.toString());
        System.out.println();

        customerBasket.addProduct("Каша", 5);
        System.out.println(customerBasket.toString());
        System.out.println();

        customerBasket.removeProduct("Водка");
        customerBasket.addProduct("Колбаса", 3);
        System.out.println(customerBasket.toString());
        System.out.println();

        customerBasket.updateProductQuantity("Колбаса", 5);
        System.out.println(customerBasket.toString());
        System.out.println();

        System.out.println(customerBasket.getProductQuantity("Водка"));
        System.out.println();

        customerBasket.updateProductQuantity("Мясо", 4);
        System.out.println(customerBasket.toString());
        System.out.println();

        System.out.println(customerBasket.getProductQuantity("Каша"));
        System.out.println();

        System.out.println(customerBasket.getProducts());
        System.out.println();

        customerBasket.clear();
        System.out.println(customerBasket.toString());
    }
}