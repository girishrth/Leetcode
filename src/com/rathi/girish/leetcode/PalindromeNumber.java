package com.rathi.girish.leetcode;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Palindrome Number
		System.out.println(isPalindrome(1221));
		//Negative Palindrome Number
		System.out.println(isPalindrome(-1221));
		//Non Palindrome Number
		System.out.println(isPalindrome(122321));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		int div = 1;
		while (x / div >= 10) {
			div *= 10;
		}

		while (x != 0) {
			int rightDigit = x % 10;
			int leftDigit = x / div;

			if (leftDigit != rightDigit)
				return false;

			x = (x % div) / 10;
			div /= 100;
		}

		return true;
	}
}
