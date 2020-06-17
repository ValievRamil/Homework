package ru.valiev.lesson03.Task4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        String STOP = "СТОП";
        System.out.println("Программа загадала  число в диапозоне от 1 до 100!!!");
        System.out.println("Угадайте число!");
        System.out.println("Для выхода из игры наберите код \" 777 \"");
        int random = 1 + (int) (Math.random() * 100);
        System.out.println(random);
        Scanner scanner = new Scanner(System.in);

        int t = 0;

    while (true) {
        int a = scanner.nextInt();

        if (a == random){
            System.out.println("Угадал!");
            break;
        }else if (a >= t & a != random & a !=777 ) {
            t = a;
            System.out.println("Горячо!");
        } else  if (a < t ) {
            System.out.println("Холодно!");
        }else if (a == 777) {
            System.out.println("Вы прервали игру!");
            break;
            }
        }
    }
}



