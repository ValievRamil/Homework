package ru.valiev.lesson25.task1;

import java.util.*;

public class Test {
    public static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put(1, "Борис");
        map.put(2, "Петя");
        map.put(3, "Вася");
        map.put(4, "Женя");
        map.put(5, "Маша");
        map.put(6, "Маша");

        Test test = new Test();
        test.run();
    }

    public void run () {
        Methods methods = new Methods();
        methods.isUnique(map);


    }
}
