package com.rathi.girish.leetcode;

public class PowerOfFour {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16));
		System.out.println(isPowerOfFour(218));
	}
	
	public static boolean isPowerOfFour(int n) {
		long i = 1;
		while(i < n) {
			i *= 4;
		}
		
		return i == n;
	}

}
