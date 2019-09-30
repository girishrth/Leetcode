package com.rathi.girish.leetcode;

public class ToLowerCase {

	public static void main(String[] args) {
		System.out.println(toLowerCase("Hello"));
		System.out.println(toLowerCase("here"));
		System.out.println(toLowerCase("LOVELY"));
	}
	
	public static String toLowerCase(String str) {
		
		String result = "";
		for(char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				result = result + (char)(c + 32);
			}else {
				result += c;
			}
		}
		
		return result;
    }

}
