package ru.leonov.tree;

public class Node<T extends Comparable<T> & IPrint> {
    public T item;
    public Node<T> leftChild;
    public Node<T> rightChild;

    public Node() {

    }

    public Node(T item) {
        this.item = item;
    }

    public void print() {
        item.print();
    }

}