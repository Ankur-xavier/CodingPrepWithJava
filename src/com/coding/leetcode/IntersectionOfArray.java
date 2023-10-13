package com.coding.leetcode;

import java.util.HashSet;
import java.util.Set;
//Q:https://leetcode.com/problems/intersection-of-two-arrays/

public class IntersectionOfArray {

	public static void main(String[] args) {
	int []nums1 = {1,2,2,1};
	int []nums2 = {2,2};
	int result []=intersection(nums1,nums2);
	for(int r : result)
		System.out.println(r);

	}
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>ans= new HashSet<Integer>();
      for(int i : nums1)
      ans.add(i);
   Set<Integer>intersection= new HashSet<Integer>();
      
   for(int i:nums2)
   {
       if(ans.contains(i))
       intersection.add(i);
   }
   int output[] = new int[intersection.size()];
   int idx=0;
   for(int i : intersection)
   {output[idx++]=i;}
   return output;

      }
}
