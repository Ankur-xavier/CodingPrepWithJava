package com.coding.JavaBasics;

import java.util.Scanner;

// Q4 :Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

public class MiscSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=0;
	    while(true)
	    {
	      System.out.println("Enter the number (or x to exit)");
	      if (sc.hasNextInt()) {
              n = sc.nextInt();
              sum += n;
          } else {
              String input = sc.next();
              if (input.equals("x")) {
                  break;
              }
          }
      }

      System.out.println("Sum is " + sum);
  }}