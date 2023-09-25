package com.coding.leetcode;

//Q:https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerThanCurrent {

	public static void main(String[] args) {
	int nums[]= {8,1,2,2,3};
	int result[] =smallerNumbersThanCurrent(nums);
	for(int r : result)
		System.out.println(r);
	}
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[]= new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {   
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j] && j!=i)
                count++;
            }
            ans[i]+=count;

        } 
      return ans;
     }
}
