package com.coding.JavaBeginner;
//Q8: find the lcm of two number

public class CalcLCM {

	public static void main(String[] args) {
		int num1=16,num2=18;
		int lcm=Math.abs(num1*num2)/getLCM(num1,num2);
		  System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

	}

	private static int getLCM(int num1, int num2) {
		while(num1!=num2)
		{
			if(num1>num2)
				num1=num1-num2;
			else
				num2=num2-num1;
			
			
		}
		return num1;
	}

}
