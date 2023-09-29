package com.coding.leetcode;

//Q:https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class MatrixRotation {

	public static void main(String[] args) {
		int mat[][]= {{0,1},{1,0}};
		int target[][]= {{1,0},{0,1}};
        System.out.println(findRotation(mat,target)); 
        
	}
	
    public static boolean findRotation(int[][] mat, int[][] target) {
       
    for(int i=0;i<4;i++)
    {
    	if(check(mat,target))
    		return true;
    	rotate(mat);
    }
    return false;	
        	
    }
	private static boolean check(int[][] mat, int[][] target) {
		for(int i=0;i<mat.length;i++)
		{  
			for(int j=0;j<mat[0].length;j++)
				{if(mat[i][j]!=target[i][j])
					return false;
					
				}
				}
		
		return true;
	}

	private static void rotate(int[][] mat) {
		transpose(mat);
		for(int i=0;i<mat.length;i++)
		{ int left=0;
		  int right =mat.length-1;
		  while(left<right)
		  {
			  int temp=mat[i][left];
			  mat[i][left]=mat[i][right];
			  mat[i][right]=temp;
			  left++;
			  right--; 
		  }}
			
	}

	private static void transpose(int[][] mat) {
		for(int i=0;i<mat.length;i++)
			for(int j=0;j<mat[0].length;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
				
			}
		
	}
    

	
	

}
