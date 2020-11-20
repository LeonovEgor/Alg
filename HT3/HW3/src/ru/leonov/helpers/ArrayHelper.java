package ru.leonov.helpers;

import java.util.Random;

public class ArrayHelper {

    public static int[] createIntArray(int arrCount) {
        int[] arr = new int[arrCount];
        Random rnd = new Random();
        for (int i = 0; i < arrCount; i++) {
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }

    public static Integer[] createIntegerArray(int arrCount) {
        Integer[] arr = new Integer[arrCount];
        Random rnd = new Random();
        for (int i = 0; i < arrCount; i++) {
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }
}