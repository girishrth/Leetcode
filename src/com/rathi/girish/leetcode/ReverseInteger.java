package com.rathi.girish.leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//Positive Number
		System.out.println(reverse(123));
		//Negative Number
		System.out.println(reverse(-123));
		//Positive Number ending with zero
		System.out.println(reverse(120));
		//Integer Max Value
		System.out.println(reverse(2147483647));
	}
	
	 public static int reverse(int x) {
	 	 boolean positive = true;
		 if(x < 0) {
			 positive =  false;
			 x = x * -1;
		 }
		 long result = 0;
		 while(x > 0) {
			 result = (result * 10) + (x % 10);
			 x = x / 10;
		 }
		 if(result > Integer.MAX_VALUE) {
			 return 0;
		 }
		 return positive ? (int)result : (int)(result * -1);
	 }
}
