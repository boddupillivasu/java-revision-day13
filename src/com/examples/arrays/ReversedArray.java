package com.examples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReversedArray {
    public static void main(String[] args) {

        //array
        Integer  [] num = {1,4,5,6};

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(num));

        Collections.reverse(arrayList);
        System.out.println("the reversed array:"+arrayList);

        System.out.println("----by using java 8 features----");
        Integer[] array = {1, 2, 3, 4, 5};

        // Reverse the array
        Arrays.sort(array, Collections.reverseOrder());

        // Print the reversed array
        System.out.println(Arrays.toString(array));
    }
}
