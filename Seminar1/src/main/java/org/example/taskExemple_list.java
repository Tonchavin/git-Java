package org.example;

import java.util.*;

public class taskExemple_list {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Два");
        list.add(1, "Три");
        list.remove(1);
        String a = list.get(0);

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(new Random().nextInt(25));
            list3.add(new Random().nextInt(20));
        }

        System.out.println(list2);
        System.out.println(list3);
        System.out.println("-".repeat(70));
//        list2.addAll(list3);
//        System.out.println(list2);
//        System.out.println("-".repeat(70));
//        list2.removeAll(list3);
//        System.out.println(list2);
//        list2.retainAll(list3);
//        System.out.println(list2);
        if (list2.contains(10)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(list2);
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 != 0) return 1;
                if (o2 % 2 != 0) return 0;
                return -1;
            }
        });
        System.out.println(list2);

        LinkedList<Integer> integers = new LinkedList<>();

        System.out.println(Arrays.toString(new int[]{3, 4, 5})); //печать массива

//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i));
//        }
//
//        for (int n : list2) {
//            System.out.println(n);
//        }

//        list2.forEach(n -> System.out.print(n + " "));
//        System.out.print("\n");
//        Iterator<Integer> iterator = list2.iterator(); // выводит список,и удаляет данные в месте с итератором
//        while (iterator.hasNext()) {
//            int n = iterator.next();
//            System.out.print(n + " ");
//            iterator.remove();
//        }
//        System.out.println("\n" + list2);

//        ListIterator<Integer> iterator = list2.listIterator(list2.size());
//        while (iterator.hasPrevious()) {
//            int n = iterator.previous();
//            System.out.print(n + " ");
//            iterator.remove();
//        }
//        System.out.println("\n" + list2);

//        ArrayList<String> list3 = new ArrayList<>();
    }
}
