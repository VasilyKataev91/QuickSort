package ru.vasilyKataev.QuickSort;

import java.util.Arrays;

public class Sort {

    public static void qsort(Integer[] array){
        if(array.length <= 1 && array == null) return;
        DeepCounter deepCounter = new DeepCounter();
        Sort.quicksort(array ,  0,  array.length - 1, deepCounter);
    }

    private static void quicksort(Integer[] array, int leftBorder, int rightBorder, DeepCounter deepCounter) {
        deepCounter.in(leftBorder, rightBorder);

        if (leftBorder >= rightBorder){
            deepCounter.out(leftBorder, rightBorder);
            return;
        }

        int pivotIndex = rightBorder;
        int pivot = array[pivotIndex];

        int currentLeft = leftBorder, currentRight = rightBorder;
        while (currentLeft <= currentRight) {

            while (array[currentLeft] < pivot) {
                currentLeft++;
            }

            while (array[currentRight] > pivot) {
                currentRight--;
            }

            if (currentLeft <= currentRight) {
                swap(array, currentLeft, currentRight);
                currentLeft++;
                currentRight--;
            }
        }

        if (leftBorder < currentRight){
            quicksort(array, leftBorder, currentRight, deepCounter);
        }

        if (rightBorder > currentLeft){
            quicksort(array, currentLeft, rightBorder, deepCounter);
        }
        deepCounter.out(leftBorder, rightBorder);
    }

    private static void swap(Integer[] array, int i, int j) {
        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
