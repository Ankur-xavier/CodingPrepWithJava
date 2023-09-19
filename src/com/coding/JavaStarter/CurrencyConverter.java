package com.coding.JavaStarter;

import java.util.Scanner;

//Q6:Input currency in rupees and output in USD.

public class CurrencyConverter {

	public static void main(String[] args) {
		float inr;
		
		Scanner sc = new Scanner(System.in);
		inr=sc.nextFloat();
		double usd = inr*0.019;
		System.out.println("Rs" +inr +"this is equal to :" +usd+"$");
	}

}
