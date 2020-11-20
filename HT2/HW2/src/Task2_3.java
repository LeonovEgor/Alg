import java.util.Arrays;

public class Task2_3 {
//    Задание 2.3
//    Создайте массив размером 400 элементов.
//    Выполните сортировку с помощью метода sort().
//    Оцените сортировку с помощью базового класса System.nanoTime().
    public static void Task(int[] array) {

        long startValue = System.nanoTime();
        Arrays.sort(array);
        long time = System.nanoTime() - startValue;

        System.out.println(Arrays.toString(array));
        System.out.printf("Sorted in %d ns%n", time);
    }
}
