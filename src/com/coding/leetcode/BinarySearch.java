package com.coding.leetcode;

//Q:https://leetcode.com/problems/binary-search/description/
public class BinarySearch {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7,8};
		int target=7;
	    System.out.println(search(nums,target));

	}
	public static int search(int[] nums, int target) {
        int first=0;
        int last =nums.length -1;
        while(first<=last)
        { int mid= first+(last-first)/2;
          
          if(nums[mid]==target)
          return mid;
          else if (nums[mid]>target)
          {
              last=mid-1;
          }
        else
        {
            first=mid+1;
        }
     
        }
     return -1;


    }
}
