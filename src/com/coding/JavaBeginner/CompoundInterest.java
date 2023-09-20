package com.coding.JavaBeginner;
//Q5:Compound Interest Java Program


public class CompoundInterest {

	public static void main(String[] args) {
		int principle=10000,time=5,n=1;
        double CI =0,rate=0.10;
        CI= (principle* Math.pow((1+rate/n), n*time)) - principle;
        	System.out.println(CI);	
	}

}
