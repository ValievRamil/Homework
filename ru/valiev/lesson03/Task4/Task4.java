package ru.valiev.lesson03.Task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Угадайте загаданное  число в диапозоне от 1 до 100!!!");
        int random_number = 1 + (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        int t = 10;
        for (int i = 0; i < 10; i++) {
            t = t--;
            System.out.println("У Вас осталось " + t-- + " попыток!!!");
            int x = scanner.nextInt();

            if (x == random_number) {
                System.out.println("Ураааа! Вы угадали!!!");
                break;
            }else if (x < random_number) {
                    if (x <= random_number - 5) {
                        System.out.println("Холодно!!!");
                    } else {
                        System.out.println("Горячо");
                     }
                }else if (x > random_number) {
                    if (x <= random_number + 5) {
                        System.out.println("Горячо");
                    } else {
                        System.out.println("Холодно");
                    }

                }

            }

        }
    }

