/* Ответы на воросы */

/*
* 1. Примеры алгоритмов в жизни:
*       - сборка мебели
*       - заваривание чая/кофе
*       - приготовление пищи
*       - регистрация транспортного средства
*    Примеры структур данных в жизни:
*       - папка
*       - записная книжка
*       - телефонная книга
*/

/*
 * 2. Примеры алгоритмов в программировании:
 *      - поиск в ширину для графов
 *      - поиск в глубину для графов
 *      - сортировки
 *      - поиск подстроки в строке
 *    Примеры структур данных в программировании:
 *      - массивы
 *      - словари
 *      - деревья
 *      - списки
 */

package lesson1;

public class Main {

    private static class MyClass {
        private float value;

        public MyClass(float value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return Float.toString(value);
        }
    }

    public static void main(String[] args) {
        int primitiveVariable = 13;
        String referenceVariable = new String("Hello");
        MyClass aClass = new MyClass(1313.0F);

        System.out.println("Primitive variable value = " + primitiveVariable);
        System.out.println("Reference variable value = " + referenceVariable);
        System.out.println("MyClass value = " + aClass);

        if (referenceVariable.equals(primitiveVariable)) {
            System.out.println("Reference variable value was found at primitive variable");
        }
        else if (referenceVariable.equals(aClass)) {
            System.out.println("Reference variable value was found at MyClass");
        }
        else if (referenceVariable.equals(referenceVariable)) {
            System.out.println("Reference variable value was found at reference variable");
        }
        else {
            System.out.println("Reference variable value was not found!");
        }
    }
}
