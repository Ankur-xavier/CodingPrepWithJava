package com.coding.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Q:https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public List<Integer> luckyNumbers (int[][] matrix) {
List<Integer>lis1 = new ArrayList<Integer>();
	     List<Integer>lis2 = new ArrayList<Integer>();
	     int row=matrix.length; //3
	     int col=matrix[0].length;//3
	     
	     //getting the minimum from each row
	     for(int i=0;i<row;i++)
	     {   int min=matrix[i][0];
	    	 for(int j=1;j<col;j++)
	    	 {
	    		 if(matrix[i][j]<min)
	    			 min=matrix[i][j];
	    	 }
	    	 
	    	 lis1.add(min);
	     }
	     
	     //getting max of each column
	     for(int j=0;j<col;j++)
	     { int max=matrix[0][j];
	        for(int i=1;i<row;i++)
	        {
	        	
	        	if(matrix[i][j]>max)
	        		max=matrix[i][j];
	        		        	
	        }
	    	 lis2.add(max);
	    	 
	    	  	 
	     }
	     Set<Integer> set1 = new HashSet<>(lis1);
	     Set<Integer> commonElements = new HashSet<>(lis2);
	     commonElements.retainAll(set1);

	     List<Integer> commonElementsList = new ArrayList<>(commonElements);
	     return commonElementsList;
	    } 
}
