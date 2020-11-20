package ru.leonov.list;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        int result = this.name.compareTo(person.name);
        if (result == 0) {
            result = Integer.compare(this.age, person.age);
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %d;", name, age);
    }
}