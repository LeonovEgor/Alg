package ru.geekbrains.lessons.lesson_b;


import java.util.Arrays;
import java.util.Random;

public class ArraysHomeWork {

   static final float TIME_CONSTANT = 0.000000000000001f;
   static final int SIZE = 10;
   static final int HUGE_SIZE = 400;
   static int NUMBER_TO_FIND = 3;
   static int[] array = new int[SIZE];
   static int[] bigArray = new int[HUGE_SIZE];
   static int[] arrayCopy;
   static Random random = new Random();


   public static void randomValues(int[] array){
       for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(array.length);
       }
   }

   public static void linearSearch(int[] array, int number){
       for (int i = 0; i < array.length; i++) {
           if(array[i] == number) {
               System.out.printf("The number %s is found, index of number is %s.\n", number, i); // специально сделал, чтобы
           }                                                                                     // выводило при каждом обнаружении
       }                                                                                         // числа
   }

   public static int binarySearch(int[] array, int number){
       int firstIndex = 0;
       int lastIndex = array.length - 1;
       while(firstIndex <= lastIndex){
           int middleIndex = (firstIndex + lastIndex) / 2;
           if(array[middleIndex] == number) return middleIndex;
           else if(array[middleIndex] < number) firstIndex = middleIndex + 1;
           else if(array[middleIndex] > number) lastIndex = middleIndex - 1;
       }
       return 0;
   }

   public static void swapElements(int[] array, int first, int last){
       int buff = array[first];
       array[first] = array[last];
       array[last] = buff;
   }

   public static void bubbleSort(int[] array){
       for (int i = array.length - 1; i >= 1 ; i--) {
           for (int j = 0; j < i; j++) {
               if(array[j] > array[j + 1]) swapElements(array, j, j +1);
           }
       }
   }

   public static void changeSort(int[] array){
       for (int i = 0; i < array.length - 1; i++) {
           int min = i;
           for (int j = i + 1; j < array.length; j++) {
               if(array[j] < array[min]) min = j;
           }
           swapElements(array, i, min);
       }
   }

   public static void insertSort(int[] array){
       int buff;
       int in;
       for (int i = 1; i < array.length; i++) {
           buff = array[i];
           in = i;
           while (in > 0 && array[in - 1] >= buff){
               array[in] = array[in - 1];
               --in;
           }
           array[in] = buff;
       }
   }

   private static float setTime() {
       return System.nanoTime() * TIME_CONSTANT;
    }

    public static void main(String[] args) {
       //task 2.1
        randomValues(array);
        setTime();
        System.out.println(Arrays.toString(array));
        arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(arrayCopy));
        System.out.println(Arrays.equals(array, arrayCopy));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.equals(array, arrayCopy));
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        //task 2.2
        linearSearch(array, NUMBER_TO_FIND);
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        setTime();
        System.out.printf("The number is found, index of number is %s.\n", binarySearch(array, NUMBER_TO_FIND));
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        //task 2.3
        randomValues(bigArray);
        System.out.println(Arrays.toString(bigArray));
        setTime();
        Arrays.sort(bigArray);
        System.out.println(Arrays.toString(bigArray));
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        //task 2.4
        randomValues(bigArray);
        System.out.println(Arrays.toString(bigArray));
        setTime();
        bubbleSort(bigArray);
        System.out.println(Arrays.toString(bigArray));
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        //task 2.5
        randomValues(bigArray);
        System.out.println(Arrays.toString(bigArray));
        setTime();
        changeSort(bigArray);
        System.out.println(Arrays.toString(bigArray));
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
        //task 2.6
        randomValues(bigArray);
        System.out.println(Arrays.toString(bigArray));
        setTime();
        insertSort(bigArray);
        System.out.println(Arrays.toString(bigArray));
        System.out.println((System.nanoTime() - setTime()) * TIME_CONSTANT);
    }


}
