package com.coding.leetcode;

//Q:https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {

	public static void main(String[] args) {
		int accounts[][] = {{1,5},{7,3},{3,5} };
        System.out.println(maximumWealth(accounts));
	}
	
    public static int maximumWealth(int[][] accounts) {
        
        int wealth[]=new int [accounts.length];
        for(int i =0 ;i<accounts.length;i++)
        { 
        	int sum=0;
            for(int j=0;j<accounts[i].length;j++)
             {
               sum=sum+accounts[i][j];    
              
             }
           
             wealth[i]=sum;
             
        }
        
        int max = wealth[0]; 

        for (int i = 1; i < wealth.length; i++) {
            if (wealth[i] > max) {
                max = wealth[i];
            }
        }
        
        
        return max;   
       }

}
