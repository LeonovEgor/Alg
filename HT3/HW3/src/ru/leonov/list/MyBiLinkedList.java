package ru.leonov.list;

import java.util.Iterator;

public class MyBiLinkedList<T> extends MySingleLinkedList<T>  {

    public MyBiLinkedList() {
        super();
    }

    @Override
    public void insert(T item) {
        MyItem<T> myItem = new MyItem<>(item);
        myItem.setNext(first);
        if (first != null) first.setPrev(myItem);
        first = myItem;
    }

    public void insert(T item, int index) {
        MyItem<T> inserted = new MyItem<>(item);
        MyItem<T> current = getMyItem(index);
        if (current == null) throw new IndexOutOfBoundsException();

        inserted.setPrev(current.getPrev());
        inserted.setNext(current);

        if (current.getPrev() != null) current.getPrev().setNext(inserted);
        current.setPrev(inserted);
    }

    @Override
    public void delete() {
        if (first.getNext() != null) {
            MyItem<T> next = first.getNext();
            next.setPrev(null);
        }
        first = first.getNext();
    }

    public void delete(int index) {
        MyItem<T> current = (MyItem<T>)getMyItem(index);
        if (current == null) throw new IndexOutOfBoundsException();

        MyItem<T> next = current.getNext();
        MyItem<T> prev = current.getPrev();

        if (next != null) next.setPrev(prev);
        if (prev != null) prev.setNext(next);
    }

}