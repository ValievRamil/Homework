package ru.valiev.lesson09.task;

public class Main {

    public static void main(String[] args) {

        Camel camel = new Camel();
        camel.getName();
        camel.run();
        camel.swim();
        Fish fish = new Fish();
        fish.getName();
        fish.swim();
        Duck duck = new Duck();
        duck.getName();
        duck.fly();
        duck.run();
        duck.swim();
        Man man = new Man();
        man.run();
        man.swim();
        Woman woman = new Woman();
        woman.run();
        woman.swim();
    }
}
