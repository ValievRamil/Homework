package ru.valiev.lesson09.task;

public class Fish extends Animal implements Swimmable{
    @Override
    protected void getName() {
        System.out.println("I am a Fish!");
    }

    @Override
    public void swim() {
        System.out.println("Fish is Swimming!");
    }
}
