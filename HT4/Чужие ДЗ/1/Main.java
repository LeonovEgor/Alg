package hw4;

import java.util.*;

public class Main {
    private static final int Count = 1000; // Количество элементов для теста;
    private static final int MaxValue = 1000; // Максимальное значение элемента;
    private static long t1; // Стартовое время в расчетах производительности;
    private static Random rnd = new Random();

    public static void main(String[] args) {
        LinkedList<ArObj> lList = new LinkedList<>();
        for (int i = 0; i < Count; i++) {
            lList.add(new ArObj(getRnd(), getRnd()));

        }
        System.out.println("Исходный список: "+lList.size()+" элементов");

        // СТЕК:
        // Заполнение стека объектами из списка:
        Stack<ArObj> stObj = new Stack<>();
        ListIterator<ArObj> iter = lList.listIterator();

        System.out.println("\n[Stack]");

        stObj.push(new ArObj(1,1));
        stObj.push(new ArObj(2,2));
        stObj.push(new ArObj(3,3));

        while (!stObj.isEmpty()) {
            stObj.pop().print();
        }

        System.out.print("Заполнение [push] " + Count + " элементов: ");
        start();
        while (iter.hasNext()) {
            stObj.push(iter.next());
        }
        dT();

        System.out.print("Извлечение [pop] " + Count + " элементов: ");
        start();
        while (!stObj.isEmpty()){
            stObj.pop();
        }
        dT();

        // ОЧЕРЕДЬ:
        System.out.println("\n[Queue]");

        Queue<ArObj> quMy= new LinkedList<>();
        quMy.add(new ArObj(1,1));
        quMy.add(new ArObj(2,2));
        quMy.add(new ArObj(3,3));

        while (!quMy.isEmpty()) {
            quMy.remove().print();
        }

        iter = lList.listIterator();
        System.out.print("Заполнение [add] " + Count + " элементов: ");
        start();
        while (iter.hasNext()) {
            quMy.add(iter.next());
        }
        dT();

        System.out.print("Извлечение [remove] " + Count + " элементов: ");
        start();
        while (!quMy.isEmpty()){
            quMy.remove();
        }
        dT();

        System.out.println("\n[Deque]");

        Deque<ArObj> decMy= new LinkedList<>();
        decMy.add(new ArObj(1,1));
        decMy.add(new ArObj(2,2));
        decMy.addLast(new ArObj(3,3));
        decMy.addFirst(new ArObj(0,0));

        while (!decMy.isEmpty()) {
            decMy.removeFirst().print();
        }

        System.out.print("Заполнение [addAll] " + Count + " элементов: ");
        start();
        decMy.addAll(lList);
        dT();

        System.out.print("Извлечение [removeFirst] " + Count/2 + " элементов: ");
        start();
        for (int i = 0; i < (Count/2); i++) {
            decMy.removeFirst();
        }
        dT();

        System.out.print("Извлечение [removeLast] остальных элементов: ");
        start();
        for (int i = 0; i < (Count/2); i++) {
            decMy.removeLast();
        }
        dT();

        System.out.println("\n[PriorityQueue]");
        PriorityQueue<Integer> prior = new PriorityQueue<>();
        prior.add(15);
        prior.add(7);
        prior.add(25);
        prior.add(11);
        prior.add(3);

        while (!prior.isEmpty()) {
            System.out.println(prior.remove());
        }

        System.out.print("Заполнение [add] " + Count + " элементов случайными зачениями: ");
        start();
        for (int i = 0; i < Count; i++) {
            prior.add(getRnd());
        }
        dT();

        System.out.print("Поиск [contains] элемента [");
        start();
        System.out.print(prior.contains(777)+"] :");
        dT();

        System.out.print("Извлечение [remove] " + Count + " элементов: ");
        start();
        while (!prior.isEmpty()) {
            prior.remove();
        }
        dT();


    }

    public static void start() { // Начало измерения времени;
        t1 = System.nanoTime();
    }

    public static void dT() { //Измерение и вывод времени с события start;
        long t2 = System.nanoTime();
        float dt = (t2 - t1) / 1000f;
        System.out.println(dt + " мс.");
    }

    private static int getRnd() {
        return rnd.nextInt(MaxValue);
    }
}

/*
Исходный список: 1000 элементов

[Stack]
X: 3; Y: 3
X: 2; Y: 2
X: 1; Y: 1
Заполнение [push] 1000 элементов: 259.3 мс.
Извлечение [pop] 1000 элементов: 276.9 мс.

[Queue]
X: 1; Y: 1
X: 2; Y: 2
X: 3; Y: 3
Заполнение [add] 1000 элементов: 88.6 мс.
Извлечение [remove] 1000 элементов: 160.5 мс.

[Deque]
X: 0; Y: 0
X: 1; Y: 1
X: 2; Y: 2
X: 3; Y: 3
Заполнение [addAll] 1000 элементов: 73.2 мс.
Извлечение [removeFirst] 500 элементов: 49.2 мс.
Извлечение [removeLast] остальных элементов: 49.5 мс.

[PriorityQueue]
3
7
11
15
25
Заполнение [add] 1000 элементов случайными зачениями: 392.5 мс.
Поиск [contains] элемента [true] :296.9 мс.
Извлечение [remove] 1000 элементов: 632.8 мс.

 */