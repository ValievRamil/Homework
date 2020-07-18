package ru.valiev.lesson19;


import java.nio.file.Paths;

public class Check {
    public static void main(String[] args)  {
        Check check = new Check();
        check.run();

    }
    public void run () {
        Processing.readFile(Paths.get("D:\\products.txt"));

    }
}