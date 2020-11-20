package ru.geekbrains.lessons.lesson_d;

import java.util.*;

public class StackHomeWork {

    static class MyType {

        private final int x;
        private final int y;

        MyType(int x, int y){
            this.x = x;
            this.y = y;
        }

        void show(){
            System.out.printf("X: %s, Y: %s.\n", this.x, this.y);
        }
        int getX() {
            return x;
        }
        int getY() {
            return y;
        }
    }
    static class Link{
        public String name;
        public int age;
        public Link next;

        public Link(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void showLink(){
            System.out.printf("Name: %s, age: %s \n", this.name, this.age);
        }
    }
    static class myLinkedList {
        public Link first;
        public myLinkedList(){
            first = null;
        }
        public boolean isEmpty() { return first == null; }
        public void insert(String name, int age){
            Link newLink = new Link(name, age);
            newLink.next = first;
            first = newLink;
        }
        public Link delete(){
            Link temp = first;
            first = first.next;
            return temp;
        }
        public void showLinkedList(){
            Link current = first;
            while (current != null){
                current.showLink();
                current = current.next;
            }
        }
    }
    static class StackList {
        private myLinkedList list;
        public StackList(){ list = new myLinkedList(); }
        public void push(String name, int age) { list.insert(name, age); }
        public String pop(){ return list.delete().name; }
        public boolean isEmpty() { return list.isEmpty(); }
        public void showStackList() { list.showLinkedList(); }
    }
    static class MyQueue {
        private myLinkedList queue;
        public MyQueue(){ queue = new myLinkedList(); }
        public void insert(String name, int age) { queue.insert(name, age); }
        public String delete(){ return queue.delete().name; }
        public boolean isEmpty() { return queue.isEmpty(); }
        public void showStackList() { queue.showLinkedList(); }
    }

    static final float TIME_CONSTANT = 0.000000000000001f;
    static Stack<MyType> myTypeStack = new Stack<>();
    static Queue<MyType> myTypeQueue = new LinkedList<>();
    static Deque<MyType> myTypeDeque = new ArrayDeque<>();
    static PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
    static StackList stackList = new StackList();
    static MyQueue myQueue = new MyQueue();

    private static float setTime() {
        return System.nanoTime() * TIME_CONSTANT;
    }

    public static void main(String[] args) {
        //task4.1
        setTime();
        myTypeStack.push(new MyType(1, 1));
        myTypeStack.push(new MyType(2, 2));
        myTypeStack.push(new MyType(3, 3));
        myTypeStack.peek().show();
        while (!myTypeStack.empty()) {
            myTypeStack.pop().show();
        }
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        //task4.2
        setTime();
        myTypeQueue.add(new MyType(1, 1));
        myTypeQueue.add(new MyType(2, 2));
        myTypeQueue.add(new MyType(3, 3));
        myTypeQueue.remove();
        System.out.println(myTypeQueue.size());
        System.out.println(myTypeQueue.isEmpty());
        while (!myTypeQueue.isEmpty()){
            myTypeQueue.poll().show();
        }
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        //task4.3
        setTime();
        myTypeDeque.add(new MyType(1, 1));
        myTypeDeque.add(new MyType(2, 2));
        myTypeDeque.add(new MyType(3, 3));
        myTypeDeque.addFirst(new MyType(10,10));
        myTypeDeque.addLast(new MyType(10,10));
        while (!myTypeDeque.isEmpty()){
            myTypeDeque.poll().show();
        }
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        //task4.4
        setTime();
        integerPriorityQueue.add(1000);
        integerPriorityQueue.add(100);
        integerPriorityQueue.add(10);
        integerPriorityQueue.offer(50);
        while (!integerPriorityQueue.isEmpty()){
            System.out.println(integerPriorityQueue.poll());
        }
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        //task4.5
        setTime();
        stackList.push("String_one", 1);
        stackList.push("String_two", 2);
        stackList.push("String_three", 3);
        stackList.showStackList();
        System.out.printf("Element %s has been deleted. \n", stackList.pop());
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        setTime();
        myQueue.insert("String_one", 1);
        myQueue.insert("String_two", 2);
        myQueue.insert("String_three", 3);
        myQueue.showStackList();
        System.out.printf("Element %s has been deleted. \n", myQueue.delete());
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
    }
}
