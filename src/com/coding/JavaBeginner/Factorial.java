package com.coding.JavaBeginner;

import java.util.Scanner;

//Q1 :Factorial Program In Java

public class Factorial {

	public static void main(String[] args) {
	
		int n=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		n=sc.nextInt();
		while(n>0)
		{
				
			fact=fact*n;
			n--;			
			
		}
     System.out.println(fact);
	}

}
