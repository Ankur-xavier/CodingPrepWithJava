package com.coding.leetcode;

//Q:https://leetcode.com/problems/find-the-highest-altitude/

public class HighestAltitude {

	public static void main(String[] args) {
		int []gain = {-5,1,5,0,-7};
		System.out.println(largestAltitude(gain));

	}
    public static int largestAltitude(int[] gain) {
        int max=0;
 		int altitude[]=new int[gain.length+1];
 		altitude[0]=0;
 		for(int i=0;i<gain.length;i++)
 		{
 			altitude[i+1]=altitude[i]+gain[i];
 		}
 		
 		for(int a : altitude)
 			max=Math.max(max, a);
 				
 		return max;
 	} 
}
