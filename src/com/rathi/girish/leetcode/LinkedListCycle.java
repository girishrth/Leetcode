package com.rathi.girish.leetcode;

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		//listNode.next.next.next = listNode.next;
		System.out.println(hasCycle(listNode));
	}
	
	public static boolean hasCycle(ListNode head) {
		if(head == null) return false;
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while (slow != fast) {
			if(fast == null || fast.next == null) return false;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return true;
	}

}

/*
 * class ListNode { int val; ListNode next;
 * 
 * ListNode(int x) { val = x; } }
 */