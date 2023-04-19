//Написать метод принимающий строку, ищущий в ней основание и степень
// После этого расчитывающий результат и выводящий в консоль в консоль строку параметра + ответ.
// Пример строки: "Основание -12б степень 7, результат". Попробовать с разными входящими строками.
//Сравнить скорость работы реплейса классов String и StringBuilder.

package org.example;

//import java.util.Arrays;

import java.lang.String;

public class task2 {
    public static void main(String[] args) {
        String str_1 = "Основание -12б степень 7, результат";
        String str_word = "Самолет построим сами, Понесемся над лесами, Понесемся над лесами, А потом вернемся к маме.";
        find_string(str_1);
        rep_string(str_word);
        str_builder(str_word);
    }

    public static void find_string(String str_1) {
        String[] str_2 = str_1.split(",|\\s");
        int base = 0;
        int power = 0;
        for (String s : str_2) {
            for (int i = 0; i < str_2.length; i++) {
                try {
                    Integer.parseInt(str_2[i]);
                    if (base == 0) {
                        base = Integer.parseInt(str_2[i]);
                    } else {
                        power = Integer.parseInt(str_2[i]);
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
        System.out.println(str_1 + ":" + (int) Math.round(Math.pow(base, power)));
    }

    public static void rep_string(String str_word) {
        long begin = System.currentTimeMillis();
        String find_word = "лесами";
        String new_word = str_word.replace(find_word, "полями");
        System.out.println(new_word);
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - begin));
    }

    public static void str_builder(String str_word) {
        long begin = System.currentTimeMillis();
        String find_word = "лесами";
        StringBuilder sb = new StringBuilder(str_word);
        while (sb.indexOf(find_word) > 0) {
            sb.replace(sb.indexOf(find_word), sb.indexOf(find_word) + find_word.length(), "полями");
        }
        System.out.println(sb);
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - begin));
    }
}