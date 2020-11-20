import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.printf("=========== Task2.1 ===========%n");
        Task2_1.Task();

        System.out.printf("=========== Task2.2 Линейный и бинарный поиск ===========%n");
        Task2_2.Task();

        int[] array = ArrayHelper.createArray(400);
        System.out.println(Arrays.toString(array));

        System.out.printf("=========== Task2.3 Arrays.sort ===========%n");
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Task2_3.Task(arrayCopy);

        System.out.printf("=========== Task2.4 Пузырьковая сортировка ===========%n");
        arrayCopy = Arrays.copyOf(array, array.length);
        Task2_4.Task(arrayCopy);

        System.out.printf("=========== Task2.5 Сортировка выбором ===========%n");
        arrayCopy = Arrays.copyOf(array, array.length);
        Task2_5.Task(arrayCopy);

        System.out.printf("=========== Task2.6 Сортировка вставкой ===========%n");
        arrayCopy = Arrays.copyOf(array, array.length);
        Task2_6.Task(arrayCopy);
    }
}