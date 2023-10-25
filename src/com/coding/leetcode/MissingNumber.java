package com.coding.leetcode;

//Q:https://leetcode.com/problems/missing-number/

public class MissingNumber {

	public static void main(String[] args) {
	int nums[]= {9,6,4,2,3,5,7,0,1};
	System.out.println(missingNumber(nums));

	}
    public static int missingNumber(int[] nums) {
        int n = nums.length;
 int totalSum = n*(n+1)/2;
  int sum = 0;
  for(int i =0;i<n;i++){
      sum = sum+nums[i]; 
  }
  return totalSum - sum;  
}
}
