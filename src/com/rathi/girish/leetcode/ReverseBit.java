package com.rathi.girish.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseBit {

	public static void main(String[] args) {
		System.out.println(reverseBits(20));
	}

	
	 public static int reverseBits(int n) {
	   int res = 0;
	   List<Integer> l = new ArrayList<Integer>();
	   int time = 32;
	   
	   while(time != 0) {
		   int t = n & 1;
		   l.add(t);
		   n >>= 1;
		   time--;
	   }
	   	
	   for(int i = 0 ; i < l.size() ; i++) {
		   res <<= 1;
		   res = res | l.get(i);
	   }
	
	   return res;
	 }
}
