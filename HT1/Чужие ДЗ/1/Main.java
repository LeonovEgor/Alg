package AlgorithmJava.lesson.one;

/*
Задание 1.1
Приведите пример алгоритмов и структур данных из жизни.
Приготовления чая:
1. Вскипятить чайник.
2. Взять кружку и заварку.
3. Налить заварку, затем воду.
4. Добавить сахар.
5. Перемешать.

Запуск автомобиля:
1. Открыть авто.
2. Сесть на водительское место.
3. Вставить ключ зажигания в замок зажигания.
4. Повернуть ключ по часовой стрелке до срабатывания стартера и запуска двигателя и отпустить ключ.

Задание 1.2
Приведите пример алгоритмов и структур данных в программировании.
Структуры данных:
1. Массивы
2. Стеки
3. Очереди
4. Связанные списки
5. Деревья
6. Хэш таблицы

Алгоритм полного перебора (поиск элемента в массиве):
1. Сравнить первый элемент массива с тем что ищем
2. Если первый элемент не тот, то сравниваем со вторым элементом
....
и т.д. пока не найдет искомый элемент или не достигнут конец массива

Запись в файл:
1. Ищем файл
2. Открываем файл
3. Записываем данные в файл
4. Закрываем файл

Задание 1.3
Напишите программный код, в котором все данные хранятся только в переменных трех типов данных: Ссылочные, примитивные и своего класса
 содержащего: конструктор и метод отображения данных.
Выведите написанные данные.
Задание 1.4
Дополните предыдущий код сравнением ваших данных с другой переменной, данный код должен имитировать простейший поиск перебором.
Оцените время выполнения алгоритма с помощью базового метода System.nanoTime().
 */


import java.util.Arrays;

public class Main {
    public static long start;
    public static long finish;

    public static boolean teBeoNotToBe (String[] s, MyClass mC){
        start = System.nanoTime();
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(mC.getMyVarString())){
                finish = System.nanoTime();
                return true;
            }
        }
        finish = System.nanoTime();
        return false;
    }
    public static boolean teBeoNotToBe (int[] a, MyClass mC){
        start = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == mC.getMyVarInt()){
                finish = System.nanoTime();
                return true;
            }
        }
        finish = System.nanoTime();
        return false;
    }

    private static class MyClass {
        private String myVarString;
        private int myVarInt;
        private MyClass(String myVarString, int myVarInt){
            this.myVarInt = myVarInt;
            this.myVarString = myVarString;
        }

        public int getMyVarInt() {
            return myVarInt;
        }

        public String getMyVarString() {
            return myVarString;
        }
    }

    public static void main (String[] args){
        String varString[] = {"string1", "string2", "string3"};
        int varInt[] = {1, 2, 3};
        MyClass myVar1 = new MyClass("string1", 11);
        System.out.println(Arrays.toString(varString));
        System.out.println(Arrays.toString(varInt));
        System.out.println(myVar1.getMyVarString());
        System.out.println(myVar1.getMyVarInt());
        System.out.println(teBeoNotToBe(varString, myVar1) + "; Time = " + (finish - start));
        System.out.println(teBeoNotToBe(varInt, myVar1) + "; Time = " + (finish - start));
    }
}
