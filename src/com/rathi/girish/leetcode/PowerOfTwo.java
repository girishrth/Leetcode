package com.rathi.girish.leetcode;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwo(218));
	}
	
	public static boolean isPowerOfTwo(int n) {
		long i = 1;
		while(i < n) {
			i *= 2;
		}
		
		return i == n;
	}

}
