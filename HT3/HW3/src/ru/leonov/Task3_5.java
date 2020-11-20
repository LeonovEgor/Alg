package ru.leonov;

import ru.leonov.helpers.NanoTimeHelper;
import ru.leonov.list.MyBiLinkedList;

import java.util.Iterator;

public class Task3_5 {

    //    Задание 3.5
    //    Реализуйте итератор на основе связанных списков из задания 3.4 и выполните базовые операции итератора.
    //    Оцените время выполнения операций с помощью базового метода System.nanoTime()
    public static void Task() {
        MyBiLinkedList<Integer> list = new MyBiLinkedList<>();

        list.insert(18);
        list.insert(17);
        list.insert(16);
        list.insert(15);
        list.insert(13);
        list.insert(12);
        list.insert(11);
        list.insert(10);

        list.insert(14, 3);

        System.out.println(list.listToString());

        System.out.println("Вывод списка через итератор");

        NanoTimeHelper.start();

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        NanoTimeHelper.printTime("Вывод через итератор занял ");

    }
}
