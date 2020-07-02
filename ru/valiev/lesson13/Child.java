package ru.valiev.lesson13;

import java.util.Scanner;

public class Child {
     static Food food;

    public void choiceFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Child wanna eat! Please,select and write a food name from this Menu: ");
        System.out.println(Food.APPLE);
        System.out.println(Food.CARROT);
        System.out.println(Food.APRICOT);
        System.out.println(Food.PORRIDGE);
        String str = scanner.nextLine();
        while (true) {
            if (str.equalsIgnoreCase(String.valueOf(Food.APPLE))) {
                food = Food.APPLE;
                break;
            } else if (str.equalsIgnoreCase(String.valueOf(Food.APRICOT))) {
                food = Food.APRICOT;
                break;
            } else if (str.equalsIgnoreCase(String.valueOf(Food.CARROT))) {
                food = Food.CARROT;
                break;
            } else if (str.equalsIgnoreCase(String.valueOf(Food.PORRIDGE))) {
                food = Food.PORRIDGE;
                break;
            }
        }
    }
    public void eat(Food food) {
        try {
            if (food == Food.APPLE | food == Food.APRICOT) {
                System.out.println("Child ate with pleasure!");
            } else throw new Exception();
        } catch (Exception e) {
            System.out.println("Baby spat out!");
        } finally {
            System.out.println("Child says: Thank you, Ma!");
        }
    }
}
