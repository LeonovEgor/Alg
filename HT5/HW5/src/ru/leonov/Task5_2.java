package ru.leonov;

import ru.leonov.utils.FactorialHelper;

public class Task5_2 {

    //    Задание 5.2
    //    Реализуйте простой пример бесконечной рекурсии и обычной рекурсии с условием для выхода.
    public static void Task() {
        // Рекурсивное вычисление факториала
        int value = 10;
        long res = FactorialHelper.recursionFactorial(value);
        System.out.printf("Факториал: %d! = %d%n", value, res);

        System.out.println("Бесконечная рекурсия. При желании полюбоваться на StackOverflow нужно раскомментировать.");
        //infiniteRecursion(value);
    }

    private static void infiniteRecursion(int n) {
        System.out.println(n);
        infiniteRecursion(n-1);
    }
}
