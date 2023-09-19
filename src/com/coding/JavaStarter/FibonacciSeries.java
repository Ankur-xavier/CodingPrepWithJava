package com.coding.JavaStarter;

import java.util.Scanner;

//Q7:To calculate Fibonacci Series up to n numbers. 

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number upto which you want the fibonacci series");
		int input = sc.nextInt();
		System.out.print(num1 + " " + num2 + " "); // Print the first two numbers

        for (int i = 2; i < input; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
	
		
	}

}
