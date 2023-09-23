package com.coding.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q:https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

public class GreatestCandie {

	public static void main(String[] args) {
		int candies[]= {4,2,1,1,2};
		int extraCandies=1;
		List<Boolean> ans=kidsWithCandies(candies,extraCandies);
		for(boolean r :ans)
			System.out.println(r);

	}
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        List<Boolean>result= new ArrayList<Boolean>();
	        int max = getMax(candies);
		   
	        for(int i =0;i<candies.length;i++)
	        {
	        	if((candies[i]+extraCandies)>=max) {
	        		result.add(true);
	        		
	        	}	        	
	        	else
	        		result.add(false);
	        }
	        
	        
		 
		 return result;
	    }
	 
    public static int getMax(int arr[])
    {
    	int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    	
    	
    }
}
