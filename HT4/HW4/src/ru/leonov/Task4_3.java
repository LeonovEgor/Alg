package ru.leonov;

import ru.leonov.list.Person;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task4_3 {

    //    Задание 4.3
    //    На основе данных объектного списка из задания 3.4 реализуйте простой дек и его базовые методы.
    //    Оцените время выполнения операций с помощью базового метода System.nanoTime().
    public static void Task() {

        // Проявлю лень и не буду реализовывать свою Дек очередь. Воспользуюсь стандартной
        Deque<Person> personDequeue = new ArrayDeque<>();

        System.out.println("Добавление элементов");
        personDequeue.add(new Person("Nastya", 18));
        personDequeue.add(new Person("Sveta", 22));
        personDequeue.add(new Person("Egor", 44));
        personDequeue.add(new Person("Vladimir", 39));

        Person Nastya = personDequeue.removeFirst();
        System.out.printf("Получение из очереди первого элемента %s%n", Nastya.toString());

        System.out.println("Добавление вперед");
        personDequeue.addFirst(new Person("First", 0));
        System.out.println("Добавление назад");
        personDequeue.addLast(new Person("Last", 0));

        System.out.println("Получение из очереди всех элементов");
        while (!personDequeue.isEmpty()) {
            Person person = personDequeue.remove();
            System.out.println(person);
        }
    }
}
