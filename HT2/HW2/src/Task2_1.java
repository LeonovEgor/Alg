import java.util.Arrays;

public class Task2_1 {

    //Задание 2.1
    //На основе программного кода из домашнего задания №1 реализуйте массив на основе
    // существующих примитивных или ссылочных типов данных.
    //Выполните обращение к массиву и базовые операции класса Arrays.
    //Оценить выполненные методы с помощью базового класса System.nanoTime().
    public static void Task() {
        long startValue = System.nanoTime();

        int[] intArr = ArrayHelper.createArray(25);

        long time = System.nanoTime() - startValue;
        System.out.println(Arrays.toString(intArr) + " created in " + time + "ns");


        startValue = System.nanoTime();
        Arrays.sort(intArr);
        time = System.nanoTime() - startValue;

        System.out.println(Arrays.toString(intArr) + " sorted in " + time + "ns");

        int value = intArr[3];
        System.out.printf("Value of element 3 is %d%n", value);


        startValue = System.nanoTime();

        int index = Arrays.binarySearch(intArr, value);

        time = System.nanoTime() - startValue;
        System.out.printf("Index of element %d is %d found in %d%n", value, index, time);
    }
}
