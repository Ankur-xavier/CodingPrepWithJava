package com.coding.JavaStarter;

import java.util.Scanner;

//Q9:To find Armstrong Number between two given number.
public class ArmStrongNumber {
	 public static void main(String[] args) {
	        int lowerLimit = 100; 
	        int upperLimit = 1000;

	        System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are:");
	        for (int i = lowerLimit; i <= upperLimit; i++) {
	            if (isArmstrongNumber(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    public static boolean isArmstrongNumber(int num) {
	        int originalNum = num;
	        int numDigits = String.valueOf(num).length();
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, numDigits);
	            num /= 10;
	        }

	        return sum == originalNum;
	    }
	
}
