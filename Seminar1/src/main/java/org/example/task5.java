package org.example;

import java.util.HashMap;
import java.util.Iterator;

public class task5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Пять", "Five");
        map.put("Два", "Two");
        map.put("Один", "One");
        map.put("Три", "Three");
        map.put("Шесть", "Six");
        map.put("Четыре", "Four");
        System.out.println(map);

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Десять", "Ten");
        map2.put("Два", "Two");
        map2.put("Один", "One");
        map2.put("Три", "Three");
        map2.put("Шесть", "Six");
        map2.put("Девять", "Nine");
        System.out.println(map2 + "\n");

        for (String key : map.keySet()) {
            map.compute(key, (k, v) -> v + "!");
        }
        System.out.println(map + "\n");

        map.forEach((key, value) -> map2.merge(key, value, String::concat));
        System.out.println(map2);
    }
}
