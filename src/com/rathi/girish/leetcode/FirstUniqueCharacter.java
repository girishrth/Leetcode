package com.rathi.girish.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(firstUniqChar("GeekGeek"));
	}
	
	public static int firstUniqChar(String s) {
		Map<Character , Integer> map = new HashMap<Character , Integer>();
		for(int i = 0 ; i < s.length() ; i++) {
			char current = s.charAt(i);
			if(map.containsKey(current)) {
				map.put(current, -1);
			}else {
				map.put(current , i);
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(char c : map.keySet()) {
			if(map.get(c) > -1 && map.get(c) < min) {
				min = map.get(c);
			}
		}
		
		return min == Integer.MAX_VALUE ? -1 : min;
	}

}
