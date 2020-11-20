package ru.leonov;

import ru.leonov.list.MyBiLinkedList;
import ru.leonov.list.Person;

public class Task3_4 {

    //    Задание 3.4
    //    На основе списка из задания 3.1 реализуйте простой двусторонний список и его базовые методы.
    //    Реализуйте список заполненный объектами из вашего класса из задания 1.3
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

        list.delete();
        System.out.println("Удален первый элемент");
        System.out.println(list.listToString());

        list.delete(4);
        System.out.println("Удален 4й элемент (15)");
        System.out.println(list.listToString());

        System.out.println("Проверка наличия элемента 13");
        boolean isContain = list.contains(13);
        System.out.println(isContain);

        System.out.println("Поиск элемента 11");
        Integer value = list.find(11);
        System.out.println(value);

        MyBiLinkedList<Person> personList = new MyBiLinkedList<>();
        personList.insert(new Person("Ivan", 18));
        personList.insert(new Person("Galina", 22));

        Person person = new Person("Vladimir", 30);
        personList.insert(person);

        personList.insert(new Person("Yana", 19), 1);
        System.out.println(personList.listToString());

        personList.delete(2);
        System.out.println("Удален 2й элемент (Galina)");
        System.out.println(personList.listToString());

        System.out.println("Проверка наличия элемента Vladimir");
        isContain = personList.contains(person);
        System.out.println(isContain);

        System.out.println("Поиск элемента Vladimir");
        Person personVladimir = personList.find(person);
        System.out.println(personVladimir);
    }
}
