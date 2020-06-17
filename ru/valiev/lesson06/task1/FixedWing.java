package ru.valiev.lesson06.task1;

public class FixedWing extends Aviation implements Flyable {

    public FixedWing(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void fly() {
        System.out.println("Я лечу: ЖЖЖЖЖЖЖЖЖЖ");
    }
}
