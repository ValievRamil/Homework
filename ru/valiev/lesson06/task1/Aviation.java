package ru.valiev.lesson06.task1;

import java.util.Scanner;

public class Aviation  {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    protected Aviation(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public static void main(String[] args) {

        //Flyable craft1 = getCraft();
        //craft1.fly();
        //Flyable craft2 = getCraft();
        //craft2.fly();
        Flyable craft3 = getCraft();
        craft3.fly();
        if (craft3 instanceof Rotorcraft) {
            Rotorcraft rotorcraft = (Rotorcraft)craft3;
            rotorcraft.autorotation();
        } else if(craft3 instanceof FixedWing) {
            FixedWing fixedWing = (FixedWing) craft3;
            fixedWing.katapult();
        }

    }

    private static Flyable getCraft () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите летательное средство 1. самолет  2 . Вертолет");
         int number = scanner.nextInt();
         if (number == 1) {
             return new FixedWing("An-12",850,1980);
         }else if (number == 2) {
             return new Rotorcraft("Ansat",275,2010);
         } else {
             return null;
         }
    }
}
