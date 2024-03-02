package com.interview.prep;

public class TwoSum {
	public static void main(String[] args) {
		int target = 7;
		int[] Array = { 1, 2, 3, 4, 5 };
		boolean result = pairsum(Array, target);
		System.out.println(result);

	}

	private static boolean pairsum(int[] Array, int target) {
		
		for(int i =0 ; i<Array.length ; i++) {
			for(int j=i+1 ; j<Array.length ; j++) {
				if(Array[i] + Array[j] == target) {
					return true;
				}
			}
		}
		return false;
		
	}

}
