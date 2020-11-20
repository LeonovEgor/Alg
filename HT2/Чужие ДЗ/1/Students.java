package ru.geekbrains;

public class Students {
    protected int age;
    protected String name;

    // Конструктор класса
    public Students (String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
