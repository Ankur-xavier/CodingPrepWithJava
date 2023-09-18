package com.coding.JavaBasics;

import java.util.Scanner;

//Q1:Input a year and find whether it is a leap year or not.

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year :");
		int year=sc.nextInt();
		
		if(year%4 ==0 )
		{   
			if(year %400==0 || year%100 !=0)
			System.out.println("this is leap year");
			else
			System.out.println("Not a leap year");
		
		}
		else
			System.out.println("Not a leap year");

	}

}
