package com.sunbeam;

//Q2. Write a linear search algorithm to return index of last occurance of key.

public class LinearSearch {
    public static int findLastOccurrence(int[] arr, int key) {
        int lastIndex = -1; // Initialize to -1 to indicate that the key is not found initially
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i; // Update lastIndex whenever the key is found
            }
        }
        return lastIndex; // Return the last found index, or -1 if not found
    }

    public static void main(String[] args) {
    	int[] arr = {1, 3, 5, 7, 9, 5, 3, 5, 8, 5};
        int key = 5;
        int lastIndex = findLastOccurrence(arr, key);
        if (lastIndex != -1) {
            System.out.println("The last occurrence of " + key + " is at index " + lastIndex);
        } else {
        	System.out.println(key + " is not found in the array.");
        }
    }
}