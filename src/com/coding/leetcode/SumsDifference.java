package com.coding.leetcode;

//Q:https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/

public class SumsDifference {

	public static void main(String[] args) {
		int n=10;
		int m=3;
		System.out.println(differenceOfSums(n,m));
	}
	
	public static int differenceOfSums(int n, int m) {
    int sum=0;
    for(int i=1;i<=n;i++ )
    {
    	if(i%m!=0)
    		sum=sum+i;
    	else
    		sum=sum-i;
    }
    
    return sum;
    }
}
