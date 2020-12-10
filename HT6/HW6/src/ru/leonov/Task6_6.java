package ru.leonov;

import ru.leonov.heap.MyHeap;
import ru.leonov.person.Person;
import ru.leonov.tree.MyTree;
import ru.leonov.utils.NanoTimeHelper;

import java.util.Arrays;

//Задание 6.6
//Реализуйте на основе массива из задания 2.1 алгоритм пирамидальной сортировки с реализацией бинарной пирамиды.
//Выполните оценку алгоритма пирамидальной сортировки с помощью System.nanoTime() и сравните с предыдущими алгоритмами сортировки.
public class Task6_6 {

    public static void Task() {
        int[] array = {10, 3, 15, 2, 56, 12, 7, 4, 1};
        System.out.printf("%n Массив %s", Arrays.toString(array));

        MyHeap heap = new MyHeap(array);
        System.out.printf("%n Куча %s", Arrays.toString(heap.getArray()));

        heap.sort();
        System.out.printf("%n Отсортированный массив %s%n", Arrays.toString(heap.getArray()));
    }

    public static void main(String[] args) {
        Task();
    }

}