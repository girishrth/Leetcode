package com.rathi.girish.leetcode;

public class ReverseString {

	public static void main(String[] args) {
		reverseString(new char[] {'h','e','l','l','o'});
	}
	
	public static void reverseString(char[] s) {
        int leftIndex = 0;
        int rightIndex = s.length -1;
        while(leftIndex < rightIndex) {
        	char temp = s[leftIndex];
        	s[leftIndex++] = s[rightIndex];
        	s[rightIndex--] = temp;
        }
    }

}
