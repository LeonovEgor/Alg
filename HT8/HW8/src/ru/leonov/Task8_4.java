package ru.leonov;

import ru.leonov.hash.Item;
import ru.leonov.hash.MyHashTable;

//Задание 8.4
//На основе данных массива из задания 2.3 реализуйте хеш-таблицу с помощью открытой адресации, а конкретнее метода линейного пробирования
public class Task8_4 {
    public static void Task() {

        MyHashTable table = new MyHashTable(19);

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
