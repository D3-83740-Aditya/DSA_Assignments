package com.sunbeam;

import java.util.Arrays;

//Q3. Write a program to print no of comparisions done to search a key in 

public class SearchComparision {

	// i. linear search
	public static int linearSearch(int[] arr, int key) {
		int comparisons = 0;
		for (int i = 0; i < arr.length; i++) {
			comparisons++;
			if (arr[i] == key) {
				System.out.println("Key found at index " + i + " after " + comparisons + " comparisons.");
				return i;
			}
		}
		System.out.println("Key not found after " + comparisons + " comparisons.");
		return -1;
	}

	// ii. binary serach
	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1, comparisons = 0;
		while (left <= right) {
			comparisons++;
			int mid = left + (right - left) / 2;
			if (arr[mid] == key) {
				System.out.println("Key found at index " + mid + " after " + comparisons + " comparisons.");
				return mid;
			}
			if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println("Key not found after " + comparisons + " comparisons.");
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int key = 10;

		System.out.println("Linear search comparisions:");
		linearSearch(arr, key);
		System.out.println("-----------------------------------------");
		System.out.println("Binary search comparisions:");
		binarySearch(arr, key);
	}
}
