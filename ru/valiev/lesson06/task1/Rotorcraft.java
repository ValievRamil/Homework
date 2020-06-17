package ru.valiev.lesson06.task1;



public class Rotorcraft extends Aviation implements Flyable {

    public Rotorcraft(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void fly() {
        System.out.println("Вертолет  " +getModel() + " " + getYearOfManufacture() + " года выпуска взлетел!");
    }

}
