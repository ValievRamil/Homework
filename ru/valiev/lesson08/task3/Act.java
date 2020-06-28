package ru.valiev.lesson08.task3;

public class Act {
    private int number;
    private String date;
    private String[] products;

    public Act(int number, String date, String[] products) {
        this.number = number;
        this.date = date;
        this.products = products;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }
}
