package com.coding.leetcode.Medium;

//Q:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstLastElement {

	public static void main(String[] args) {
		int nums[]= {5,7,7,8,8,10};
		int target=8;
		int result[]=searchRange(nums,target);
		for(int r : result)
		{
			System.out.println(r);
		}

	}
	public static int[] searchRange(int[] nums, int target) {
		   int ans[]={-1,-1};
		    int left=binarySearch(nums,target,true);
		    int right=binarySearch(nums,target,false);
		    ans[0]=left;
		    ans[1]=right;

		   return ans;
		    }

		   public static int binarySearch(int []nums,int target,boolean index)
		   { int start = 0;
		     int end = nums.length - 1;
		    int ans=-1;
		    while (start <= end) {
		        int mid = start + (end - start) / 2;
		        
		        if (nums[mid] < target)
		            start = mid + 1;
		        else if(nums[mid]>target)
		             end=mid-1 ;
		        else 
		        { ans=mid ; 
		          if(index)
		          end=mid-1;
		          else
		          start=mid+1;
		        
		        }
		        }
		        return ans;
		        }
}
