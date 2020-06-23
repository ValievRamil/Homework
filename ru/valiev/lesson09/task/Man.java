package ru.valiev.lesson09.task;

public class Man extends Human {
    @Override
    public void run() {
        System.out.println("Man is Running!");
    }

    @Override
    public void swim() {
        System.out.println("Man is Swimming!");

    }
}
