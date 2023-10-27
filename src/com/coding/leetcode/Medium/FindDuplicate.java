package com.coding.leetcode.Medium;
//Q:https://leetcode.com/problems/find-the-duplicate-number/description/
//bruteForce approach
public class FindDuplicate {

	public static void main(String[] args) {
		int nums[]= {1,2,3,7,7,5,20};
		System.out.println(findDuplicate(nums));

	}
    public static  int findDuplicate(int[] nums) {
        int len = nums.length;
           int[] cnt = new int[len + 1];
           for (int i = 0; i < len; i++) {
               cnt[nums[i]]++;
               if (cnt[nums[i]] > 1) {
                   return nums[i];
               }
           }

           return len;
       }
}
