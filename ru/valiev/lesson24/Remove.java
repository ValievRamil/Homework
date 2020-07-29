package ru.valiev.lesson24;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove {
    public static ArrayList<String> removeEvenLength(ArrayList<String> set) {
        ArrayList<String> list = new ArrayList<>();
        for (String element : set) {
            if (element.length() % 2 == 0) {
                list.add(element);
            }
        }
        return list;
    }

}

