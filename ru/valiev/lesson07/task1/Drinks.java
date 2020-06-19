package ru.valiev.lesson07.task1;

public enum Drinks  {
    COLA(1),
    SPRITE(3),
    JUICE(4),
    FANTA(2),
    MIRINDA(3);

    private int price;
    Drinks(int price) {
        this.price = price;

    }

    public int getPrise() {
        return price;
    }


}

