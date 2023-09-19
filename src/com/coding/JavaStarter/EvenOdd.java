package com.coding.JavaStarter;

import java.util.Scanner;

//Q1: Write a program to print whether a number is even or odd, also take input from the user.

public class EvenOdd {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		if(num%2==0)
			System.out.println("even number");
		else
			System.out.println("Odd number");

	}

}
