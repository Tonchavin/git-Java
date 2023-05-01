//package org.example;
//
//import java.util.*;
//
//public class taskExemple_list {
//    public static void main(String[] args) {
//
////        HashMap<String, String> map = new HashMap<>();
////        map.put("Пять", "Five");
////        map.put("Два", "Two");
////        map.put("Один", "One");
////
////        String str = map.get("Пять");
////
////        map.remove("Пять");
////        map.remove("Пять", "Five");
////
////        map.put("Пять", "Five");
////
////        map.replace("Пять", "5");
////        map.replace("Пять", "Five", "5");
////
////        map.getOrDefault("Шесть", "0");
////
////        map.containsKey("Шесть");
////        map.containsValue("5");
////
////        map.putIfAbsent("Шесть", "6");
////
////        //k-key,v-value
////        map.forEach((k, v) -> System.out.println(k + " " + v));
////
////        map.compute("Шесть", (k, v) -> v + "!");
////        map.computeIfPresent("Шесть", (k, v) -> v + "!?");
////        map.computeIfAbsent("Шесть", v -> v + "!?");
////
////        //добавляет ко всем значения знак !
////        for (String key : map.keySet()) {
////            map.compute(key, (k, v) -> v + "!");
////            ;
////        }
////
////        map.merge("Один", "7", String::concat);
////
////        //помнит последовательность ввода данных LinkedHashMap
////        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
////        hashMap.put("Пять", "Five");
////        hashMap.put("Два", "Two");
////        hashMap.put("Один", "One");
//
//        //отсортировал по ключу
//        TreeMap<String, String> treeMap = new TreeMap<>();
//        treeMap.put("Пять", "Five");
//        treeMap.put("Два", "Two");
//        treeMap.put("Один", "One");
//        System.out.println(treeMap);
//
//        //Итерация по ключам с помощью foreach, изменить значение нельзя
////        for (String key : map.keySet()) {
////            System.out.println(map.get(key));
////        }
////        //метод с помощью итератора(Iterator), изменить значение нельзя
////        Iterator<String> iterator = map.keySet().iterator();
////        while (iterator.hasNext()) {
////            String key = iterator.next();
////            System.out.println(map.get(key));
////        }
////        //Итерация через for, изменить значение можно
////        Set keys = map.keySet();
////        for (int i = 0; i < keys.size(); i++) {
////            System.out.println(map.get(keys.toArray()[i]));
////        }
//
//
////        ArrayList<String> list = new ArrayList<>();
////        list.add("One");
////        list.add("Два");
////        list.add(1, "Три");
////        list.remove(1);
////        String a = list.get(0);
////
////        ArrayList<Integer> list2 = new ArrayList<>();
////        ArrayList<Integer> list3 = new ArrayList<>();
////        for (int i = 0; i < 10; i++) {
////            list2.add(new Random().nextInt(25));
////            list3.add(new Random().nextInt(20));
////        }
////
////        System.out.println(list2);
////        System.out.println(list3);
////        System.out.println("-".repeat(70));
////        list2.addAll(list3);
////        System.out.println(list2);
////        System.out.println("-".repeat(70));
////        list2.removeAll(list3);
////        System.out.println(list2);
////        list2.retainAll(list3);
////        System.out.println(list2);
////        if (list2.contains(10)) {
////            System.out.println(true);
////        } else {
////            System.out.println(false);
////        }
////        System.out.println(list2);
////        list2.sort(new Comparator<Integer>() {
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                if (o1 % 2 != 0) return 1;
////                if (o2 % 2 != 0) return 0;
////                return -1;
////            }
////        });
////        System.out.println(list2);
////
////        LinkedList<Integer> integers = new LinkedList<>();
////
////        System.out.println(Arrays.toString(new int[]{3, 4, 5})); //печать массива
//
////        for (int i = 0; i < list2.size(); i++) {
////            System.out.println(list2.get(i));
////        }
////
////        for (int n : list2) {
////            System.out.println(n);
////        }
//
////        list2.forEach(n -> System.out.print(n + " "));
////        System.out.print("\n");
////        Iterator<Integer> iterator = list2.iterator(); // выводит список,и удаляет данные в месте с итератором
////        while (iterator.hasNext()) {
////            int n = iterator.next();
////            System.out.print(n + " ");
////            iterator.remove();
////        }
////        System.out.println("\n" + list2);
//
////        ListIterator<Integer> iterator = list2.listIterator(list2.size());
////        while (iterator.hasPrevious()) {
////            int n = iterator.previous();
////            System.out.print(n + " ");
////            iterator.remove();
////        }
////        System.out.println("\n" + list2);
//
////        ArrayList<String> list3 = new ArrayList<>();
//    }
//}
