package ru.valiev.lesson22;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSuperComparator implements  Comparator <Person> {
    public static void personSort(List<Person> persons) {
        persons.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
    }

    @Override
    public int compare(Person o1, Person o2) {
        // return Comparator.comparing(o1.getName(),o2.getName()
         int result = o1.getName().compareTo(o2.getName());
         if (result == 0) {
             result = Integer.compare(o1.getAge(),o2.getAge());
         }
         return result;
    }
}

