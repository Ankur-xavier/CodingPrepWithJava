package com.coding.JavaBasics;

import java.util.Scanner;

//Q3: Take a number as input and print the multiplication table for it.

public class MultiplicationTable {

	public static void main(String[] args) {
		int number=0;
		System.out.print("Enter the number");
		Scanner sc = new Scanner(System.in);
		number= sc.nextInt();
		
		System.out.println("Enter the factor");
		int factor = sc.nextInt();
		
		for (int i =1; i<=factor; i++)
		{
			System.out.println(number + "x" + i +"=" + (number*i));
						
		}
	}

}
