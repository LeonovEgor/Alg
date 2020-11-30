package ru.leonov;

import ru.leonov.utils.FactorialHelper;
import ru.leonov.utils.StackTraceHelper;

public class Task5_3 {

    //    Задание 5.3
    //    Приведите пример изображающий стек вызова и стек вызова с рекурсией.
    public static void Task() {

        // Надеюсь, я правильно понял, что требуется в этом странном задании.
        System.out.println("Стек с рекурсией:");
        FactorialHelper.recursionFactorialPrint(5);

        System.out.println("Стек без рекурсией:");
        regularFun();

    }


    private static void regularFun() {
        innerFun();
    }

    private static void innerFun() {
        StackTraceHelper.printStack();
    }

}