package ru.leonov;

import ru.leonov.helpers.ArrayHelper;
import ru.leonov.helpers.NanoTimeHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task3_1 {

    //    Задание 3.1
    //    На основе массива из домашнего задания 2.1 реализуйте простой список и коллекцию.
    //    Оцените время выполнения преобразования.
    public static void Task() {

        int[] array = ArrayHelper.createIntArray(400);
        System.out.println(Arrays.toString(array));

        // Создание List из массива Int
        NanoTimeHelper.start();
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        NanoTimeHelper.printTime("Создание List из int[].");

        // Создание Collection из массива Int
        // Не очень понял задание. Ведь Collection это интерфес. Все равно класс получился ArrayList.
        NanoTimeHelper.start();
        Collection<Integer> collection = Arrays.stream(array).boxed().collect(Collectors.toCollection(ArrayList::new));
        // Время меньше видимо из-за кеширования stream
        NanoTimeHelper.printTime("создание Collection из int[]");


        // Создание List из массива Integer (для сравнения)
        Integer[] array2 = ArrayHelper.createIntegerArray(400);
        System.out.println(Arrays.toString(array));

        NanoTimeHelper.start();
        List<Integer> list2 = Arrays.asList(array2);
        NanoTimeHelper.printTime("Создание List из Integer[].");

    }
}
