import java.util.Arrays;

public class Task2_4 {
//    Задание 2.4
//    На основе существующего массива данных из задания 2.3 реализуйте алгоритм сортировки пузырьком.
//    Оцените сортировку с помощью базового класса System.nanoTime().
//    Сравните время выполнения алгоритмы сортировки методом sort() из задания 2.1 и сортировку пузырьком.
    public static void Task(int[] array) {

        long startValue = System.nanoTime();
        ArrayHelper.bubbleSort(array);
        long time = System.nanoTime() - startValue;

        System.out.println(Arrays.toString(array));
        System.out.printf("Sorted in %d ns%n", time);
    }
}
