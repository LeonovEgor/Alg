package ru.leonov.stack;

public class MyStack<T> {
    private final T[] arrStack;
    private int top = -1;
    private final int maxSize;

    @SuppressWarnings("unchecked")
    public MyStack(int size) {
        arrStack = (T[])new Object[size];
        this.maxSize = size;
    }

    public void push(T item) {
        arrStack[++top] = item;
    }

    public T peek() {
        return arrStack[top];
    }

    public T pop() {
        return arrStack[top--];
    }

    public boolean isEmpty() {
        return top <= -1;
    }

    public boolean isFull() {
        return top >= maxSize-1;
    }

}