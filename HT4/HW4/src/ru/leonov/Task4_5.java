package ru.leonov;

import ru.leonov.helpers.NanoTimeHelper;
import ru.leonov.list.Person;
import ru.leonov.queue.MyLinkedQueue;
import ru.leonov.queue.MyQueue;
import ru.leonov.stack.MyLinkedStack;
import ru.leonov.stack.MyStack;

import java.util.PriorityQueue;

//    Задание 4.5
//    На основе данных из задания 4.1 и 4.2, реализуйте стек и очередь на базе связанного списка.
//    Оцените время выполнения операций с помощью базового метода System.nanoTime().
public class Task4_5 {

    public static void StackTask() {
        MyLinkedStack<Person> personStack = new MyLinkedStack<>();

        Person ivanPerson = new Person("Ivan", 34);
        NanoTimeHelper.start();
        personStack.push(ivanPerson);
        NanoTimeHelper.printTime(String.format("Добавление в стек %s", ivanPerson.toString()));

        Person galinaPerson = new Person("Galina", 56);
        System.out.printf("Добавление в стек %s%n", galinaPerson);
        personStack.push(galinaPerson);

        NanoTimeHelper.start();
        Person currentPerson = personStack.peek();
        NanoTimeHelper.printTime("Peek элемента стека (Galina).");
        System.out.println(currentPerson.toString());

        NanoTimeHelper.start();
        currentPerson = personStack.pop();
        NanoTimeHelper.printTime("Pop элемента стека (Galina).");
        System.out.println(currentPerson.toString());

        System.out.println("Добавление Nastya, Sveta, Egor, Vladimir");
        personStack.push(new Person("Nastya", 18));
        personStack.push(new Person("Sveta", 22));
        personStack.push(new Person("Egor", 44));
        personStack.push(new Person("Vladimir", 39));

        System.out.println("Изымание из стека:");
        while (!personStack.isEmpty()) {
            System.out.println(personStack.pop());
        }
    }

    public static void QueueTask() {
        MyLinkedQueue<Person> personQueue = new MyLinkedQueue<>();
        System.out.printf("Состояние очереди: Пустая: %b.%n", personQueue.isEmpty());

        Person ivanPerson = new Person("Ivan", 34);
        personQueue.insert(ivanPerson);
        System.out.printf("В очередь добавлен элемент: %s%n", ivanPerson);

        Person galinaPerson = new Person("Galina", 56);
        personQueue.insert(galinaPerson);
        System.out.printf("В очередь добавлен элемент: %s%n", galinaPerson);

        Person queuePerson = personQueue.peek();
        System.out.printf("peek из очереди: %s%n", queuePerson.toString());

        System.out.printf("Состояние очереди: Пустая: %b. %n", personQueue.isEmpty());

        queuePerson = personQueue.remove();
        System.out.printf("remove из очереди: %s%n", queuePerson.toString());
        System.out.printf("Состояние очереди: Пустая: %b. %n", personQueue.isEmpty());

        System.out.println("Добавление в очередь Nastya, Sveta, Egor, Vladimir");
        personQueue.insert(new Person("Nastya", 18));
        personQueue.insert(new Person("Sveta", 22));
        personQueue.insert(new Person("Egor", 44));
        personQueue.insert(new Person("Vladimir", 39));
        System.out.printf("Состояние очереди: Пустая: %b. %n", personQueue.isEmpty());

        System.out.println("Получение из очереди");
        while (!personQueue.isEmpty()) {
            Person person = personQueue.remove();
            System.out.println(person);
        }
        System.out.printf("Состояние очереди: Пустая: %b. %n", personQueue.isEmpty());
    }
}
