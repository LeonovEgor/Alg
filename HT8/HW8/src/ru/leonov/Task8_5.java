package ru.leonov;

import ru.leonov.hash.Item;
import ru.leonov.hash.MyHashTable;
import ru.leonov.hash.MyHashTableDouble;

//Задание 8.5
//Перестройте программный код задания 8.4 из алгоритма линейного пробирования в алгоритм двойного хеширования.
//Сравните отличительные черты двух алгоритмов.
public class Task8_5 {
    public static void Task() {

        // Что бы они подрались за места массив создадим небольшого размера
        MyHashTableDouble table = new MyHashTableDouble(10);

        table.insert("ValueOne");
        table.insert("ValueTwo");
        table.insert("ValueThree");
        table.insert("ValueFour");
        table.insert("ValueFive");
        table.insert("ValueSix");
        table.insert("ValueSeven");
        table.insert("ValueEight");

        table.printTable();

        String toFind = "ValueFive";
        Item item = table.find(toFind);
        System.out.printf("Искали: %s. Нашли: %s%n",
                toFind,
                item != null ? item.toString() : "null");

        String toDelete = "ValueSix";
        item = table.delete(toDelete);
        System.out.printf("Удаляли элемент: %s. Удален элемент: %s.%n",toDelete, item.toString());
        table.printTable();

    }

    public static void main(String[] args) {
        Task();
    }
}
