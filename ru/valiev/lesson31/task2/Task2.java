package ru.valiev.lesson31.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static ru.valiev.lesson31.task1.isPalindrome.isPalindrome;

public class Task2 {
    public boolean isPalindrome(String text) {
        StringBuffer stringBuffer = new StringBuffer(text);
        return stringBuffer.reverse().toString().equals(text);
    }
    public void run (String s) {
        if(isPalindrome(s)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Task2 task2 = new Task2();
        task2.run(str);
    }


}
