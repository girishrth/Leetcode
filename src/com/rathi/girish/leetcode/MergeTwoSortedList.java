package com.rathi.girish.leetcode;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		listNode1.next = new ListNode(2);
		listNode1.next.next = new ListNode(3);
		
		ListNode listNode2 = new ListNode(5);
		listNode2.next = new ListNode(6);
		listNode2.next.next = new ListNode(7);
		
		printList(mergeTwoLists(listNode1 , listNode2));
	}
	
	public static void printList(ListNode listNode) {
		while(listNode != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
	
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		
		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				dummy.next = l1;
				l1 = l1.next;
			}else{
				dummy.next = l2;
				l2 = l2.next;
			}
			
			dummy = dummy.next;
		}
		
		if(l1 != null) {
			dummy.next = l1;
		}else {
			dummy.next = l2;
		}
		
		return head.next;
    }
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}