//Реализовать алгоритм обратной сортировки списков компаратором.
//Пусть дан произвольный список целых чисел, удалить из него чётные числа
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//Дано два целочисленных списка, объединить их не допуская элементы второго списка уже встречающиеся в первом.
//Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
//Повторить пятый пункт но с LinkedList.
//Сравнить время работы пятого и шестого пунктов.

package org.example;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int i;
        for (i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(20));
            list2.add(new Random().nextInt(20));
        }

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("\n" + "list1: " + list1);

        for (int j = 0; j < list2.size(); j++) {
            if (list2.get(j) % 2 == 0) {
                list2.remove(j);
            }
        }
        System.out.println("list2: " + list2 + "\n");

        int mid = 0;
        for (int k = 0; k < list2.size(); k++) {
            mid += list2.get(k);
        }
        mid = mid / list2.size();

        System.out.println("list1(Min): " + Collections.min(list1));
        System.out.println("list1(Max): " + Collections.max(list1));
        System.out.println("\n" + "list2(Mid): " + mid);

        list1.addAll(list2);
        System.out.println("\n" + list2 + "\n");

        long begin = System.currentTimeMillis();
        ArrayList<Integer> arr_integers = new ArrayList<>(1);
        for (int j = 0; j < 10001; j++) {
            arr_integers.add(0,0);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - begin) + "\n");

        long begin2 = System.currentTimeMillis();
        LinkedList<Integer> lin_integers = new LinkedList<Integer>();
        for (int j = 0; j < 10001; j++) {
            lin_integers.add(0,0);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end2 - begin2));
    }
}