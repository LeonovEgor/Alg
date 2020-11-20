package ru.leonov.list;

public class MyItem<T> {

    T value;

    private MyItem<T> next;

    public MyItem(T value) { this.value = value; }

    public MyItem<T> getNext() {return next; }
    public void setNext(MyItem<T> next) {this.next = next; }

    public T getValue() {return value; }
}