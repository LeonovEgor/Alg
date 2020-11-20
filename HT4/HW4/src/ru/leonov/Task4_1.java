package ru.leonov;

import ru.leonov.helpers.NanoTimeHelper;
import ru.leonov.list.Person;
import ru.leonov.stack.MyStack;

public class Task4_1 {

    //    Задание 4.1
    //    На основе данных объектного списка из задания 3.4 реализуйте простой стек и его базовые методы.
    //    Оцените время выполнения операций с помощью базового метода System.nanoTime().
    public static void Task() {

        MyStack<Person> personStack = new MyStack<>(5);

        System.out.printf("Состояние стека: Пустой: %b. Полный: %b.%n", personStack.isEmpty(), personStack.isFull());

        Person ivanPerson = new Person("Ivan", 34);
        NanoTimeHelper.start();
        personStack.push(ivanPerson);
        NanoTimeHelper.printTime("Добавление в стек");

        System.out.printf("Состояние стека: Пустой: %b. Полный: %b.%n", personStack.isEmpty(), personStack.isFull());

        Person galinaPerson = new Person("Galina", 56);
        System.out.printf("Добавление %s%n", galinaPerson);
        personStack.push(galinaPerson);

        NanoTimeHelper.start();
        Person currentPerson = personStack.peek();
        NanoTimeHelper.printTime("Peek элемента стека (Galina).");
        System.out.println(currentPerson.toString());

        NanoTimeHelper.start();
        currentPerson = personStack.pop();
        NanoTimeHelper.printTime("Pop элемента стека (Galina).");
        System.out.println(currentPerson.toString());

        System.out.println("Добавление до полного");
        personStack.push(new Person("Nastya", 18));
        personStack.push(new Person("Sveta", 22));
        personStack.push(new Person("Egor", 44));
        personStack.push(new Person("Vladimir", 39));
        System.out.printf("Состояние стека: Пустой: %b. Полный: %b.%n", personStack.isEmpty(), personStack.isFull());
    }
}
