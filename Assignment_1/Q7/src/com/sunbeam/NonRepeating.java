package com.sunbeam;

// Java program to find first non-repeating
// element.
class NonRepeating {

	static int firstNonRepeating(int arr[], int n) {
		// Loop for checking each element
		for (int i = 0; i < n; i++) {
			int j;
			// Checking if ith element is present in array
			for (j = 0; j < n; j++)
				if (i != j && arr[i] == arr[j])
					break;
			// if ith element is not present in array
			// except at ith index then return element
			if (j == n)
				return arr[i];
		}
		return -1;
	}

	// Driver code
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int n = arr.length;

		System.out.print(firstNonRepeating(arr, n));
	}
}