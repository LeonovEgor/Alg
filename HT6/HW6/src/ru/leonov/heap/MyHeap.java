package ru.leonov.heap;

public class MyHeap {
    private final int[] array;

    public MyHeap(int[] array) {
        this.array = array;

        // Построение кучи
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(i, array.length - 1);
    }

    private void heapify(int rootIndex, int size) {
        int largest = rootIndex;
        int leftChildIndex = 2 * rootIndex + 1;
        int rightChildIndex = 2 * rootIndex + 2;

        if (leftChildIndex < size && array[leftChildIndex] > array[largest]) {
            largest = leftChildIndex;
        }
        if (rightChildIndex < size && array[rightChildIndex] > array[largest]) {
            largest = rightChildIndex;
        }

        if (largest != rootIndex) {
            swapItem(rootIndex, largest);
            heapify(largest, size);
        }
    }

    private void swapItem(int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public int[] getArray() {
        return array;
    }

    public void sort() {
        for (int i = array.length-1 ; i >= 0 ; i--) {
            swapItem(i, 0);
            heapify(0, i);
        }
    }

}