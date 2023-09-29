package com.coding.leetcode;

import java.util.HashMap;
import java.util.Map;

//Q:https://leetcode.com/problems/two-sum/description/
public class TwoSum {

	public static void main(String[] args) {
		int nums[]= {3,3};
		int target=6;
		int result[]=twoSum(nums,target);
		for(int r: result)
		System.out.println(r);
		int result2[]=twoSumOptimized(nums,target);
		for(int r2: result2)
		System.out.println(r2);
	}

	//brute force approach with 0(n^2) time 
	
	 public static int[] twoSum(int[] nums, int target) {
	      int ans[]=new int[2];
	      for(int i=0;i<nums.length;i++)
	      {
	    	  
	    	  for(int j=i+1;j<nums.length;j++)
	    	  {
	    		  
	    		  if(nums[i]+nums[j]==target)
	    		  {
	    			  ans[0]=i;
	    			  ans[1]=j;
	    		  }
	    	  }
	      }
	      
	      
	      return ans;
		 
		 
	    }
		private static int[] twoSumOptimized(int[] nums, int target) {
			Map<Integer,Integer>sum = new HashMap<>();
			for(int i=0;i<nums.length;i++)
			{
				sum.put(i, nums[i]);
				
			}
			for(int i =0; i<nums.length;i++)
			{
				int diff=target-nums[i];
				if(sum.containsKey(diff) && sum.get(diff)!=i)
					return new int[] {i,sum.get(diff)};	
				
				
			
			}
				return new int[] {};
		

}}
