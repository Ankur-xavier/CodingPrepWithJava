package com.coding.JavaStarter;

import java.util.Scanner;

//Q10: Input a number and print all the factors of that number.

public class Factors {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		n=sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
			
		}

	}

}
