package com.coding.leetcode;

//Q:https://leetcode.com/problems/shuffle-the-array/
public class ShuffleArray {

	public static void main(String[] args) {
		int nums[]= {2,5,1,3,4,7};
		int n=3;
     int result[]=shuffle(nums,n);
     
     for(int r: result)
     {
    	 System.out.println(r);
     }
	}
    public static  int[] shuffle(int[] nums, int n) {
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int result[] =new int[nums.length];
        for(int i = 0;i<n;i++) {
        	arr1[i]=nums[i];
        	arr2[i]=nums[i+n];
    } 
         int index=0;
        for (int i = 0; i < arr1.length; i++) {
            result[index++] = arr1[i];
            result[index++] = arr2[i];
        }
			
     return result;    
    }

}
