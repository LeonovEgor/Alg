package ru.leonov.list;

import java.util.Iterator;

public class MyItem<T> {

    T value;

    private MyItem<T> next;

    public MyItem(T value) { this.value = value; }

    public MyItem<T> getNext() {return next; }
    public void setNext(MyItem<T> next) {this.next = next; }

    public T getValue() {return value; }

    // Добавлено для задания 3.4
    private MyItem<T> prev;
    public MyItem<T> getPrev() {return prev; }
    public void setPrev(MyItem<T> prev) {this.prev = prev; }

}