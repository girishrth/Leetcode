package com.rathi.girish.leetcode;

import java.util.Stack;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		printList(reverseList(listNode));
	}
	
	public static void printList(ListNode listNode) {
		while(listNode != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
        if(head == null) return head;
        
        Stack<ListNode> stack = new Stack<ListNode>();
        while(head != null) {
        	stack.push(head);
        	head = head.next;
        }
        
        ListNode dummy = new ListNode(0);
        head = dummy;
        while(!stack.isEmpty()) {
        	ListNode current = stack.pop();
        	head.next = new ListNode(current.val);
        	head = head.next;
        }
        
        return dummy.next;
    }

}

/*
 * class ListNode { int val; ListNode next;
 * 
 * ListNode(int x) { val = x; } }
 */
