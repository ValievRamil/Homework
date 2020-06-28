package ru.valiev.lesson09.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Camel camel = new Camel();
        camel.getName();
        camel.run();
        camel.swim();
        camel.bones = 80;
        System.out.println("There were: " + camel.BrokeBones() + " bones");

        Fish fish = new Fish();
        fish.getName();
        fish.swim();
        fish.bones = 100;
        System.out.println("There were: " + fish.BrokeBones() + " bones");

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


        System.out.print("please choice one of the animal: ");
        System.out.println("1.Camel; 2.Duck; 3.Fish");
        Animal animal = null;
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                animal = new Camel();
                break;
            case 2:
                animal = new Duck();
                break;
            case 3:
                animal = new Fish();
                break;
            default:
                System.out.println("Error!");
        }
        animal.getName();




    }


}
