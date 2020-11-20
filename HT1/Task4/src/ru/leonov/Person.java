package ru.leonov;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPersonData() {
        return name + " " + String.valueOf(age);
    }

    @Override
    public int compareTo(Person person) {
        int result = this.name.compareTo(person.name);
        if (result == 0) {
            result = Integer.compare(this.age, person.age);
        }
        return result;
    }

}