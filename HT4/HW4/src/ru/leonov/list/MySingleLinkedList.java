package ru.leonov.list;

import ru.leonov.helpers.CollectionHelper;

import java.util.Iterator;

public class MySingleLinkedList<T>  implements Iterable<T> {

    protected MyItem<T> first;

    public MySingleLinkedList() {
        first = null;
    }

    public boolean isEmpty() { return first == null; }

    public MyItem<T> getMyItem(int index) {
        MyItem<T> current = first;
        int i = 0;

        while (i < index) {
            if (current == null) throw new IndexOutOfBoundsException();
            current = current.getNext();
            i++;
        }

        return current;
    }

    public T get(int index) {
        MyItem<T> item = getMyItem(index);
        return item != null ? item.getValue() : null;
    }

    public void insert(T item) {
        MyItem<T> myItem = new MyItem<>(item);
        myItem.setNext(first);
        first = myItem;
    }

    public T delete() {
        T temp = first.getValue();
        first = first.getNext();
        return temp;
    }

    public boolean contains(T item) {
        return CollectionHelper.contains(first, item);
    }

    public T find(T item) {
        return CollectionHelper.find(first, item);
    }

    public T getFirst() { return first != null ? first.getValue() : null; }

    public String listToString() {
        return CollectionHelper.mySingleListToString(first);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyItem<T> current = first;

            @Override
            public boolean hasNext() {
                return current.getNext() != null;
            }

            @Override
            public T next() throws IndexOutOfBoundsException {
                T value = current.value;
                if (current.getNext() == null) throw new IndexOutOfBoundsException("End of list.");
                current = current.getNext();
                return value;
            }
        };
    }

}