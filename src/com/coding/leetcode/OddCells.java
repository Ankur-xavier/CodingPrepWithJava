package com.coding.leetcode;

//Q:https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class OddCells {

	public static void main(String[] args) {
		int m=2;
		int n=3;
		int indices[][]= {{0,1},{1,1}};
		System.out.println(oddCells(m,n,indices));
		

	}

	public static int oddCells(int m, int n, int[][] indices) {
		int arr[][] = new int[m][n];

		for (int i = 0; i < indices.length; i++) {
			int r1 = indices[i][0];
			int c1 = indices[i][1];

			for (int j = 0; j < m; j++) {
				arr[j][c1]++;
			}
			for (int j = 0; j < n; j++) {
				arr[r1][j]++;
			}

		}
		
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] % 2 != 0) {
					count++;
				}
			}
		}

		return count;
	}
}
