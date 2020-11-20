package ru.leonov;

import ru.leonov.helpers.ArrayHelper;
import ru.leonov.helpers.CollectionHelper;
import ru.leonov.helpers.NanoTimeHelper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3_2 {

    //    Задание 3.2
    //    На основе списка из задания 3.1 реализуйте основные методы добавления, удаления и получения объекта или элемента из списка.
    //    Оценить выполненные методы с помощью базового класса System.nanoTime().
    public static void Task() {

        int[] array = ArrayHelper.createIntArray(10);
        System.out.println(Arrays.toString(array));

        NanoTimeHelper.start();
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        NanoTimeHelper.printTime("Создание List из int[].");

        NanoTimeHelper.start();
        list.add(100);
        NanoTimeHelper.printTime("add 100.");
        System.out.println(CollectionHelper.listToString(list));

        NanoTimeHelper.start();
        list.add(1, 100);
        NanoTimeHelper.printTime("add 100 in index 1.");
        System.out.println(CollectionHelper.listToString(list));

        List<Integer> newList = Arrays.asList(10, 11, 12, 11);
        NanoTimeHelper.start();
        list.addAll(newList);
        NanoTimeHelper.printTime("add 4 items to end.");
        System.out.println(CollectionHelper.listToString(list));

        Integer value = list.get(1);
        System.out.printf("value of index 1 is %d%n", value);

        list.remove(1);
        System.out.println("Removing an item with index 1");
        System.out.println(CollectionHelper.listToString(list));

        list.remove(new Integer(11));
        System.out.println("Removing first item 11");
        System.out.println(CollectionHelper.listToString(list));

        list.set(0, 1000);
        System.out.println("Setting an item with index 0 to 1000");
        System.out.println(CollectionHelper.listToString(list));

    }
}
