package com.coding.JavaStarter;

import java.util.Scanner;

//Q4: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use case conditions)

public class SwitchExample {

	public static void main(String[] args) {
	
		char ch;
		int num1,num2,value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Enter the operation(+,-,*,/,%)");
		ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case '+' :     value=num1+num2;
			           System.out.println("Addtion ="+ value);
			          
			         break;
		   
		case '-' :     value=num1-num2;
                      System.out.println("Addtion ="+ value);
        
                       break;
		case '%' :     value=num1%num2;
        System.out.println("Addtion ="+ value);
       
      break;
		
		case '*' :     value=num1*num2;
        System.out.println("Addtion ="+ value);
       
      break;
		case '/' :     value=num1/num2;
        System.out.println("Addtion ="+ value);
       
      break;
		
      default : System.out.println("enter any valid symbol");
      break;
      
		}
		
		

	}

}
