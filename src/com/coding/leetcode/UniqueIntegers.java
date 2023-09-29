package com.coding.leetcode;

//Q:https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class UniqueIntegers {

	public static void main(String[] args) {
		int num=5;
		int result[]=sumZero(num);
		for(int r: result)
			System.out.println(r);

	}
	  public static int[] sumZero(int n) {
		  int[] result = new int[n];
		    int sum = 0;
		  for (int i = 0; i < n-2; i++) {
		        result[i] = i + 1;
		        sum += result[i];
		    }

		    result[n-1] = -sum;
		    return result;
	    }
	 
}
