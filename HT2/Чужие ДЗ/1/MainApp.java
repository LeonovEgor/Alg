package ru.geekbrains;

import java.util.Arrays;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        /*
         * Задание 2.1
         * На основе программного кода из домашнего задания №1 реализуйте массив
         * на основе существующих примитивных или ссылочных типов данных.
         * Выполните обращение к массиву и базовые операции класса Arrays.
         * Оценить выполненные методы с помощью базового класса System.nanoTime().
         */

        // Массив примитивных элементов
        int[] studentsCount = {1200, 800, 2000};

        // Массив переменных ссылочного типа:
        String[] schoolName = {"School №5", "School №33", "School №12"};

        // Массив переменных своего класса:
        Students[] studentsArr = new Students[2];
        studentsArr[0] = new Students("Ivan Ivanov", 12);
        studentsArr[1] = new Students("Petr Petrov", 14);

        // Выполним обращение к массиву и операцию класса Arrays
        studentsArr[1].getAge();
        System.out.println(Arrays.toString(studentsCount));


        /*
         * Задание 2.2
         * На основе написанного кода в задании 2.1 реализуйте линейный и двоичный поиск.
         * Оценить алгоритмы линейного и двоичного поиска с помощью базового класса System.nanoTime(),
         * при необходимости расширьте уже существующий массив данных.
         */

        // Не будем использовать код из 2.1. Создадим новый массив и заполним его рандомными значениями
        int[] array = new int[10];
        fillArrayWithRandom(array);

        // Надём максимальное значение, используя линейный поиск
        System.out.println(maxArrayElementLine(array));

        // Найдём индекс часла (например 8), используя двоичный поиск (предварительно отсортировав массив)
        Arrays.sort(array);
        System.out.println(elementIndexBinSearch(array, 8));


        /*
         * Задание 2.3
         * Создайте массив размером 400 элементов.
         * Выполните сортировку с помощью метода sort().
         * Оцените сортировку с помощью базового класса System.nanoTime().
         */

        int[] array2 = new int[400];
        fillArrayWithRandom(array2);
        long startNanoTime = System.nanoTime();
        Arrays.sort(array2);
        System.out.println("Сортировка длилась " + (System.nanoTime() - startNanoTime) + " наносекунд");


        /*
         * Задание 2.4
         * На основе существующего массива данных из задания 2.3 реализуйте алгоритм сортировки пузырьком.
         * Оцените сортировку с помощью базового класса System.nanoTime().
         * Сравните время выполнения алгоритмы сортировки методом sort() из задания 2.1 и сортировку пузырьком.
         */

        int[] array3 = new int[400];
        fillArrayWithRandom(array3);
        startNanoTime = System.nanoTime();
        bubbleSort(array3);
        System.out.println("Сортировка пузырьком длилась " + (System.nanoTime() - startNanoTime) + " наносекунд");
        // Время сортировок каждым методом выводится в консоль для сравнения


        /*
         * Задание 2.5
         * На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом выбора.
         * Оцените сортировку с помощью базового класса System.nanoTime().
         * Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3 и 2.4.
         */

        int[] array4 = new int[400];
        fillArrayWithRandom(array4);
        startNanoTime = System.nanoTime();
        selectSort(array4);
        System.out.println("Сортировка выбором длилась " + (System.nanoTime() - startNanoTime) + " наносекунд");
        // Время сортировок каждым методом выводится в консоль для сравнения


        /*
         * Задание 2.6
         * На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом выбора.
         * Оцените сортировку с помощью базового класса System.nanoTime().
         * Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3 и 2.4.
         */

        int[] array5 = new int[400];
        fillArrayWithRandom(array5);
        startNanoTime = System.nanoTime();
        insertSort(array5);
        System.out.println("Сортировка вставкой длилась " + (System.nanoTime() - startNanoTime) + " наносекунд");
        // Время сортировок каждым методом выводится в консоль для сравнения


        // Итого, посмотрим вывод в консоль:
        //
        // > Сортировка длилась 121900 наносекунд
        // > Сортировка пузырьком длилась 6215000 наносекунд
        // > Сортировка выбором длилась 2026300 наносекунд
        // > Сортировка вставкой длилась 1875900 наносекунд

    }


    public static void fillArrayWithRandom(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(20);
        }
    }

    public static int maxArrayElementLine(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int elementIndexBinSearch(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    private static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        int buf;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}