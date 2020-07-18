package ru.valiev.lesson14;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import static ru.valiev.lesson14.Drinks.*;


public class VendingMachine {
    private static final Logger log = LogManager.getLogger(VendingMachine.class);

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("0. EXIT");
        System.out.println("1. " + COLA + " -    " + COLA.getPrise() + "$");
        System.out.println("2. " + Drinks.SPRITE + " -  " + SPRITE.getPrise() + "$");
        System.out.println("3. " + Drinks.JUICE + " -   " + JUICE.getPrise() + "$");
        System.out.println("4. " + Drinks.FANTA + " -   " + FANTA.getPrise() + "$");
        System.out.println("5. " + Drinks.MIRINDA + " - " + MIRINDA.getPrise() + "$");


        System.out.println("Make a doposit to select a drink!");
        int deposit = scanner.nextInt();

         while (true) {
            if (deposit < 1) {
                System.out.println("Make a deposit!!!");
                log.warn("Trying to buy without making a deposit");

                deposit = scanner.nextInt();
            } else {
                System.out.println("You input " + deposit + "$");
                log.warn("Customer paid" + deposit + "$" );
                break;
            }
        }

        System.out.println("Please, choise a drink");

        while (true) {
            int select = scanner.nextInt();
            if (select == 0) {
                System.out.println("Buy Buy!!!");
                log.warn("Buyer finished the purchase");
                break;
            }else if (select > 5 || select < 1) {
                System.out.println("Number is not correct. Please try again!");
                log.warn("Incorrect number entered");

            }else if (select == 1 & deposit >= COLA.getPrise()) {
                System.out.println("Please, take your: " + COLA);
                log.warn("Customer bought " + COLA);
                deposit = deposit - COLA.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else  if (select == 2 & deposit >= SPRITE.getPrise()) {
                System.out.println("Please, take your: " + SPRITE);
                log.warn("Customer bought " + SPRITE);
                deposit = deposit - SPRITE.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else  if (select == 3 & deposit >= JUICE.getPrise()) {
                System.out.println("Please, take your: " + JUICE);
                log.warn("Customer bought " + JUICE);
                deposit = deposit - JUICE.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else if (select == 4 & deposit >= FANTA.getPrise()) {
                System.out.println("Please, take your: " + FANTA);
                log.warn("Customer bought " + FANTA);
                deposit = deposit - FANTA.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else if (select == 5 & deposit >= MIRINDA.getPrise()) {
                System.out.println("Please, take your: " + MIRINDA);
                log.warn("Customer bought " + MIRINDA);
                deposit = deposit - MIRINDA.getPrise();
                System.out.println("Deposit =  " + deposit + "$");

            } else {
                System.out.println("Insufficient funds. Please, choice other drink or press 0 for EXIT");
                log.warn("Insufficient funds.");


            }
        }
    }
}

