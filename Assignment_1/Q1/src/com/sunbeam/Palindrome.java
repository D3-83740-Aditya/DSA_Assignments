package com.sunbeam;

//Q1. Write all possibilites to check palindrome. Also do time and space complexity analysis.

public class Palindrome {
	
	public static boolean isPalindromeString(String str) {
//		Algorithm:
//		1. Reverse the string.
//		2. Compare the original string with the reversed string.
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Time complexity:");
		System.out.println("Reversing the string takes O(n)time.");
		System.out.println("Comparing two strings takes O(n)time.");
		System.out.println("");
		System.out.println("Space complexity:");
		System.out.println("Storing the reversed string requires O(n)time.");
	    return str.equals(reversed);
	}

	public static boolean isPalindromeTwoPointer(String str) {
		
//		Algorithm:
//		1. Use two pointers, one at the beginning (left) and one at the end (right) of the string.
//		2. Move towards the center, comparing characters at left and right pointers.
		
		System.out.println("Time complexity: O(n)");
		System.out.println("Each character is compared at most once.");
		System.out.println("");
		System.out.println("Space complexity: O(1)");
		System.out.println("Only a constant amount of extra space is used.");
		
	    int left = 0;
	    int right = str.length() - 1;
	    while (left < right) {
	        if (str.charAt(left) != str.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}

	public static void main(String[] args) {
		Boolean	reverse = isPalindromeString("12");	
		System.out.println("Is palindrome: " + reverse);
		
		System.out.println("------------------------------");
		
		Boolean reverse_1 = isPalindromeTwoPointer("235");
		System.out.println("Is palindrome: " + reverse_1);
	}
}
