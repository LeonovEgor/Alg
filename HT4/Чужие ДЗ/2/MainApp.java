package ru.geekbrains;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        /*
         * Задание 4.1
         * На основе данных объектного списка из задания 3.4 реализуйте простой стек и его базовые методы.
         */

        Stack<Students> stdStack = new Stack<>();
        stdStack.push(new Students("StudentName-1", 10));
        stdStack.push(new Students("StudentName-2", 11));
        stdStack.push(new Students("StudentName-3", 12));
        stdStack.push(new Students("StudentName-4", 13));
        stdStack.push(new Students("StudentName-5", 14));

        stdStack.pop();

        while (!stdStack.isEmpty()) {
            System.out.println(stdStack.pop().getName());
        }


        /*
         * Задание 4.2
         * На основе данных объектного списка из задания 3.4 реализуйте простую очередь и его базовые методы.
         * Реализуйте вспомогательные методы.
         */

        Queue<Students> stdQueue = new LinkedList<>();
        stdQueue.offer(new Students("StudentName-1", 10));
        stdQueue.offer(new Students("StudentName-2", 11));
        stdQueue.offer(new Students("StudentName-3", 12));
        stdQueue.offer(new Students("StudentName-4", 13));
        stdQueue.offer(new Students("StudentName-5", 14));

        stdQueue.poll();
        System.out.println(stdQueue.isEmpty());
        System.out.println(stdQueue.size());

        while (!stdQueue.isEmpty()) {
            System.out.println(stdQueue.poll().getName());
        }


        /*
         * Задание 4.3
         * На основе данных объектного списка из задания 3.4 реализуйте простой дек и его базовые методы.
         */

        Deque<Students> stdDeque = new ArrayDeque<>();
        stdDeque.addLast(new Students("StudentName-1", 10));
        stdDeque.addLast(new Students("StudentName-2", 11));
        stdDeque.addLast(new Students("StudentName-3", 12));
        stdDeque.addLast(new Students("StudentName-4", 13));
        stdDeque.addLast(new Students("StudentName-5", 14));

        stdDeque.pollLast().getAge();

        while (!stdDeque.isEmpty()) {
            System.out.println(stdDeque.pollFirst().getName());
        }


        /*
         * Задание 4.4
         * Реализуйте приоритетную очередь на основе ссылочных типов данных, например, integer.
         */

        PriorityQueue<Integer> prior = new PriorityQueue<>();
        prior.add(8);
        prior.add(4);
        prior.add(16);
        prior.add(2);

        prior.offer(1);
        prior.offer(22);

        while (!prior.isEmpty()) {
            System.out.println(prior.poll());
        }

        /*
         * Задание 4.5
         * На основе данных из задания 4.1 и 4.2, реализуйте стек и очередь на базе связанного списка.
         */

        /*
         * Совсем не понятен смысл задания. В Java стек и очередь и так реализованы на баде связанного списка.
         * Это даже было оговорено в последнем видео урока
         * Получается просто повторение кода в из 4.1 и 4.2
         */

    }
}
