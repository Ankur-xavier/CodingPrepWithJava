package com.coding.leetcode.contest;

public class IndexValueDifference {

	public static void main(String[] args) {
		int nums[] = {0};
		int indexDifference = 0, valueDifference = 0;
		int result[]=findIndices(nums,indexDifference,valueDifference);
		for(int r :result)
			System.out.println(r);
		
	}
    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for(int i=0;i<nums.length;i++)
        for(int j=0;j<nums.length;j++)
        {
            if((Math.abs(i-j)>=indexDifference) &&(Math.abs(nums[i]-nums[j])>=valueDifference) )
            {
            	return new int[] {i,j};
            }
            
            
        }
        return new int[] {-1,-1};
        
    }
}
