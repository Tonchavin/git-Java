package org.example;

import java.io.*;

import java.util.*;

public class task4 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list_first_name = new ArrayList<>();
        ArrayList<String> list_last_name = new ArrayList<>();
        ArrayList<String> list_father_name = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        ArrayList<String> list_gender = new ArrayList<>();
        ArrayList<Integer> list_index = new ArrayList<>();
        String in = scan.nextLine();
        int id = 0;

        while (!in.equals("q")) {
            System.out.println(in);

            String[] st = new String[5];
            st = in.split(" ");
            list1.add(in);
            list_first_name.add(st[0]);
            list_last_name.add(st[1]);
            list_father_name.add(st[2]);
            list_age.add(Integer.parseInt(st[3]));
            list_gender.add(st[4]);
            list_index.add(id);
            in = scan.nextLine();
            id++;
        }
        System.out.println(list_first_name);
        System.out.println(list_last_name);
        System.out.println(list_father_name);
        System.out.println(list_age);
        System.out.println(list_gender);
        System.out.println(list_index);
        System.out.println();

        for (int i = 0; i < list_age.size(); i++) {
            for (int j = 0; j < list_age.size() - 1; j++) {
                if (list_age.get(j) > list_age.get(j + 1)) {
                    int tmp = list_index.get(j);
                    list_index.set(j, list_index.get(j + 1));
                    list_index.set(j + 1, tmp);

                    tmp = list_age.get(j);
                    list_age.set(j, list_age.get(j + 1));
                    list_age.set(j + 1, tmp);
                }
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list_last_name.get(i) + " " + list_first_name.get(i).toUpperCase().charAt(0) + "." +
                    list_father_name.get(i).toUpperCase().charAt(0) + "." + " " + list_age.get(i) +
                    " " + list_gender.get(i));
        }
    }
}











//    public static void main(String[] args) {
//
//        ArrayList<String> list_book = new ArrayList<>();
//        ArrayList<String> list_first_name = new ArrayList<>();
//        ArrayList<String> list_last_name = new ArrayList<>();
//        ArrayList<String> list_father_name = new ArrayList<>();
//        ArrayList<String> list_age = new ArrayList<>();
//        ArrayList<String> list_gender = new ArrayList<>();
//        ArrayList<String> list_index = new ArrayList<>();
//
//        String fileName = "text";
//
//        try {
//            Scanner sc = new Scanner(new File(fileName));
//            while (sc.hasNextLine()) {
//                list_book.add(sc.nextLine());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < list_book.size(); i++) {
//            String[] temp = new String[5];
//            temp = list_book.get(i).split(" ");
//            list_first_name.add(temp[0]);
//            list_last_name.add(temp[1]);
//            list_father_name.add(temp[2]);
//            list_age.add(temp[3]);
//            list_gender.add(temp[4]);
//
//            System.out.println(list_last_name.get(i) + " " + list_first_name.get(i).toUpperCase().charAt(0) + "." +
//                    list_father_name.get(i).toUpperCase().charAt(0) + "." + " " + list_age.get(i) +
//                    " " + list_gender.get(i));
//        }
//        System.out.println(list_book);
//    }