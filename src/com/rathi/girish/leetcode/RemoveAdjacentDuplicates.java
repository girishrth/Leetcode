package com.rathi.girish.leetcode;

		public class RemoveAdjacentDuplicates {
		
			public static void main(String[] args) {
				System.out.println(removeDuplicates("azxxzy"));
			}
			
			 public static String removeDuplicates(String S) {
				 char[] stack = new char[S.length()];
				 
				 int i = 0;
				 
				 for(int j = 0 ; j < S.length() ; j++) {
					 
					 char currentChar = S.charAt(j);
					 if(i > 0 && stack[i-1] == currentChar) {
						 i--;
					 }else {
						 stack[i] = currentChar;
						 i++;
					 }
					 
				 }
				 return new String(stack , 0 , i);
			 }
		
		}
