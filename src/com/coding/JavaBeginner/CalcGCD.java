package com.coding.JavaBeginner;

//Q9: find the gcd of two number

public class CalcGCD {

	public static void main(String[] args) {
		int num1=24,num2=8;
		int gcd=getGCD(num1,num2);
		  System.out.println("LCM of " + num1 + " and " + num2 + " is: " + gcd);

	}

	private static int getGCD(int num1, int num2) {
		while(num2!=0)
		{
			int temp =num2;
		num2=num1%num2;
		num1=temp;
				
	}
		return num1;}

}
