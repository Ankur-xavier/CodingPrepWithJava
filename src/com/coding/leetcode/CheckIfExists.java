package com.coding.leetcode;

//Q:https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class CheckIfExists {

	public static void main(String[] args) {
		
		int arr[]= {10,2,5,3};
		System.out.println(checkIfExist(arr));

	}
    public static boolean checkIfExist(int[] arr) {
        for(int i =0;i<arr.length;i++)
        for(int j=0;j<arr.length;j++)
        if(i != j&&arr[i]==2*arr[j])
        return true;
        return false;   
       }
}
