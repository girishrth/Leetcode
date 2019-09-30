package com.rathi.girish.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {2 , 2 , 1}));
		System.out.println(singleNumber(new int[] {4 , 1 , 2 , 1 , 2}));
	}
	
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums) {
        	if(set.contains(i)) {
        		set.remove(i);
        	}else {
        		set.add(i);
        	}
        }
        
        for(int i : set) {
        	return i;
        }
        
        return -1;
    }

}
