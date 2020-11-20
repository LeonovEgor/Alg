package ru.leonov;

import ru.leonov.list.MySingleLinkedList;

public class Task3_3 {

    //    Задание 3.3
    //    Реализуйте простой односвязный список и его базовые методы.
    public static void Task() {
        MySingleLinkedList<Integer> list = new MySingleLinkedList<>();

        list.insert(10);
        list.insert(11);
        list.insert(12);
        list.insert(13);
        list.insert(14);

        System.out.println(list.listToString());

        list.delete();
        System.out.println("Удален первый элемент");
        System.out.println(list.listToString());

        System.out.println("Проверка наличия элемента 13");
        boolean isContain = list.contains(13);
        System.out.println(isContain);

        System.out.println("Поиск элемента 11");
        Integer value = list.find(11);
        System.out.println(value);



    }
}
