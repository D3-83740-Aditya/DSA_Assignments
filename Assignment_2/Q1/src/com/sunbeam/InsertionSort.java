package com.sunbeam;

import java.util.Arrays;

//Q1. Write a insertion sort function to sort array and returns no of comparisions.

public class InsertionSort {

	public static int insertionSort(int arr[], int n) {
		int comparisions = 0;
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
				comparisions++;
			}
			arr[j + 1] = temp;
		}
		return comparisions;
	}

	public static void main(String[] args) {
//		int arr[] = { 77, 55, 11 };
		int arr[] = { 77, 55, 11, 59, 100, 85 };
		System.out.println("Array before sort : " + Arrays.toString(arr));
		int com = insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
		System.out.println("Comparisions: " + com);
	}

}
