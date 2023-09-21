package com.coding.leetcode;

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
//Q:Subtract the Product and Sum of Digits of an Integer




public class ProductSum {

	public static void main(String[] args) {
		int n =234;
		int result =0;
		int product =getProduct(n);
		int sum=getSum(n);
			
        result=product -sum;
        System.out.println(result );
	}

	private static int getSum(int n) {
		int s=0;
		while(n>0)
		{
			int digit = n%10;
			s+=digit;
			n/=10;
		
		}
				
		
		return s;
	}

	private static int getProduct(int n) {
		int s=1;
		while(n>0)
		{
			int digit = n%10;
			s*=digit;
			n/=10;
		
		}
		
				
		
		return s;
	}

}
