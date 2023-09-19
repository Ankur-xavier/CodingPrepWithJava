package com.coding.JavaStarter;

import java.util.Scanner;

//Q5:Take 2 numbers as input and print the largest number.

public class MaxofTwo {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1>n2)
			System.out.println("max is n1 :"+n1);
		else
			System.out.println("max is n2 :"+n2);
		
	}

}
