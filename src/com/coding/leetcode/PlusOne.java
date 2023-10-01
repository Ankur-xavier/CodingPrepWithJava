package com.coding.leetcode;

//Q:https://leetcode.com/problems/plus-one/
public class PlusOne {

	public static void main(String[] args) {
		int [] digits= {9};
		int result[] =plusOne(digits);
		for(int r : result)
		System.out.println(r);

	}
	   public static int[] plusOne(int[] digits) {
	  for(int i=digits.length-1;i>=0;i--)
	  {
		  
		  if(digits[i]<9)
		  {
			  digits[i]++;
			  return digits;
		  }
		  digits[i]=0;
		  
		  
	  }
	  digits=new int[digits.length+1];
	  digits[0]=1;
	  return digits;
     
}}
