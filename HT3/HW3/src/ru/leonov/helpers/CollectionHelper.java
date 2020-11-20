package ru.leonov.helpers;

import ru.leonov.list.MyItem;

import java.util.Collection;

public class  CollectionHelper {

    public static <T> String listToString(Collection<T> collection) {
        StringBuilder sb = new StringBuilder();
        for (Object item: collection) {
            sb.append(String.format("%s ", item));
        }
        return sb.toString();
    }

    public static <T> String mySingleListToString(MyItem<T> first) {
        if (first == null) return "";

        StringBuilder sb = new StringBuilder();
        MyItem<T> current = first;

        while (current != null) {
            sb.append(String.format("%s ", current.getValue().toString()));
            current = current.getNext();
        }

        return sb.toString();
    }

    public static <T> boolean contains(MyItem<T> firstItem, T lookingFor) {
        boolean res = false;
        MyItem<T> current = firstItem;

        while (current.getNext() != null) {
            if (current.getValue().equals(lookingFor)) {
                res = true;
                break;
            }
            current = current.getNext();
        }

        return res;
    }

    public static <T> T find(MyItem<T> firstItem, T item) {
        T res = null;
        MyItem<T> current = firstItem;

        while (current.getNext() != null) {
            if (current.getValue().equals(item)) {
                res = current.getValue();
                break;
            }
            current = current.getNext();
        }

        return res;
    }

}