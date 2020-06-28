package ru.valiev.lesson09.task;

public abstract class Animal {

    public int bones;

    protected abstract void getName ();

    public int   BrokeBones() {
        return bones = bones - 20;
    }
}
