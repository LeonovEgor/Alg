package ru.leonov;

public class Main {

    public static void main(String[] args) {
        strOperation();
        intOperation();
        myClassOperation();
    }

    private static void strOperation() {
        String str = "my String";
        String[] strArr = {"str1", "str2", "str3", "str4", "str5","my String", "str7"};

        long startValue = System.nanoTime();
        int itemCount = FinderHelper.findStringItem(str, strArr);
        long time = System.nanoTime() - startValue;

        System.out.printf("my String at index: %d%n", itemCount);
        System.out.printf("found at %d nanoseconds%n", time);
    }

    private static void intOperation() {
        int value = 25;
        int[] intArr = {1, 2, 3, 4, 5, 25, 7};

        long startValue = System.nanoTime();
        int itemCount = FinderHelper.findIntItem(value, intArr);
        long time = System.nanoTime() - startValue;

        System.out.printf("value 25 at index: %d%n", itemCount);
        System.out.printf("found at %d nanoseconds%n", time);
    }

    private static void myClassOperation() {
        Person person = new Person("Petr", 25);
        Person[] personArr = {
                new Person("Fedor", 20),
                new Person("Petr", 23),
                new Person("Ivan", 19),
                new Person("Petr", 24),
                new Person("Olga", 18),
                new Person("Petr", 25),
                new Person("Masha", 33)
        };

        long startValue = System.nanoTime();
        int itemCount = FinderHelper.findMyClassItem(person, personArr);
        long time = System.nanoTime() - startValue;

        System.out.printf("%s at index: %d%n", person.getPersonData(), itemCount);
        System.out.printf("found at %d nanoseconds%n", time);
    }

}