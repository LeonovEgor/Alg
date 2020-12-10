package ru.leonov.hash;

public class MyHashTableDouble {
    private final Item[] hashTable;

    public MyHashTableDouble(int size) {
        hashTable = new Item[size];
    }

    public void printTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null)
                System.out.printf("%d %s%n", i, hashTable[i].toString());
            else System.out.printf("%d ***%n", i);
        }
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (31 * hash + key.charAt(i)) % hashTable.length;
        }

        return hash;
    }

    private int hash2(String key) {
        // Число должно быть не больше длины массива.
        int digitalConst = hashTable.length % 3;
        return digitalConst - hash(key) % digitalConst;
    }

    // Добавление с разрешением коллизий при помощи двойного хеширования
    public void insert(String key) {
        Item item = new Item(key);
        int hash = hash(key);

        while (hashTable[hash] != null) {
            hash += hash2(key);
            hash %= hashTable.length;
        }

        hashTable[hash] = item;
    }

    public Item find(String key) {
        int hash = hash(key);

        while (hashTable[hash] != null) {
            if (hashTable[hash].getKey().equals(key)) return hashTable[hash];

            hash += hash2(key);
            hash %= hashTable.length;
        }

        return null;
    }

    public Item delete(String key) {
        int hash = hash(key);

        while (hashTable[hash] != null) {
            if (hashTable[hash].getKey().equals(key)) {
                Item item = hashTable[hash];
                hashTable[hash] = null;
                return item;
            }

            hash += hash2(key);
            hash %= hashTable.length;
        }

        return null;
    }

}