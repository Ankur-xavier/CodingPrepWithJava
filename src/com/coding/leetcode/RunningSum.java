package com.coding.leetcode;

//Q2:https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum {

	public static void main(String[] args) {
		int [] nums= {1,2,3,4};
		int arr[]=runningSum(nums);
		for(int a : arr)
		{
			System.out.print(a +" ");
		}

	}
	 public static int[] runningSum(int[] nums) {
	      int runningSum[]=new int[nums.length];
	      int sum=0;
	      for(int i =0;i<nums.length;i++)
	      {
	        
			sum+=nums[i];
	         runningSum[i]=sum;
	      }  
	      return runningSum;
	    }

}
