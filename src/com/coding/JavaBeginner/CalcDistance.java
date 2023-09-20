package com.coding.JavaBeginner;
//Q4: Calculate Distance Between Two Points


public class CalcDistance {

	public static void main(String[] args) {
		int x1=1,x2=1,y1=2,y2=5;
		double distance=0;
		
		distance = Math.sqrt(Math.pow((x2-x1), 2) +Math.pow((y2-y1), 2));
        
		System.out.println(distance);
	}

}
