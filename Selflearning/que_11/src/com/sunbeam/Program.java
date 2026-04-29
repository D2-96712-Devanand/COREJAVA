package com.sunbeam;

public class Program {

    public static <T extends Number & Comparable<T>> T findMin(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 2, 7};
        Double[] doubleArray = {3.5, 11.2, 7.8, 2.5};

        System.out.println("Min Integer: " + findMin(intArray));
        System.out.println("Min Double: " + findMin(doubleArray));
    }
}
