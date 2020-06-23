package ru.valiev.lesson09.task;

public class Duck extends Animal implements Runable, Swimmable, Flyable{
    @Override
    protected void getName() {
        System.out.println("I am a Duck!");
    }

    @Override
    public void fly() {
        System.out.println("Duck is Flying!");
    }

    @Override
    public void run() {
        System.out.println("Duck is Running!");

    }

    @Override
    public void swim() {
        System.out.println("Dog is Swimming!");

    }
}
