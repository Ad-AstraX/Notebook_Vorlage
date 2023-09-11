package control;

import model.User;

public class ArrayController {

    public ArrayController () {

    }

    public static <T> T[] createElement(T[] array, T element, int count) {
        if (count < array.length) {
            array[count] = element;
            return array;
        }
        return null;
    }
}
