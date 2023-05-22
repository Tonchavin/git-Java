package org.example;

import java.util.*;

public class task6 {
    public static void main(String[] args) {
        mySet mySet = new mySet();
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        myTreeSet myTreeSet = new myTreeSet(comparator);
        mySet.myAdd(7);
        for (int i = 0; i < 5; i++) {
            mySet.myAdd(new Random().nextInt(10));
        }
        System.out.println(mySet.myContains(7));
        System.out.println(Arrays.toString(mySet.toArray()));
        Iterator<Integer> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println("\n" + mySet.getItem(3));
    }
}

class mySet {
    static final Object OBJECT = new Object();
    private LinkedHashMap<Integer, Object> myMap = new LinkedHashMap<>();

    public boolean myAdd(int num) {
        return myMap.put(num, OBJECT) == null;
    }

    public boolean myContains(int num) {
        return myMap.containsKey(num);
    }

    public Object[] toArray() {
        return myMap.keySet().toArray();
    }

    public Iterator<Integer> iterator() {
        return myMap.keySet().iterator();
    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }

}

class myTreeSet {
    private Comparator<Integer> comparator;


    public myTreeSet(Comparator<Integer> comp) {
        comparator = comp;
    }

    private TreeMap<Integer, Object> treeMap = new TreeMap<>(comparator);

    static final Object OBJECT = new Object();
//    private TreeMap<Integer, Object> treeMap = new TreeMap<>(comparator);

    public boolean myAdd(int num) {
        return treeMap.put(num, OBJECT) == null;
    }

    public boolean myContains(int num) {
        return treeMap.containsKey(num);
    }

    public Object[] toArray() {
        return treeMap.keySet().toArray();
    }

    public Iterator<Integer> iterator() {
        return treeMap.keySet().iterator();
    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }

}