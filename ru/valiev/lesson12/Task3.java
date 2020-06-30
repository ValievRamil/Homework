package ru.valiev.lesson12;

public class Task3 {
    public static void main(String[] args) throws Exception {
        String[] str = new String[2];
        str[0] = "Hello";
        str[1] = "World";

        try {
            System.out.println(str[0]);
            System.out.println(str[1]);
            System.out.println(str[2]);
        } catch (Exception e) {
            throw new Exception("EXECTION!!!");
        }

    }
}
