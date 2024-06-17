package com.sunbeam;

//Q9. Write a selection sort function to sort array and returns no of comparisions.

public class SelectionSort {

	public static int selectionSort(int[] arr) {
		int n = arr.length;
		int comparisons = 0;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				comparisons++;
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap the found minimum element with the first element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		return comparisons;
	}

	public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
//		int[] arr = { 12, 6, 22};
		int comparisons = selectionSort(arr);

		System.out.println("Sorted array:");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println("\nNumber of comparisons: " + comparisons);
	}
}
