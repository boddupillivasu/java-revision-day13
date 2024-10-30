package com.examples.arrays;

public class FindSmallAndLargeValue {
    public static void main(String[] args) {


        int[] array = {123, 45, 7, 5, 43, 44};

        int smallestValue = array[0];
        int largestValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            } else if (array[i] > largestValue) {
                largestValue = array[i];
            }

        }

        System.out.println("the largest value:" + largestValue);
        System.out.println("the smallest value:" + smallestValue);
    }
}
