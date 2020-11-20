package ru.leonov.stack;

import ru.leonov.list.MySingleLinkedList;

public class MyLinkedStack<T> {
    private final MySingleLinkedList<T> list;

    public MyLinkedStack() {
        list = new MySingleLinkedList<>();
    }

    public void push(T value) {
        list.insert(value);
    }

    public T peek() {
        return list.getFirst();
    }

    public T pop() {
        return list.delete();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}