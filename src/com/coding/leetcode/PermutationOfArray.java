package com.coding.leetcode;

//Q:https://leetcode.com/problems/build-array-from-permutation/
public class PermutationOfArray {

	public static void main(String[] args) {
		int nums[]= {5,0,1,2,3,4};
		int result[]=buildArray(nums);
		for(int r :result)
			System.out.println(r);

	}
    public static int[] buildArray(int[] nums) {
        int ans[ ] =new int[nums.length];   
        for(int i =0;i<nums.length;i++)
        {
        	ans[i]=nums[nums[i]];
        }
        
        return ans;
       }

}
