package com.coding.JavaBeginner;

import java.util.Scanner;

//Q7:Find if a number is palindrome or not

public class PalindromeNumber {

	public static void main(String[] args) {
		int n ,rev=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number");
        n=sc.nextInt();
        
        rev=getReverse(n);
        if(rev==n)
        	System.out.println("Number is palidrome");
        else
        	System.out.println("Not a palindrome number");
	}

	private static int getReverse(int n) {
		int digit =0,rev=0;
		while(n>0)
		{
			digit=n%10;
			 rev=rev*10+digit;
			n/=10;			
			
		}	
			
		return rev;
	}

}
