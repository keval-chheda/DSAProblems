package com.programmingKC.dsa.algorithm;

public class BinarySearch {
	
	public static void main(String args[]) {
		int [] array = {1,2,3,4,5,6,7,8,9,0};
		BinarySearch.binarySearch(array, 8);
	}
	
 

	public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid; // Target found
            } else if (array[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }
    
  
}
