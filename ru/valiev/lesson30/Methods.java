package ru.valiev.lesson30;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Methods {

    public static String takeWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a word :");
        String word = scanner.nextLine();
        return word;
    }

    public static void analyzeWord(String word) {
        char testChar = 0;
        int count = 0;

        for (int i = 0; i <= word.length()-1 ; i++) {
            testChar = word.charAt(i);

            for (int j = 0; j < word.length() ; j++) {
                if (testChar == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {break;}
            count = 0;
        }
        if (testChar != 32) {
            System.out.println("The first not repeating character is " + testChar);
        } else
            System.out.println("The first not repeating character is  SPACE");
    }
}




