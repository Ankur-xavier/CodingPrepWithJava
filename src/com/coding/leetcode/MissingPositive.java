package com.coding.leetcode;
//Q:https://leetcode.com/problems/kth-missing-positive-number/

import java.util.HashSet;
import java.util.Set;

public class MissingPositive {

	public static void main(String[] args) {
		int arr[]= {2,3,4,7,11};
		int k=5;
		System.out.println(findKthPositive(arr,k));
	}
    public static int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        Set<Integer>ans = new HashSet<Integer>();
        for(int i : arr)
        ans.add(i);
        int j=0;
        int num=0;
        for(int i=1;j<k;i++){
     
          if(!ans.contains(i))
          {
              num=i;
           j++;
          }


        }  
        return num; 
       }
}
