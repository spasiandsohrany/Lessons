package Practisechek;

import java.util.Arrays;

public class DynamicArray<T> {
    T[] array = (T[]) new Object[10];
    int size;

    void add(T el) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = el;
        size++;
    }

    T get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    void remove(int index) {
        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
        size--;
    }

    public int size() {
        return size;
    }
}
