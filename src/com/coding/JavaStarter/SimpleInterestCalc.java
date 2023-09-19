package com.coding.JavaStarter;

import java.util.Scanner;

//Q3:Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class SimpleInterestCalc {

	public static void main(String[] args) {
	 double P,SI;
	 float T,R;
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter principle,Time and Rate of intereset:");
	 P=sc.nextDouble();
	 T=sc.nextFloat();
	 R=sc.nextFloat();
	 SI= P+(P*R*T)/100;
	 System.out.println("Simple interest for the given values are " + SI);
   			 

	}

}
