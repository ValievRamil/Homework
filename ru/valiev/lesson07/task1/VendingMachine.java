package ru.valiev.lesson07.task1;

import java.util.Scanner;

import static ru.valiev.lesson07.task1.Drinks.*;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU:");
        System.out.println("0. EXIT");
        System.out.println("1. " + Drinks.COLA + " -    " + COLA.getPrise() + "$");
        System.out.println("2. " + Drinks.SPRITE + " -  " + SPRITE.getPrise() + "$");
        System.out.println("3. " + Drinks.JUICE + " -   " + JUICE.getPrise() + "$");
        System.out.println("4. " + Drinks.FANTA + " -   " + FANTA.getPrise() + "$");
        System.out.println("5. " + Drinks.MIRINDA + " - " + MIRINDA.getPrise() + "$");


        System.out.println("Make a doposit to select a drink!");
        int deposit = scanner.nextInt();
        while (true) {
            if (deposit < 1) {
                System.out.println("Make a deposit!!!");
                deposit = scanner.nextInt();
            } else {
                System.out.println("You input " + deposit + "$");
                break;
            }
        }

        System.out.println("Please, choise a drink");

        while (true) {
            int select = scanner.nextInt();
            if (select == 0) {
                System.out.println("Buy Buy!!!");
                break;
            }else if (select > 5 || select < 1) {
                System.out.println("Number is not correct. Please try again!");

            }else if (select == 1 & deposit >= COLA.getPrise()) {
                System.out.println("Please, take your: " + COLA);
                deposit = deposit - COLA.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else  if (select == 2 & deposit >= SPRITE.getPrise()) {
                System.out.println("Please, take your: " + SPRITE);
                deposit = deposit - SPRITE.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else  if (select == 3 & deposit >= JUICE.getPrise()) {
                System.out.println("Please, take your: " + JUICE);
                deposit = deposit - JUICE.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else if (select == 4 & deposit >= FANTA.getPrise()) {
                System.out.println("Please, take your: " + FANTA);
                deposit = deposit - FANTA.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else if (select == 5 & deposit >= MIRINDA.getPrise()) {
                System.out.println("Please, take your: " + MIRINDA);
                deposit = deposit - MIRINDA.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else {
                System.out.println("Insufficient funds. Please, choice other drink or press 0 for EXIT");


            }
        }
    }
}








