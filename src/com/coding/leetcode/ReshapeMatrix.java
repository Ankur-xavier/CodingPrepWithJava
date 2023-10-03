package com.coding.leetcode;

//Q:https://leetcode.com/problems/reshape-the-matrix/
public class ReshapeMatrix {

	public static void main(String[] args) {
		int mat[][]= {{1,2},{3,4}};
		int r=1;
		int c=4;
		int result[][]=matrixReshape(mat,r,c);
		for(int res[] : result)
			for(int r1 : res)
				System.out.println(r1);
					
		}

	
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int cols=mat[0].length;
        if((rows*cols)!=(r*c))
        return mat;
        int [][]answer =new int [r][c];
        int row_cnt=0;
        int col_cnt=0;
        for(int i=0;i<rows;i++)
        for(int j=0;j<cols;j++)
        { answer[row_cnt][col_cnt]=mat[i][j];
          col_cnt++;

          if(col_cnt==c)
          { col_cnt=0;
           row_cnt++;

          }
        }
      return answer;
     }
}
