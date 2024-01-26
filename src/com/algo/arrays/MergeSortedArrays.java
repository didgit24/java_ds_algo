package com.algo.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MergeSortedArrays {
    void mergedSortedArrays(int input1 [], int input2 []) {
        int[] mergedArray = new int[input1.length + input2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // traverse the arr1 and insert its element in arr3
        while(i < input1.length){
            mergedArray[k++] = input1[i++];
        }

        // now traverse arr2 and insert in arr3
        while(j < input2.length){
            mergedArray[k++] = input2[j++];
        }

        // sort the whole array arr3
        Arrays.sort(mergedArray);
        System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
    }

    void mergedSortedArraysUsingMap(int input1 [], int input2 []) {
        // Declaring a map.
        // using map as a inbuilt tool
        // to store elements in sorted order.
        Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();

        // Inserting values to a map.
        for(int i = 0; i < input1.length; i++)
        {
            mp.put(input1[i], true);
        }
        for(int i = 0;i < input2.length;i++)
        {
            mp.put(input2[i], true);
        }

        // Printing keys of the map.
        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }

    public static void main(String[] args) {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        int[] firstArray = {1,4,6};
        int[] secondArray = {3,4,10};

        mergeSortedArrays.mergedSortedArrays(firstArray, secondArray);

        mergeSortedArrays.mergedSortedArraysUsingMap(firstArray, secondArray);
    }
}
