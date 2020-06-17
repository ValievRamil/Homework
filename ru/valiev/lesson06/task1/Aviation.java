package ru.valiev.lesson06.task1;

public class Aviation  {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

     Aviation(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public static void main(String[] args) {
        Rotorcraft helicopter = new Rotorcraft("Ansat",275,2010);
        helicopter.fly();
        FixedWing airplan = new FixedWing("An-12",850,1980);
        airplan.fly();
    }
}