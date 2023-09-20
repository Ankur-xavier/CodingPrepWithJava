package com.coding.JavaBeginner;

import java.util.Scanner;

// Q3:Calculate Discount Of Product
public class CalcDiscount {

	public static void main(String[] args) {
		int cp,sp;
		float discount=0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the cost price  ");
		cp=sc.nextInt();
		System.out.println("enter the sell price  ");
		sp=sc.nextInt();
		discount=cp-sp;
		System.out.println("Discount is : "+discount + "discount % is "+(discount/cp)*100 +"%");
	}

}
