package com.coding.leetcode;

//Q3:https://leetcode.com/problems/concatenation-of-array/
public class ConcatenationOfArray {

	public static void main(String[] args) {
		int nums[]= {1,2,1};
		int result[]=getConcatenation(nums);
		for(int r : result)
		{
			System.out.print(r);
		}

	}
   
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2*n];
        for(int i =0;i<n;i++)
        {
            ans[i]=nums[i];
        }
            for(int i =0;i<n;i++)
        {
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
