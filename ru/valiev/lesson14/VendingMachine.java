package ru.valiev.lesson14;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import static ru.valiev.lesson14.Drinks.*;


public class VendingMachine {
    private static final Logger log = LogManager.getLogger(VendingMachine.class);

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
       log.info("MENU:");
       log.info("0. EXIT");
       log.info("1. " + COLA + " -    " + COLA.getPrise() + "$");
       log.info("2. " + Drinks.SPRITE + " -  " + SPRITE.getPrise() + "$");
       log.info("3. " + Drinks.JUICE + " -   " + JUICE.getPrise() + "$");
       log.info("4. " + Drinks.FANTA + " -   " + FANTA.getPrise() + "$");
       log.info("5. " + Drinks.MIRINDA + " - " + MIRINDA.getPrise() + "$");


        log.info("Make a doposit to select a drink!");
        int deposit = scanner.nextInt();
        log.warn(deposit);
         while (true) {
            if (deposit < 1) {
                log.info("Make a deposit!!!");
                deposit = scanner.nextInt();
            } else {
                log.info("You input " + deposit + "$");
                break;
            }
        }

        log.info("Please, choise a drink");

        while (true) {
            int select = scanner.nextInt();
            if (select == 0) {
                log.info("Buy Buy!!!");
                break;
            }else if (select > 5 || select < 1) {
                log.warn("Number is not correct. Please try again!");

            }else if (select == 1 & deposit >= COLA.getPrise()) {
                log.info("Please, take your: " + COLA);
                deposit = deposit - COLA.getPrise();
                log.info("Deposit =  " + deposit + "$");

            } else  if (select == 2 & deposit >= SPRITE.getPrise()) {
                log.info("Please, take your: " + SPRITE);
                deposit = deposit - SPRITE.getPrise();
                log.info("Deposit =  " + deposit + "$");

            } else  if (select == 3 & deposit >= JUICE.getPrise()) {
                log.info("Please, take your: " + JUICE);
                deposit = deposit - JUICE.getPrise();
                log.info("Deposit =  " + deposit + "$");

            } else if (select == 4 & deposit >= FANTA.getPrise()) {
                log.info("Please, take your: " + FANTA);
                deposit = deposit - FANTA.getPrise();
                log.info("Deposit =  " + deposit + "$");

            } else if (select == 5 & deposit >= MIRINDA.getPrise()) {
                log.info("Please, take your: " + MIRINDA);
                deposit = deposit - MIRINDA.getPrise();
                log.info("Deposit =  " + deposit + "$");

            } else {
                log.warn("Insufficient funds. Please, choice other drink or press 0 for EXIT");


            }
        }
    }
}

