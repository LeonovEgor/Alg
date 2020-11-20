package ru.leonov;

import ru.leonov.helpers.NanoTimeHelper;
import ru.leonov.list.Person;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Task4_4 {

    //    Задание 4.4
    //    Реализуйте приоритетную очередь на основе ссылочных типов данных, например, integer.
    //    Оцените время выполнения операций с помощью базового метода System.nanoTime().
    public static void Task() {

        // Проявлю лень и не буду реализовывать свою приоритетную очередь. Воспользуюсь стандартной
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        System.out.println("Добавление элементов");
        priorityQueue.add(18);
        priorityQueue.add(22);
        priorityQueue.add(44);
        NanoTimeHelper.start();
        priorityQueue.add(39);
        NanoTimeHelper.printTime("Добавление 4го элемента");

        System.out.println("Получение из очереди всех элементов");
        while (!priorityQueue.isEmpty()) {
            NanoTimeHelper.start();
            Integer value = priorityQueue.remove();
            NanoTimeHelper.printTime(String.format("Получение элемента %d", value));
        }
    }
}
