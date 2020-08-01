package ru.valiev.lesson22;

import javafx.collections.transformation.SortedList;

import java.util.*;

import static ru.valiev.lesson22.PersonSuperComparator.personSort;

public class Run {

        public static void main(String[] args) {
            Set<Person> list = new TreeSet<Person>(new PersonSuperComparator());
            list.add(new Person("Маша", 25));
            list.add(new Person("Петя", 2));

            list.add(new Person("Маша", 21));
            list.add(new Person("Петя", 20));
            for (Person person : list) {
                System.out.println(person);

            }
        }
    }

