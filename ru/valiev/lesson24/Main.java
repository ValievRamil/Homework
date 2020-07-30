package ru.valiev.lesson24;

import java.util.*;

import static ru.valiev.lesson24.Remove.removeEvenLength;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("foo");
        alist.add("buzz");
        alist.add("bar");
        alist.add("fork");
        alist.add("bort");
        alist.add("spoon");
        alist.add("!");
        alist.add("dude");

        List list = removeEvenLength(alist);
        for (Object lst : list) {
            System.out.println(lst);
        }
    }
}
 

