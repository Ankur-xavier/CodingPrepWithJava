package com.coding.JavaStarter;

import java.util.Scanner;

//Q2 : Take name as input and print a greeting message for that particular name.

public class PrintName {

	public static void main(String[] args) {
		String name ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Greetings Mr." +name);
        sc.close();
	}

}
