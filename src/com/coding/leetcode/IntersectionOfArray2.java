package com.coding.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Q:https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionOfArray2 {

	public static void main(String[] args) {
		int []nums1 = {1,2,2,1};
		int []nums2 = {2,2};
		int result []=intersect(nums1,nums2);
		for(int r : result)
			System.out.println(r);


	}
    public  static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1=new ArrayList<Integer>();
         Map<Integer,Integer> map = new HashMap<>();
         for(int i:nums1)
         {
             int freq=map.getOrDefault(i,0);
             map.put(i,freq+1);

         }
         for(int i:nums2)
         {
        if(map.get(i)!=null && map.get(i)>0)
        {
            list1.add(i);
            map.put(i,map.get(i)-1);
        }


         }

        int[] ans = new int[list1.size()];
        int idx=0;
        for(int i : list1)
        {ans[idx++]=i;}
        return ans;
    }
}
