/**
 * Первый семинар.
 * 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
 * <p>
 * Пункты реализовать в методе main
 * Пункты реализовать в разных методах
 * <p>
 * int i = new Random().nextInt(k); //это кидалка случайных чисел!)
 */

package org.example;

import java.util.Random;
import java.lang.String;
import java.lang.Short;

public class task1 {

    public static void main(String[] args) {
        int i = methodRandom();
        int n = high_bit_line(i);
        int[] m1 = multiplicity(i, n);
        int[] m2 = multiplicity2(i, n);
        System.out.println("Случайное число от 0 до 2000: ");
        System.out.println(i);
        System.out.println("номер старшего значащего бита выпавшего числа: ");
        System.out.println(n);
        System.out.println("все кратные n числа в диапазоне от i до Short.MAX_VALUE,массив m1: ");
        for (int v : m1) System.out.println(v);
        System.out.println("все некратные n числа в диапазоне от Short.MIN_VALUE до i, массив m2: ");
        for (int v2 : m2) System.out.println(v2);
    }

    public static int methodRandom() {
        return new Random().nextInt(0, 2000);
    }

    public static int high_bit_line(int i) {
        int res = 0;
        while (i != 1) {
            i >>= 1;
            res++;
        }
        return res;
    }

    public static int[] multiplicity(int i, int n) {
        int[] m = new int[Short.MAX_VALUE];
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m[j] = j;
            }
        }
        return m;
    }

    public static int[] multiplicity2(int i, int n) {
        int[] m3 = new int[Short.MAX_VALUE];
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n == 1) {
                m3[j] = j;
            }
        }
        return m3;
    }
}

