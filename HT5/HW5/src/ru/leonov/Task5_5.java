package ru.leonov;

import ru.leonov.utils.ArrayHelper;
import ru.leonov.utils.NanoTimeHelper;

import java.util.Arrays;

public class Task5_5 {

    // Задание 5.5
    // Реализуйте алгоритм двоичного рекурсивного поиска на основе массива из задания 2.1.
    // Оцените алгоритм двоичного рекурсивного поиска с помощью базового метода System.nanoTime()
    // и сравните с обычным двоичным поиском.
    public static void Task() {
        int[] array = ArrayHelper.createArray(25);
        System.out.println(Arrays.toString(array));

        int value = array[15];

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //Поиск циклом
        cycleBinarySearch(value, array);
        // Поиск рекурсией
        recursiveBinarySearch(value, array);
    }

    private static void cycleBinarySearch(int lookingItem, int[] array) {
        NanoTimeHelper.start();
        int index = ArrayHelper.cycleBinarySearch(lookingItem, array);
        NanoTimeHelper.printTime(String.format("Циклический бинарный поиск. Index of %d is %d.", lookingItem, index));
    }

    private static void recursiveBinarySearch(int lookingItem, int[] array) {
        NanoTimeHelper.start();
        int index = ArrayHelper.RecursiveBinarySearch(lookingItem, array);
        NanoTimeHelper.printTime(String.format("Рекурсивный бинарный поиск. Index of %d is %d. ", lookingItem, index));
    }

}