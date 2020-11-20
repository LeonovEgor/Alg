import java.util.Arrays;

public class Task2_5 {
//    Задание 2.5
//    На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом выбора.
//    Оцените сортировку с помощью базового класса System.nanoTime().
//    Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3 и 2.4.
    public static void Task(int[] array) {

        long startValue = System.nanoTime();
        ArrayHelper.selectSort(array);
        long time = System.nanoTime() - startValue;

        System.out.println(Arrays.toString(array));
        System.out.printf("Sorted in %d ns%n", time);
    }
}
