package ru.valiev.lesson27;

public class Task2 {
    private  int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {

        int n = 50;
        Task2 task2 = new Task2();
        for (int i = 0; i <= n; i++) {
            System.out.print(task2.fibonacci(i) + " ");

        }
    }
}


