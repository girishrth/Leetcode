package com.rathi.girish.leetcode;

public class RemoveDuplicatesFromSortedLinkedList {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(2);
		printList(deleteDuplicates(listNode));
	}
	
	public static void printList(ListNode listNode) {
		while(listNode != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        
        ListNode p = head;
        while(head != null && head.next != null) {
        	if(head.val == head.next.val) {
        		head.next = head.next.next;
        	}else {
        		head = head.next;
        	}
        }
        return p;
    }
	
}

/*
 * class ListNode { int val; ListNode next;
 * 
 * ListNode(int x) { val = x; } }
 */