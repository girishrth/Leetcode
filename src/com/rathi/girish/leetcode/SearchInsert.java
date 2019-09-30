package com.rathi.girish.leetcode;

public class SearchInsert {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[]{1,3,5,6} , 5));
		System.out.println(searchInsert(new int[]{1,3,5,6} , 2));
		System.out.println(searchInsert(new int[]{1,3,5,6} , 7));
		System.out.println(searchInsert(new int[]{1,3,5,6} , 0));
	}

	public static int searchInsert(int[] nums, int target) {
        
		int start = 0;
        int end = nums.length - 1;
        
        if (nums[end] < target) {
            return end + 1;
        } else if (nums[start] >= target) {
            return start;
        }
		
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
