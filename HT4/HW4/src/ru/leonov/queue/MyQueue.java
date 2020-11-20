package ru.leonov.queue;

public class MyQueue<T> {
    private final T[] arrQueue;
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private final int maxSize;

    @SuppressWarnings("unchecked")
    public MyQueue(int maxSize) {
        arrQueue = (T[]) new Object[maxSize];
        this.maxSize = maxSize;
    }

    public void insert(T item) {
        if (rear >= maxSize - 1) rear = -1;

        arrQueue[++rear] = item;
        size++;
    }

    public T remove() {
        T item = arrQueue[front++];

        if (front == maxSize) front = 0;
        size--;
        return item;
    }

    public T peek() {
        return arrQueue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize-1;
    }
}
