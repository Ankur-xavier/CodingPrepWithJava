package com.coding.leetcode;

import java.util.HashSet;

//Q:https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class PangramSentence {

	public static void main(String[] args) {
		String sentence ="thequickbrownfoxjumpsoerthelazydog";
		System.out.println(checkIfPangram(sentence));

	}
	
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> charset = new HashSet<>();
        for(char ch :sentence.toCharArray())
        {
            charset.add(ch);

        }
        boolean isPangram=true;
        for(char c='a';c<='z';c++)
        {
           if(!charset.contains(c))
           {
                isPangram=false;
                break;

           }

        }
        return isPangram;
    }

}
