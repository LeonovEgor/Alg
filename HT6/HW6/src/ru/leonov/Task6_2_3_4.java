package ru.leonov;

import ru.leonov.person.Person;
import ru.leonov.tree.MyTree;
import ru.leonov.tree.Node;

//Задание 6.2
//Реализуйте класс узла дерева и базовый шаблон дерева с базовыми методами.
//Задание 6.3
//Реализуйте методы поиска и вставки узла в дерево.
//Задание 6.4
//Реализуйте базовые методы обхода дерева и метода дисплей.
//Реализуйте поиск максимума и минимума.
public class Task6_2_3_4 {


    public static void Task() {
        MyTree<Person> tree = new MyTree<>();

        Person vasiliy = new Person(10, "Vasiliy", 30);
        try {
            tree.insert(new Person(6, "Ivan", 25));
            tree.insert(vasiliy);
            tree.insert(new Person(14, "Fedor", 13));
            tree.insert(new Person(3, "Katya", 17));
            tree.insert(new Person(5, "Sveta", 14));
            tree.insert(new Person(15, "Galina", 43));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.printf("Поиск : %s", vasiliy.getString());
        Node<Person> node = tree.find(vasiliy);
        if (node != null) System.out.printf("Найден : %s", node.item.getString());
        else System.out.println("null");

        Person minPerson = tree.min();
        System.out.printf("Min(3): %s", minPerson.getString());

        Person maxPerson = tree.max();
        System.out.printf("Max(15): %s", maxPerson.getString());

        System.out.println("Обход дерева");
        tree.inOrder();
    }

    public static void main(String[] args) {
        Task();
    }
}
