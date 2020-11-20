package ru.leonov;

import ru.leonov.list.Person;
import ru.leonov.queue.MyQueue;

public class Task4_2 {

    //    Задание 4.2
    //    На основе данных объектного списка из задания 3.4 реализуйте простую очередь и его базовые методы.
    //    Реализуйте вспомогательные методы.
    public static void Task() {

        MyQueue<Person> personQueue = new MyQueue<>(5);
        System.out.printf("Состояние очереди: Пустая: %b. Полная: %b.%n", personQueue.isEmpty(), personQueue.isFull());

        Person ivanPerson = new Person("Ivan", 34);
        personQueue.insert(ivanPerson);
        System.out.printf("В очередь добавлен элемент: %s%n", ivanPerson.toString());
        Person queuePerson = personQueue.peek();
        System.out.printf("В очереди первый элемент: %s%n", queuePerson.toString());

        System.out.printf("Состояние очереди: Пустая: %b. Полная: %b.%n", personQueue.isEmpty(), personQueue.isFull());

        queuePerson = personQueue.remove();
        System.out.printf("Из очереди получен элемент: %s%n", queuePerson.toString());
        System.out.printf("Состояние очереди: Пустая: %b. Полная: %b.%n", personQueue.isEmpty(), personQueue.isFull());

        System.out.println("Добавление до полного");
        personQueue.insert(new Person("Nastya", 18));
        personQueue.insert(new Person("Sveta", 22));
        personQueue.insert(new Person("Egor", 44));
        personQueue.insert(new Person("Vladimir", 39));
        System.out.printf("Состояние очереди: Пустая: %b. Полная: %b.%n", personQueue.isEmpty(), personQueue.isFull());

        System.out.println("Получение из очереди");
        while (!personQueue.isEmpty()) {
            Person person = personQueue.remove();
            System.out.println(person);
        }
        System.out.printf("Состояние очереди: Пустая: %b. Полная: %b.%n", personQueue.isEmpty(), personQueue.isFull());
    }
}
