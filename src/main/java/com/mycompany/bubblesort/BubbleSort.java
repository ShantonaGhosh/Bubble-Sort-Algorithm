package com.mycompany.bubblesort;

public class BubbleSort {

    public static void printArray(String message, int arr[]) {
        System.out.print(message + " --> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, 6, 1, 5, 9, 1}; //length --> 7

        for (int i = 0; i < arr.length - 1; i++) { // 6<(7-1) --> 6 < 6 --> 0-i-5 
            for (int j = 0; j < arr.length - i - 1; j++) {
                //i (0) --> (7-0-1) --> 6 --> 0-j-5
                //i (1) --> (7-1-1) --> 5 --> 0-j-4
                //i (2) --> (7-2-1) --> 4 --> 0-j-3
                //i (3) --> (7-3-1) --> 3 --> 0-j-2
                //i (4) --> (7-4-1) --> 2 --> 0-j-1
                //i (5) --> (7-4-1) --> 1 --> 0-j-0

                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                printArray("Inner loop j=" + j + " i=" + i, arr);
            }

            System.out.print("\n-------\n");
            printArray("Outer loop i=" + i, arr);
            System.out.print("\n-------\n");

        }

        printArray("\n \n \nFinal Result", arr);
    }
}
