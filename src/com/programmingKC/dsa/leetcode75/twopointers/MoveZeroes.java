package com.programmingKC.dsa.leetcode75.twopointers;

public class MoveZeroes {
	    public void moveZeroes(int[] nums) {
	        int index = 0;

	        for(int num : nums){
	            if(num != 0){
	                nums[index++] = num;
	            }
	        }
	        while(index < nums.length){
	            nums[index++] = 0;
	        }
	    }
	}
