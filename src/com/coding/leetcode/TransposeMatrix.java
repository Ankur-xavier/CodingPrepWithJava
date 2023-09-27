package com.coding.leetcode;

//Q:https://leetcode.com/problems/transpose-matrix/

public class TransposeMatrix {

	public static void main(String[] args) {
		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int result[][] =transpose(matrix);
		for(int res[] :result)
		for(int r: res)
			System.out.println(r);
		

	}
    public static int[][] transpose(int[][] matrix) {
        int result[][] = new int[matrix[0].length][matrix.length];
        for(int i=0;i<result[0].length;i++)
        {
            for(int j=0;j<result.length;j++)
            result[j][i]=matrix[i][j];
        }  
        return result;
      }
}
