package com.coding.JavaBeginner;

import java.util.Scanner;
//Q6: Find Ncr & Npr

public class PermutationCombination {

	public static void main(String[] args) {
		
		int n,r;
		double permutation,combination=0;
		System.out.println("Enter the n and r");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		r=sc.nextInt();
		
		 permutation=getPerm( n,r);
		 combination=getComb( n,r);
       
		 System.out.println("permutation is :" + permutation + "Combination is :" + combination);
	}
      
	private static double fact(double n)
	{ double fact =1;
	 while(n>0)
	 {
		 
		 fact=fact*n;
		 n--;
		 	 }
					
		return fact;
	}
	
	
	private static double getComb(int n, int r) {
		double comb=fact(n)/(fact(n-r)*fact(r));
		return comb;
	}

	private static double getPerm(int n, int r) {
		double perm=fact(n)/fact(n-r);
		return perm;
		
	}

}
