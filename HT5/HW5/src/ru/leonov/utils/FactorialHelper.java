package ru.leonov.utils;

public class FactorialHelper {

    public static long recursionFactorial(int n) {
        if (n == 1) return 1;
        return n * recursionFactorial(n-1);
    }

    public static long recursionFactorialPrint(int n) {
        if (n == 1) {
            StackTraceHelper.printStack();
            return 1;
        }
        return n * recursionFactorialPrint(n-1);
    }

    public static long cycleFactorial(int i) {
        long res = i;
        while (i > 1) {
            res *= --i;
        }
        return res;
    }

}