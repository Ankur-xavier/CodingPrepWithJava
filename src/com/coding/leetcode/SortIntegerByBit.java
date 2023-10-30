package com.coding.leetcode;

import java.util.Arrays;

public class SortIntegerByBit {

	public static void main(String[] args) {
	 int[] arr= {0,1,2,3,4,5,6,7,8};
	 int res[]= sortByBits(arr);
	 for(int r : res)
		 System.out.println(r);

	}
    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
         int res[] = new int[n];
         for (int i = 0; i < n; i++) {
             res[i] = countBit(arr[i]) * 10001 + arr[i];
         }
         Arrays.sort(res);
         for (int i = 0; i < n; i++) {
             res[i] %= 10001;
         }
         return res;
     }

     private static int countBit(int n) {
         int res = 0;
         while (n != 0) {
             res += (n & 1);
             n >>= 1;
         }
         return res;
     }
}
