package ru.leonov.person;

import ru.leonov.tree.IPrint;

public class Person implements Comparable<Person>, IPrint {
    private final long id;
    private final String name;
    private final int age;

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return Long.compare(this.id, person.id);
    }

    @Override
    public void print() {
        System.out.print(getString());
    }

    @Override
    public String getString() {
        return String.format("id=%d, name=%s, age=%d%n", id, name, age);
    }

}