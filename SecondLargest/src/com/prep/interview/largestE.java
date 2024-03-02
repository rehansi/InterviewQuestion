package com.prep.interview;

public class largestE {
	public static void main(String[] args) {
		int[] Array = { 10,10,10 , 9};
		
		int Secondlargest = print2largest(Array);
		System.out.println("The 2nd largest element is: " + Secondlargest);
	}

	private static int largest(int[] Array) {
		int largest = 0;
		for (int i = 1; i < Array.length; i++) {

			if (Array[i] > largest) {
				largest = Array[i];
			}

		}
		return largest;

	}

	private static int print2largest(int[] Array) {
		int largest = largest(Array);
		int secondLargest = -1;

		for (int i = 0; i < Array.length; i++) {
			if (Array[i] != largest && Array[i] > secondLargest) {
				secondLargest = Array[i];
			}
		}

		return secondLargest;
	}

}
