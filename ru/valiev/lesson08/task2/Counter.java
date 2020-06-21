package ru.valiev.lesson08.task2;

public class Counter {
    private static int ObjectCounter = 0;

    private static int getObjectCounter () {
    return ObjectCounter;
    }

    private  static void createObject () {
        ObjectCounter++;
    }

    public Counter () {
        Counter.createObject();
    }

    public static void main(String[] args) {
        System.out.println("When we start we have " + getObjectCounter() + " objects!");

        for (int i = 0; i < 25 ; i++) {
            new Counter();
        }
        System.out.println("Now We heve " + getObjectCounter() + " objects!");
        }
    }


