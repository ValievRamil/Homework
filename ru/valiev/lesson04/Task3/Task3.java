package ru.valiev.lesson04.Task3;

// программа для вывода на экран таблицы умножения.
public class Task3 {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 10) {
            while (b <= 10) {
                System.out.printf("%4d", a * b);
                b++;
            }
            System.out.println();
            b = 1;
            a++;
        }
    }
}
