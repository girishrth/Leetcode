package com.rathi.girish.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MisingNumber {

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {0 , 2 , 1}));
	}
	
	public static int missingNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			set.add(i);
		}
		
		for(int i = 0 ; i <= nums.length ; i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		
		return -1;
	}

}
