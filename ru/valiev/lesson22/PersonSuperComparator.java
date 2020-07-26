package ru.valiev.lesson22;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSuperComparator{
    public static void personSort(List<Person> persons) {
        persons.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
    }
}
