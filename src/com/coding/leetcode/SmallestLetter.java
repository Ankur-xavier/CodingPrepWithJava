package com.coding.leetcode;
//Q:https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {

	public static void main(String[] args) {
		char letters[]= {'a','b','f','g'};
		char target='c';
		System.out.println(nextGreatestLetter(letters,target));
	}
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        
        while(start<=end)
        {
         int mid=(start+end)/2;
         if(letters[mid]>target)
        
           end=mid-1;
         else
         start=mid+1;

        }
        return letters[start%letters.length];
    }
}
