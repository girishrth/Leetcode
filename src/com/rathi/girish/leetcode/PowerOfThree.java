package com.rathi.girish.leetcode;

public class PowerOfThree {

	public static void main(String[] args) {
		System.out.println(isPowerOThree(27));
		System.out.println(isPowerOThree(45));
	}
	
	public static boolean isPowerOThree(int n) {
		long i = 1;
		while(i < n) {
			i *= 3;
		}
		
		return i == n;
	}
}
