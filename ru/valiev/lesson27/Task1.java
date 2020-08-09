package ru.valiev.lesson27;

import java.util.Scanner;

public class Task1 {
    public void fibanacci(int n) {
        int t0 = 0;
        int t1 = 1;
        int t2;
        System.out.print(t0+" "+t1+" ");
        for(int i = 3; i <= n; i++){
            t2=t0+t1;
            System.out.print(t2+" ");
            t0=t1;
            t1=t2;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.fibanacci(20);
    }
}

