package com.coding.JavaBasics;

import java.util.Scanner;

//Q2:Take two numbers and print the sum of both.

public class SumOfNumber {

	public static void main(String[] args) {
		int num1,num2;
		System.out.print("Enter two number :");
		Scanner sc = new Scanner(System.in);
		num1= sc.nextInt();
		num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("sum is : " + sum);
		
	

	}

}
