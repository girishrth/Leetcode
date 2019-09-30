package com.rathi.girish.leetcode;

public class FibonacciNumber {

	public static void main(String[] args) {
		System.out.println(fib(13));
	}

	/*
	 * public static int fib(int N) { if(N == 0) return 0; if(N == 1) return 1;
	 * 
	 * return fib(N - 1) + fib(N - 2); }
	 */
	
	public static int fib(int N) {
		if(N == 0) return 0; 
		if(N == 1) return 1;
		
		int a = 0;
		int b = 1;
		int sum = a + b;
		
		while(N > 1) {
			sum = a + b;
			a = b;
			b = sum;
			
			N--;
		}
		
		return sum;
	}
}
