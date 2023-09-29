package com.coding.leetcode.Medium;

//Q:https://leetcode.com/problems/the-kth-factor-of-n/

public class KfactorOfN {

	public static void main(String[] args) {
		int n=15;
		int k=3;
		System.out.println(kthFactor(n,k));

	}
    public static int kthFactor(int n, int k) {
        for(int i = 1; i < Math.sqrt(n); i ++) 
        if(n % i == 0 && --k == 0)
        return i;

        for(int i = (int)Math.sqrt(n); i >= 1; -- i)
        if(n % (n / i) == 0 && -- k == 0)
        return n / i;

      return - 1;
      }

}
