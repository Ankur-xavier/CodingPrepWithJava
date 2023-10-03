package com.coding.leetcode;

//Q:https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class MinimumCostChips {

	public static void main(String[] args) {
		int position[]= {2,2,2,3,3,};
		System.out.println(minCostToMoveChips(position));
		

	}
    public static int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;
        for(int p:position)
        {
            if(p%2==0)
            even++;
            else
             odd++;
        } 
     return Math.min(even,odd);
     }

}
