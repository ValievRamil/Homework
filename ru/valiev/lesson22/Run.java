package ru.valiev.lesson22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ru.valiev.lesson22.PersonSuperComparator.personSort;

public class Run {

        public static void main(String[] args) {
            List<Person> list = new ArrayList<>();
            list.add(new Person("Маша", 25));
            list.add(new Person("Маша", 21));
            list.add(new Person("Петя", 28));
            list.add(new Person("Петя", 20));
            for (Person person : list) {
                System.out.println(person);
            }
            System.out.println();
            personSort(list);
            for (Person person : list) {
                System.out.println(person);
            }
        }
    }

