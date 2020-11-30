package ru.leonov.utils;

import java.util.Random;

public class ArrayHelper {

    public static int[] createArray(int arrCount) {
        int[] arr = new int[arrCount];
        Random rnd = new Random();
        for (int i = 0; i < arrCount; i++) {
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }

    public static int cycleBinarySearch(int lookingItem, int[] array) {
        int left = 0;
        int right = array.length - 1;
        int half = (left + right) / 2;

        while (array[half] != lookingItem && left <= right) {
            if (array[half] > lookingItem) right = half - 1;
            else left = half + 1;

            half = (left + right) / 2;
        }

        return left <= right ? half : -1;
    }

    public static int RecursiveBinarySearch(int lookingItem, int[] array) {
        int left = 0;
        int right = array.length - 1;

        return recursiveSearch(lookingItem, left, right, array);
    }

    private static int recursiveSearch(int lookingItem, int left, int right, int[] array) {
        if (left > right) return -1;

        int half = (left + right) / 2;

        if (array[half] > lookingItem) return recursiveSearch(lookingItem, left, half - 1, array);
        else if (array[half] < lookingItem) return recursiveSearch(lookingItem, half + 1, right, array);
        else return half;
    }

    public static int[] mergeSort(int[] array) {
        if (array == null) return null;
        if (array.length < 2) return array;

        int[] leftArray = new int[array.length / 2];
        System.arraycopy(array, 0, leftArray, 0, array.length / 2);

        int rightArrayLength = array.length - array.length / 2;
        int[] rightArray = new int[rightArrayLength];
        System.arraycopy(array, array.length / 2, rightArray, 0, rightArrayLength);

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        return mergeArray(leftArray, rightArray);
    }

    private static int[] mergeArray(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        int pos1 = 0, pos2 = 0;

        for (int i = 0; i < array.length; i++) {
            // Если массив 1 закончился - добиваем второй массив
            if (pos1 == array1.length) array[i] = array2[pos2++];
            // Если массив 2 закончился - добиваем первым массивом
            else if (pos2 == array2.length) array[i] = array1[pos1++];
            // Сравниваем элементы 2х массивов с их индексами
            else if (array1[pos1] < array2[pos2]) array[i] = array1[pos1++];
            else array[i] = array2[pos2++];
        }

        return array;
    }
}