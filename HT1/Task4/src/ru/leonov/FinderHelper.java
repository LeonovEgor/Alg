package ru.leonov;

public class FinderHelper {

    public static int findStringItem(String lookingItem, String[] source) {
        int itemCount = -1;

        for (int index = 0; index < source.length; index++) {
            if (lookingItem.equals(source[index])) {
                itemCount = index;
                break;
            }
        }

        return itemCount;
    }

    public static int findIntItem(int lookingItem, int[] source) {
        int itemCount = -1;

        for (int index = 0; index < source.length; index++) {
            if (lookingItem == source[index]) {
                itemCount = index;
                break;
            }
        }

        return itemCount;
    }

    public static int findMyClassItem(Person lookingItem, Person[] source) {
        int itemCount = -1;

        for (int index = 0; index < source.length; index++) {
            if (lookingItem.compareTo(source[index]) == 0) {
                itemCount = index;
                break;
            }
        }

        return itemCount;
    }

}