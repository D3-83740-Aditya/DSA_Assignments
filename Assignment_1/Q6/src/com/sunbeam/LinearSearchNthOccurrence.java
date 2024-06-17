package com.sunbeam;

//Q6. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is not found, return -1.

public class LinearSearchNthOccurrence {

    public static int findNthOccurrence(int[] arr, int target, int n) {
        int occurrenceCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                occurrenceCount++;
                if (occurrenceCount == n) {
                    return i;
                }
            }
        }
        
        return -1; // If nth occurrence is not found
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1, 3, 2, 1};
        int target = 1;
        int n = 2;
        
        int result = findNthOccurrence(array, target, n);
        
        if (result != -1) {
            System.out.println("The " + n + " occurrence of " + target + " is at index: " + result);
        } else {
            System.out.println("The " + n + " occurrence of " + target + " is not found.");
        }
    }
}
