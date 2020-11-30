package ru.leonov.utils;

import java.lang.reflect.Field;

public class ReflectionHelper {
    public static <T> Field[] getFieldsName(Object object) {
        return object.getClass().getFields();
    }

    public static void printFields(Field[] fields, Object object) {
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                System.out.printf("%s = %s", field.getName(), field.get(object));
            } catch (IllegalAccessException e) {
                System.out.printf("Поле %s недоступно%n", field.getName());
            }
        }
    }

    public static void printFields(Object object) {
        printFields(getFieldsName(object.getClass()), object);
    }
}
