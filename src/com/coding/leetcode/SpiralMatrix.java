package com.coding.leetcode;

import java.util.ArrayList;
import java.util.List;

//Q:https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer>result=spiralOrder(matrix);
		for(int i :result)
			System.out.println(i);

	}
    public static List<Integer> spiralOrder(int[][] matrix) {
        int left=0,top=0,right=matrix[0].length-1,bottom=matrix.length-1;
        List<Integer>answer=new ArrayList<Integer>();
        while(left<=right && top<=bottom)
        {
          for(int i=left;i<=right;i++)
          answer.add(matrix[top][i]);
          top++;
          for(int i=top;i<=bottom;i++)
          answer.add(matrix[i][right]);
          right--;
          
          if(top<=bottom){
          for(int i=right;i>=left;i--)
          answer.add(matrix[bottom][i]);
          bottom--;
          }
          if(left<=right)
          {
          for(int i=bottom;i>=top;i--)
          answer.add(matrix[i][left]);
          left++;
          }

        }   
        return answer;
       }
}
