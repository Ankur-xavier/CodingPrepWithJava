package com.coding.leetcode.Medium;
//Q:https://leetcode.com/problems/find-the-duplicate-number/description/
//BinarySearch
public class FindDuplicate2 {

	public static void main(String[] args) {
		int nums[]= {1,2,3,7,7,5,6,4};
		System.out.println(findDuplicate_bs(nums));
	}
	 public static int findDuplicate_bs(int[] nums) {
	        int len = nums.length;
	        int low = 1;
	        int high = len - 1;
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            int cnt = 0;
	            for (int i = 0; i < len; i++) {
	                if (nums[i] <= mid) {
	                    cnt++;
	                }
	            }

	            if (cnt <= mid) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }

	        return low;
	    }
}
