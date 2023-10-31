package com.coding.leetcode.contest;

import java.util.Arrays;
import java.util.Comparator;

public class SortIntegerByBit2 {

	public static void main(String[] args) {
		 int[] arr= {0,1,2,3,4,5,6,7,8};
		 int res[]= sortByBits(arr);
		 for(int r : res)
			 System.out.println(r);

		}
    public static int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed().sorted(Comparator.comparing(x -> Integer.toBinaryString((Integer) x).replaceAll("[^1]", "").length()).thenComparing(x -> (Integer) x)).mapToInt(x -> x).toArray();
    }
}
