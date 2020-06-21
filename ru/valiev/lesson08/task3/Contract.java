package ru.valiev.lesson08.task3;

public class Contract {
    private static int number;
    private  static String date;
    private static String [] products;

    public Contract( int number, String date,String [] products) {
        this.number = number;
        this.date = date;
        this.products = products;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Contract.number = number;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        Contract.date = date;
    }

    public static String[] getProducts() {
        return products;
    }

    public static void setProducts(String[] products) {
        Contract.products = products;
    }
}
