package ru.leonov.hash;

public class Item {
    private final String value;

    public Item(String value) {
        this.value = value;
    }

    public String getKey() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}