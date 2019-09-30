package com.rathi.girish;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] {2, 0, 0, 2, 3, 3, 0, 0, 1, 1})));
	}
	
	 public static int[] removeDuplicates(int[] arr) {
		 int[] stack = new int[arr.length];
		 
		 int i = 0;
		 
		 for(int j = 0 ; j < arr.length ; j++) {
			 
			 int currentNumber = arr[j];
			 if(i > 0 && stack[i-1] == currentNumber) {
				 i--;
			 }else {
				 stack[i] = currentNumber;
				 i++;
			 }
			 
		 }
		 return Arrays.copyOfRange(stack , 0 , i);
	 }

}
