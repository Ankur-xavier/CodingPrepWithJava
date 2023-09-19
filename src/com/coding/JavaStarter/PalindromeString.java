package com.coding.JavaStarter;

import java.util.Scanner;

//Q8 :To find out whether the given String is Palindrome or not.

public class PalindromeString {

	public static void main(String[] args) {
		String str="";
	    String rev ="";
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the String");
	    str=sc.next();
	    char[] ch=str.toCharArray();
	    
	    for(int i=ch.length -1;i>=0 ; i--)
	    {
	    	
	    	rev+=ch[i];
	    	
	    }
	    if(str.equals(rev))
	    System.out.println("String is palindrome");
	    else
	    	System.out.println("String is not palindrome");

   
	}

}
