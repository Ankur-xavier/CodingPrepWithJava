package com.coding.leetcode.Medium;

//Q:https://leetcode.com/problems/search-a-2d-matrix/description/
public class Searchin2D {

	public static void main(String[] args) {
		int [][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=13;
		System.out.println(searchMatrix(matrix,target));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int left = 0, right = m * n - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int mid_val = matrix[mid / n][mid % n];

			if (mid_val == target)
				return true;
			else if (mid_val < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return false;
	}
}
