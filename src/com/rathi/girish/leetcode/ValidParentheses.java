package com.rathi.girish.leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("{[]}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		
	}

	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()) {
        	if(c == '(' || c == '{' || c == '[') {
        		stack.push(c);
        	}else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
        		stack.pop();
        	}else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
        		stack.pop();
        	}else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
        		stack.pop();
        	}else {
        		return false;
        	}
        }
        
        return  stack.isEmpty();
    }
}
