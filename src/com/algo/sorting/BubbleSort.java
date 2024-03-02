package com.algo.sorting;

// Java program for implementation
// of Bubble Sort
class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;

        // Time complexity O(n^2), not creating any new variables so
        // space complexity O(1)
        for (int i = 0; i < n - 1; i++) //O(n)
            for (int j = 0; j < n - i - 1; j++) //O(n)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
