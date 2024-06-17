//Q5. Implement binary search algorithm if array is sorted in descending order.

public class BinarySearchDescending {
	// Method to perform binary search on a descending sorted array
	public static int binarySearch(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if the key is present at mid
			if (array[mid] == key) {
				return mid; // key found
			}

			// If the key is greater, ignore the left half
			else if (array[mid] < key) {
				right = mid - 1;
			} else {
				// If the key is smaller, ignore the right half
				left = mid + 1;
			}
		}
		// key not found
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 100,90,80,70,50,10 };
		int key = 60;
		int result = binarySearch(array, key);

		if (result != -1) {
			System.out.println("Element found at index " + result);
		} else {
			System.out.println("Element not found in the array");
		}
	}
}
