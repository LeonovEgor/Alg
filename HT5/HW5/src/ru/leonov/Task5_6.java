package ru.leonov;

import ru.leonov.utils.ArrayHelper;
import ru.leonov.utils.NanoTimeHelper;

import java.util.Arrays;

public class Task5_6 {

    // Задание 5.6
    // На основе массива из задания 2.1 реализуйте алгоритм сортировки слиянием.
    // Оцените алгоритм сортировки слиянием с помощью базового метода System.nanoTime() и
    // сравните с сортировкой методом sort().
    public static void Task() {
        int[] array = ArrayHelper.createArray(25);
        System.out.println(Arrays.toString(array));

        // Поиск рекурсией
        int[] sortedArray = mergeSort(array);
        System.out.println(Arrays.toString(sortedArray));

        systemSort(array);
    }

    private static int[] mergeSort(int[] array) {
        NanoTimeHelper.start();
        int[] sortedArray = ArrayHelper.mergeSort(array);
        NanoTimeHelper.printTime("Сортировка методом слияния.");

        return sortedArray;
    }

    private static void systemSort(int[] array) {
        NanoTimeHelper.start();
        Arrays.sort(array);
        NanoTimeHelper.printTime("Сортировка системным Arrays.sort.");
    }

}