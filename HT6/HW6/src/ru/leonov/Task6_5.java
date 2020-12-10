package ru.leonov;

import ru.leonov.person.Person;
import ru.leonov.tree.MyTree;
import ru.leonov.tree.Node;
import ru.leonov.utils.NanoTimeHelper;

// Задание 6.5
// Реализуйте метод удаления узла и выполните оценку времени базовых методов дерева с помощью System.nanoTime().
public class Task6_5 {


    public static void Task() {
        MyTree<Person> tree = new MyTree<>();

        Person vasiliy = new Person(10, "Vasiliy", 30);
        Person ksenia = new Person(2, "Ksenia", 16);
        Person katya = new Person(3, "Katya", 17);
        try {
            tree.insert(new Person(6, "Ivan", 25));
            tree.insert(vasiliy);
            tree.insert(new Person(14, "Fedor", 13));
            tree.insert(katya);
            tree.insert(new Person(5, "Sveta", 14));
            tree.insert(new Person(9, "Galina", 43));
            tree.insert(ksenia);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //      6
        //     / \
        //    3   10
        //   /\   /\
        //  2  5 9 14

        System.out.println("Обход дерева");
        tree.inOrder();
        System.out.printf("%nУдаление ");
        ksenia.print();
        tree.delete(ksenia); // Удаление листа

        System.out.println("Обход дерева");
        tree.inOrder();

        System.out.printf("%nУдаление ");
        katya.print();
        tree.delete(katya); // Удаление ноды с 1 дочерним элементом

        System.out.println("Обход дерева");
        tree.inOrder();

        System.out.printf("%nУдаление ");
        vasiliy.print();
        NanoTimeHelper.start();
        tree.delete(vasiliy); // Удаление ноды с 2 дочерними элементами
        NanoTimeHelper.printTime("Удаление элемента дерева с 2мя дочерними элементами.");
        System.out.println("Обход дерева");
        tree.inOrder();

    }

    public static void main(String[] args) {
        Task();
    }

}