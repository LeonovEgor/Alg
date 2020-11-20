import java.util.Arrays;

public class Task2_2 {

    // Задание 2.2
    //На основе написанного кода в задании 2.1 реализуйте линейный и двоичный поиск.
    //Оценить алгоритмы линейного и двоичного поиска с помощью базового класса System.nanoTime(),
    // при необходимости расширьте уже существующий массив данных.
    public static void Task() {

        int[] array = ArrayHelper.createArray(25);
        System.out.println(Arrays.toString(array));

        int value = array[15];

        linearSearch(value, array);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        binarySearch(value, array);

    }

    private static void linearSearch(int lookingItem, int[] array) {
        long startValue = System.nanoTime();
        int index = ArrayHelper.linearSearch(lookingItem, array);
        long time = System.nanoTime() - startValue;
        System.out.printf("linearSearch. Index of %d is %d. Found in %d ns%n", lookingItem, index, time);
    }

    private static void binarySearch(int lookingItem, int[] array) {
        long startValue = System.nanoTime();
        int index = ArrayHelper.binarySearch(lookingItem, array);
        long time = System.nanoTime() - startValue;
        System.out.printf("binarySearch. Index of %d is %d. Found in %d ns%n", lookingItem, index, time);
    }

}