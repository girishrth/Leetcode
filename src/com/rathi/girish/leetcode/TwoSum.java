package com.rathi.girish.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// Match test case
		int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println(Arrays.toString(result));
		// Unmatch test case
		int[] result1 = twoSum(new int[] { 2, 5, 11, 15 }, 9);
		System.out.println(Arrays.toString(result1));
		// Empty Array test case
		int[] result2 = twoSum(new int[] {}, 9);
		System.out.println(Arrays.toString(result2));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				result[0] = map.get(diff);
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}
}
