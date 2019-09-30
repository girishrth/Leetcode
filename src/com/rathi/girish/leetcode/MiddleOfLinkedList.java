package com.rathi.girish.leetcode;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode.next.next.next.next = new ListNode(5);
		
		System.out.println((middleNode(listNode)).val);
	}
	
	public static ListNode middleNode(ListNode head) {
        if(head == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
        	fast = fast.next.next;
        	slow = slow.next;
        }
        
        return slow;
    }

}

/*
 * class ListNode { int val; ListNode next;
 * 
 * ListNode(int x) { val = x; } }
 */