package com.coding.JavaBeginner;

import java.util.Scanner;

//Q2: Calculate Average Of N Numbers

public class Average {

	public static void main(String[] args) {
		int sum=0;
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter a number");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			
		}
		double average = sum/arr.length;
		System.out.println("average is " + average);
	}

}
