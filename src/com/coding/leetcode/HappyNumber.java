package com.coding.leetcode;

import java.util.HashSet;

//Q:https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&envId=top-interview-150

public class HappyNumber {

	public static void main(String[] args) {
		int n=2;
		System.out.println(ishappy(n));
		
		
		
		
	}

  public static boolean ishappy(int n)

  {  
	  if(n==1)
		  return true;
	  
	  
	  
	  int happynumber=countdigit(n);
	  HashSet<Integer> seenNumbers = new HashSet<>();
	  while (happynumber != 1 && !seenNumbers.contains(happynumber)) {
	        seenNumbers.add(happynumber);
	        happynumber = countdigit(happynumber);
	    }
	  if (happynumber == 1)
      return true;
	  else
		  return false;
  }
  
public static int countdigit(int n)
{      int digit=0;
        int sum=0;
	 while(n>0)
     {
  	    digit=n%10;
			sum+=(int)Math.pow(digit,2);
			
			n/=10;
  	     	   
     }
	 return sum;}
}
  
  
  





