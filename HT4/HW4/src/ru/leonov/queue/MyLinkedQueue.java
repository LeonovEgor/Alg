package ru.leonov.queue;

import ru.leonov.list.MyItem;

public class MyLinkedQueue<T> {
    private MyItem<T> first = null;
    private MyItem<T> last = null;

    public MyLinkedQueue() { }

    public void insert(T value) {
        MyItem<T> myItem = new MyItem<>(value);
        if (first == null) {
            first = myItem;
        } else {
            last.setNext(myItem);
        }
        last = myItem;
    }

    public T remove() {
        T value = first.getValue();

        if (first.getNext() == null) last = null;
        first = first.getNext();

        return value;
    }

    public T peek() {
        return first.getValue();
    }

    public boolean isEmpty() {
        return first == null;
    }

}