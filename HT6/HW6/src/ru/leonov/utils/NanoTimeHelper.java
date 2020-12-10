package ru.leonov.utils;

public class NanoTimeHelper {
    private static long startValue;

    public static void start() {
        startValue = System.nanoTime();
    }

    public static void printTime(String text) {
        long time = System.nanoTime() - startValue;
        System.out.printf("%s. Прошло %d нс%n", text, time);
    }
}
