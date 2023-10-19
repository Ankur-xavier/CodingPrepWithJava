package com.coding.leetcode;

//Q:https://leetcode.com/problems/apply-operations-to-an-array/
public class ArrayOperation {

	public static void main(String[] args) {
		int nums[]= {1,2,2,1,1,0};
		int result[]=applyOperations(nums);
		for(int r : result)
		System.out.println(r);
		

	}
    public static int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
         if(nums[i]==nums[i+1])
         {nums[i]*=2;
          nums[i+1]=0;}

        }
        int result[]=movezero(nums);
        return result;
    }
    public static int[] movezero(int nums[])
    {
          int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
        return nums;
    }
}
