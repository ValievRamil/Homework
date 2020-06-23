package ru.valiev.lesson09.task;

public class Camel extends Animal implements Runable, Swimmable {
    @Override
    protected void getName() {
        System.out.println("I am a Camel!");
    }

    @Override
    public void run() {
        System.out.println("Camel is Running!");
    }

    @Override
    public void swim() {
        System.out.println("Camel is Swimming!");

    }
}
