package com.coding.leetcode.contest;

import java.util.Arrays;

//Q:https://leetcode.com/problems/fair-candy-swap/description/

public class CandySwap {

	public static void main(String[] args) {
		int[] aliceSizes= {2};
		int[] bobSizes = {1,3};
	  int result[]	= fairCandySwap(aliceSizes,bobSizes);
	  for(int r : result)
		  System.out.println(r);

	}
	 public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		    int aliceTotal = 0;
		    int bobTotal = 0;
		    for (int candies : aliceSizes)
		      aliceTotal += candies;
		    for (int candies : bobSizes)
		      bobTotal += candies;
		    
		    Arrays.sort(bobSizes);
		    
		    int m = aliceSizes.length, n = bobSizes.length;
		    for (int i = 0; i < m; i++) {      
		      int target = (bobTotal + 2 * aliceSizes[i] - aliceTotal) / 2;
		      if (binarySearch(bobSizes, target))
		        return new int[] { aliceSizes[i], target };
		    }

		    return new int[0];
		  }

		  private static boolean binarySearch(int[] arr, int target) {
		    int l = 0, r = arr.length - 1;
		    while (l <= r) {
		      int m = l + (r - l) / 2;
		      if (target < arr[m])
		        r = m - 1;
		      else if (target > arr[m])
		        l = m + 1;
		      else
		        return true;
		    }
		    return false;
		  }
}
