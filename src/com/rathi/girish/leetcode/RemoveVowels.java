package com.rathi.girish.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

	public static void main(String[] args) {
		System.out.println(removeVowels("leetcodeisacommunityforcoders"));
		System.out.println(removeVowels("aeiou"));
	}
	
	public static String removeVowels(String s) {
		Set<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		StringBuilder result = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(!vowels.contains(c)) {
				result.append(c);
			}
		}
		
		return result.toString();
	}

}
