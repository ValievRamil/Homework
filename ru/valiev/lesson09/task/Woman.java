package ru.valiev.lesson09.task;

public class Woman extends Human {
    @Override
    public void run() {
        System.out.println("Woman is Running!");
    }

    @Override
    public void swim() {
        System.out.println("Woman is Swimming!");

    }
}
