package com.coding.leetcode;

//Q:https://leetcode.com/problems/flipping-an-image/
public class FlipImage {

	public static void main(String[] args) {
		int image[][]= {{1,1,0},{1,0,1},{0,0,0}};
		int result[][]=flipAndInvertImage(image);
		for(int r[] : result)
			for(int ans : r)
				System.out.println(ans);

	}
    public  static int[][] flipAndInvertImage(int[][] image) {
		for(int i=0;i<image.length;i++)
			reverse(image[i]);
		    	
		return image;
	}

	public static void reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		
		}
		flip(arr);
	}

	public static void flip(int[] arr) {
		for(int i=0;i<arr.length;i++)
			arr[i] = (arr[i] == 0) ? 1 : 0;
		
	}
}
