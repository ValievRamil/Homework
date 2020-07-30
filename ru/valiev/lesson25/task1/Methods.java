package ru.valiev.lesson25.task1;

import java.util.*;

public class Methods {
    public void isUnique(Map<Integer, String> map) {
        List<String> list = new ArrayList<>(map.values());
        int hashMapIterator = 0;
        String val;
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            int arrayListIterator = 0;
            hashMapIterator++;
            Map.Entry mEntry = (Map.Entry) iter.next();
            val = mEntry.getValue().toString();
            for (String lst: list) {
                arrayListIterator++;
                if (val.equals(lst) && hashMapIterator != arrayListIterator) {
                    System.out.println("Есть повторения");
                    return;
                }
            }
        }
        System.out.println("Повторений нет");
    }
}

