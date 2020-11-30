package ru.leonov;

import ru.leonov.utils.FactorialHelper;
import ru.leonov.utils.NanoTimeHelper;

public class Task5_4 {

    //    Задание 5.4
    //    Реализуйте простой алгоритм использующий цикл и простой алгоритм использующий рекурсию.
    public static void Task() {
        int value = 5;

        //Вычисление факториала через цикл
        NanoTimeHelper.start();
        long res = FactorialHelper.cycleFactorial(value);
        NanoTimeHelper.printTime(String.format("Вычисление в цикле %d! = %d%n", value, res));

        // Рекурсивное вычисление факториала
        NanoTimeHelper.start();
        res = FactorialHelper.recursionFactorial(value);
        NanoTimeHelper.printTime(String.format("Вычисление рекурсией %d! = %d%n", value, res));
    }

}