package com.coding.leetcode.Medium;

//Q:https://leetcode.com/problems/single-element-in-a-sorted-array/description/

public class SingleElement {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 3, 4, 4, 10, 10 };
		System.out.println(singleNonDuplicate(nums));

	}

	public static int singleNonDuplicate(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (mid % 2 == 1)
				mid--;
			if (nums[mid] != nums[mid + 1])
				right = mid;
			else
				left = mid + 2;

		}
		return nums[left];

	}
}
