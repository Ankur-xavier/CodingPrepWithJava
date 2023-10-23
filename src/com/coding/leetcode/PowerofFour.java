package com.coding.leetcode;

//Q:https://leetcode.com/problems/power-of-four/description/
public class PowerofFour {

	public static void main(String[] args) {
	int n=162;
	System.out.println(isPowerOfFour(n));

	}
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
              return false;
          }
          while (n > 1) {
              if (n % 4 != 0) {
                  return false;
              }
              n /= 4;
          }
          return true;
      }
}
