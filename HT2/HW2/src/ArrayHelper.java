import java.util.Random;

public class ArrayHelper {

    public static int[] createArray(int arrCount) {
        int[] arr = new int[arrCount];
        Random rnd = new Random();
        for (int i = 0; i < arrCount; i++) {
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }

    public static int linearSearch(int lookingItem, int[] source) {
        int itemCount = -1;

        for (int index = 0; index < source.length; index++) {
            if (lookingItem == source[index]) {
                itemCount = index;
                break;
            }
        }

        return itemCount;
    }

    public static int binarySearch(int lookingItem, int[] array) {
        int left = 0;
        int right = array.length - 1;
        int half = (left + right) / 2;

        while (array[half] != lookingItem && left <= right) {
            if (array[half] > lookingItem) right = half - 1;
            else left = half + 1;

            half = (left + right) / 2;
        }

        return left <= right ? half : -1;
    }

    public static void bubbleSort(int[] array) {
        int max = array.length-1;
        while (max > 1) {
            for (int i = 1; i <= max; i++) {
                if (array[i] < array[i - 1])
                    swapItem(array, i, i-1);
            }
            max--;
        }
    }

    private static void swapItem(int[] intArr, int firstIndex, int secondIndex) {
        int temp = intArr[firstIndex];
        intArr[firstIndex] = intArr[secondIndex];
        intArr[secondIndex] = temp;
    }

    public static void selectSort(int[] array) {
        int startIndex = 0;
        while (startIndex < array.length) {
            int foundIndex = searchMin(array, startIndex);
            swapItem(array, startIndex, foundIndex);
            startIndex++;
        }
    }


    private static int searchMin(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void insertSort(int[] array) {
        int value;
        int index;
        for (int left = 0; left < array.length; left++) {
            value = array[left];
            index = left-1;

            while (index >= 0) {
                if (value < array[index])
                    array[index+1] = array[index];
                else break;

                index--;
            }

            array[index+1] = value;
        }
    }


}